package BOJ;

import java.io.*;

public class boj_1159_농구경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        boolean possible = false;  //다섯 명을 선발할 수 있는지

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            arr[c - 97]++;
            if (arr[c - 97] == 5) possible = true;
        }

        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char)(i+97));
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}
