package BOJ;

import java.io.*;
import java.util.*;

public class BJ_1260_DFS와BFS_List {

    static int N; // 정점의 개수 N(1 ≤ N ≤ 1,000)
    static int M; // 간선의 개수 M(1 ≤ M ≤ 10,000)
    static int V; // 탐색을 시작할 정점의 번호 V

    static ArrayList<Integer>[] adjList;
    static boolean[] isVisited;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수 N(1 ≤ N ≤ 1,000)
        M = Integer.parseInt(st.nextToken()); // 간선의 개수 M(1 ≤ M ≤ 10,000)
        V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 번호 V

        isVisited = new boolean[N + 1]; // 0은 더미


        // 연결 리스트
        adjList = new ArrayList[N + 1]; // 0은 더미
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>(); // 연결리스트 초기화
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adjList[from].add(to);
            adjList[to].add(from);
        }

        // 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문
        for (int i = 1; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
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

        for (int n: adjList[v]) {
            if (!isVisited[n]) {
                dfs(n);
            }
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

            for (int n : adjList[temp]) {
                if (isVisited[n]) continue;

                isVisited[n] = true;
                queue.offer(n);
            }
        }
    }
}
