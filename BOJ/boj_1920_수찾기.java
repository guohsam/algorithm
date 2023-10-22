package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1920_수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] inputs = new int [N];
        for (int n = 0; n < N; n++) {
            inputs[n] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputs);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < M; m++) {
            boolean find = false;
            int target = Integer.parseInt(st.nextToken());

            int startIdx = 0;
            int endIdx = N - 1;

            while (startIdx <= endIdx) {
                int curIdx = (startIdx + endIdx)/2;
                int curValue = inputs[curIdx];

                if (curValue > target) {
                    endIdx = curIdx - 1;
                } else if (curValue < target) {
                    startIdx = curIdx + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
    }
}
