package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_4999_아 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int target = br.readLine().length();
        int input = br.readLine().length();

        String ans = target >= input ? "go" : "no";

        System.out.println(ans);
    }
}
