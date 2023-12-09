package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1547_공 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        boolean[] arr = {false, true, false, false};
        for (int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            
            boolean temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        
        for (int i = 1; i <= 3; i++) {
            if (arr[i]) System.out.print(i);
        }
    }
}
