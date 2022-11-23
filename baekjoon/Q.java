import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException{
		// 총 금액 x 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		// 구매한 물건의 종류의 수 n 입력받기
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int[] arr = new int[n];
		int total = 0;
		
		for(int i=0; i<n; i++) {
			// n번 동안 가격 a와 개수 b 입력받기
			st = new StringTokenizer(br.readLine());
			// (a*b) 을 배열에 입력해놓기
			arr[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			// total 에 합 구하기
			total += arr[i];
		}

		// 조건으로 Yes or No 출력
		System.out.println(total==x ? "Yes" : "No");
	}
}
