package BOJ;

import java.io.*;
import java.util.*;

public class boj_2558_A더하기B빼기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

        System.out.println(ans);
    }
}
