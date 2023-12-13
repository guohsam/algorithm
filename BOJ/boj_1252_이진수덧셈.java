package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class boj_1252_이진수덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken(), 2);
        BigInteger B = new BigInteger(st.nextToken(), 2);

        BigInteger sum = A.add(B);
        
        System.out.println(sum.toString(2));
    }
}
