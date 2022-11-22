import java.io.*;
import java.util.*;

public class Q25304_receipt {
	public static void main(String arg[]) throws IOException {
		// 총 금액 X 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		// 구매한 물건의 종류의 수 N 입력받기
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int total = 0;
		
		StringTokenizer st;
		
		// 물건의 가격 a 와 개수 b 입력받기 -> a*b = arr[i] -> total += arr[i]
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			// 계산해서 total 구하기
			arr[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		// 만약 X==total 이면 true or false
		if(x == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
