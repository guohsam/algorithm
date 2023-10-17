package BJ_1914_하노이탑;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	static int N; // 원판의 수
	static int K = 0; // 옮긴 횟수
	static StringBuilder sb = new StringBuilder(); // 수행 과정을 담을 StringBuilder
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		if ( N <= 20 ) { // 20 이하이면 수행과정 출력
			hanoi(N, 1, 2, 3);
			System.out.println(K);
			System.out.println(sb);
		} else { // 20 이상이면 이동횟수만 출력
			// ans = 2^N - 1;
			// N이 1 ~ 100까지이므로, ans는 BigInteger형으로 선언 
			BigInteger ans = new BigInteger("1");
			
			for (int i = 0; i < N; i++) {
				ans = ans.multiply(new BigInteger("2"));
			}
			
			ans = ans.subtract(new BigInteger("1"));
			System.out.println(ans);
		}
	}
	
	private static void hanoi(int n, int from, int temp, int to) {
		// 기저 조건
		//// 옮길 원판이 없으면 리턴
		if ( n == 0 ) return;
		
		// 유도 파트
		K++;
		
		//// n-1개 (덩어리) 원판을 'from 장대'에서 'temp 장대'로 이동
		hanoi(n-1, from, to, temp);
		
		//// n번 원판을 'form 장대'에서 'to 장대'로 이동
		sb.append(from).append(" ").append(to).append("\n");
		
		//// n-1개 (덩어리) 원판을 'temp 장대'에서 'to 장대'로 이동
		hanoi(n-1, temp, from, to);
	}
}
