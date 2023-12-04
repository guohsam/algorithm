package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = a * (b.charAt(i) - '0');
        }

        sb.append(arr[2]).append('\n');
        sb.append(arr[1]).append('\n');
        sb.append(arr[0]).append('\n');
        sb.append(arr[0] * 100 + arr[1] * 10 + arr[2]);

        System.out.println(sb);
    }
}
