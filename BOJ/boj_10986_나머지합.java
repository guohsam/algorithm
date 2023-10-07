package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sum = new int[N + 1];
        int[] remainder = new int[M];
        long cnt = 0;

        st = new StringTokenizer(br.readLine());

        // 입력
        for (int i = 1; i <= N; i++) {
            // '구간합을 M으로 나눈 나머지' 배열
            sum[i] = (sum[i-1] + Integer.parseInt(st.nextToken())) % M;

            if (sum[i] == 0) cnt++;
            remainder[sum[i]]++;
        }

        System.out.println(Arrays.toString(remainder));

        for (int i = 0; i < M; i++) {
            if (remainder[i] >= 2) {
                cnt += (long) remainder[i] * (remainder[i]-1) / 2;
            }
        }

        System.out.println(cnt);
    }
}
