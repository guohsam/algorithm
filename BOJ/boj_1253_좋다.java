package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1253_좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputs);

        int cnt = 0;

        for (int n = 0; n < N; n++) {
            int target = inputs[n];
            int start = 0;
            int end = N - 1;
            while (true) {
                if (start >= end)
                    break;
                if (inputs[start] + inputs[end] < target) {
                    start++;
                } else if (inputs[start] + inputs[end] > target) {
                    end--;
                } else { // inputs[start] + inputs[end] == target
                    if (n != start && n != end) { // 서로 다른 수의 합
                        cnt++;
                        break;
                    } else if (start == n) {
                        start++;
                    } else if (end == n) {
                        end--;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
