package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1260_DFS와BFS_Matrix {

    static int N; // 정점의 개수 N(1 ≤ N ≤ 1,000)
    static int M; // 간선의 개수 M(1 ≤ M ≤ 10,000)
    static int V; // 탐색을 시작할 정점의 번호 V

    static boolean[][] adjMatrix;
    static boolean[] isVisited;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        isVisited = new boolean[N + 1]; // 0은 더미


        // 연결 행렬
        adjMatrix = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adjMatrix[from][to] = true;
            adjMatrix[to][from] = true;
        }

        dfs(V);
        sb.append("\n");

        Arrays.fill(isVisited, false);
        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int v) {
        isVisited[v] = true;
        sb.append(v).append(" ");

        for (int i = 1; i <= N; i++) {
            if ( !adjMatrix[v][i] || isVisited[i]) continue; // 간선이 없거나, 방문을 했으면 패쓰!
            dfs(i); // 재귀
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new ArrayDeque<>();

        // 시작 정점 넣고, 방문 체크
        queue.offer(v);
        isVisited[v] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp).append(" ");

            for (int i = 1; i <= N; i++) {
                if ( !adjMatrix[temp][i] || isVisited[i] ) continue; // 간선이 없거나, 방문을 했으면 패쓰!

                queue.offer(i);
                isVisited[i] = true;
            }
        }
    }
}
