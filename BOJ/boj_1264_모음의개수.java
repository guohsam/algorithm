package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1264_모음의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals("#")) break;

            input = input.toLowerCase();

            int ans = 0;
            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                    ans++;
            }

            System.out.println(ans);
        }
    }
}
