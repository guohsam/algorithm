package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_5596_시험점수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < 4; i++) {
            sum1 += Integer.parseInt(st1.nextToken());
            sum2 += Integer.parseInt(st2.nextToken());
        }
        
        int sum = Math.max(sum1, sum2);
        
        System.out.println(sum);
    }
}
