package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj_1931_회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] schedules = new int[N][2];

        StringTokenizer st;
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(br.readLine());

            schedules[n][0] = Integer.parseInt(st.nextToken());
            schedules[n][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(schedules, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1 == o2) { // 종료 시간이 같을 때
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        System.out.println(Arrays.toString(schedules));

        int cnt = 0;
        int end = -1;

        for (int i = 0; i < N; i++) {
            if (schedules[i][0] >= end) {
                end = schedules[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
