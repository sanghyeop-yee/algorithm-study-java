import java.io.*;
import java.util.*;

public class Q1110_plus_cycle {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 초기 n 입력받기
		int n = Integer.parseInt(br.readLine());
		// 초기 n 값 복사해놓기
		int copy = n;
		// 반복횟수 세어주는 변수
		int count=0;

		do {
			n = ((n%10)*10) + (((n/10)+(n%10))%10); 
			count++; // 사이클 한번 돌때마다 카운트 1
		}while(n != copy); // 갱신되는 값이 초기입력값과 다른동안
		
		System.out.println(count);
	}
}
