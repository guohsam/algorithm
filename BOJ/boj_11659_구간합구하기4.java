package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11659_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        int[] sumArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N ; i++) {
            sumArr[i] = sumArr[i - 1] + Integer.valueOf(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());

            int front = Integer.valueOf(st.nextToken()) - 1;
            int rear = Integer.valueOf(st.nextToken());

            sb.append(sumArr[rear] - sumArr[front]).append("\n");
        }

        System.out.println(sb);
    }
}
