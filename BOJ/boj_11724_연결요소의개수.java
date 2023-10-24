package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_11724_연결요소의개수 {

    static ArrayList<Integer>[] Arr;
    static boolean[] Visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Arr = new ArrayList[N + 1];
        Visited = new boolean[N + 1];
        for (int i = 1; i <= N ; i++) {
            Arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            Arr[s].add(e);
            Arr[e].add(s);
        }

        int cnt = 0;
        for (int i = 1; i < N; i++) {
            if (!Visited[i]) {
                cnt++;
                DFS(i);
            }
        }

        System.out.println(cnt);
    }

    static void DFS(int v) {
        if (Visited[v]) return;

        Visited[v] = true;

        for (int i : Arr[v]) {
            if (Visited[i] == false) {
                DFS(i);
            }
        }
    }
}
