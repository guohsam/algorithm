package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int M = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());

            sum += temp;
            M = (temp > M) ? temp : M;
        }

        double ans = (sum * 100.0) / (M * N);

        System.out.println(ans);
    }
}
