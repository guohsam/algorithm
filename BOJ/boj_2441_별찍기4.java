package BOJ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2441_ㅂㅕㄹㅉㅣㄲㄲㅣ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < N - i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
