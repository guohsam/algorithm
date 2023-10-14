package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1120_문자열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        int ans = a.length();
        int len = b.length() - a.length();

        for (int i = 0; i <= len; i++) {
            int temp = 0 ;
            for (int j = 0; j < a.length(); j++) {
                if ( a.charAt(j) != b.charAt(j+i) ) {
                    temp++;
                }
            }
            ans = Math.min(ans, temp);
        }
        System.out.println(ans);
    }
}
