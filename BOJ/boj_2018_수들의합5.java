package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2018_수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int small = 1;
        int big = 1;
        int cnt = 0;
        int sum = 1;

        while (true) {
            // 탈출 조건
            if (big > N) break;

            // 풀이
            if (sum == N) {
                cnt++;
                big++;
                sum += big;
            } else if (sum > N) {
                sum -= small;
                small++;
            } else {
                big++;
                sum += big;
            }
        }

        System.out.println(cnt);
    }
}
