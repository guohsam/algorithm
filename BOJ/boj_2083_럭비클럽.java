package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2083_럭비클럽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if(name.equals("#") && age == 0 && weight == 0) break;

            if (age > 17 || weight >= 80) {
                sb.append(name).append(" ").append("Senior").append("\n");
            } else {
                sb.append(name).append(" ").append("Junior").append("\n");
            }
        }
        System.out.println(sb);
    }
}
