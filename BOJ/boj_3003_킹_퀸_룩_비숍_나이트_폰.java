package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3003_킹_퀸_룩_비숍_나이트_폰 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(1 - Integer.parseInt(st.nextToken())).append(" ");    // 킹
        sb.append(1 - Integer.parseInt(st.nextToken())).append(" ");    // 퀸
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");    // 룩
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");    // 비숍
        sb.append(2 - Integer.parseInt(st.nextToken())).append(" ");    // 나이트
        sb.append(8 - Integer.parseInt(st.nextToken()));                // 폰

        System.out.println(sb);
    }
}
