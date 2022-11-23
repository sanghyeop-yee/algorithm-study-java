import java.io.*;
import java.util.*;

public class Q25304_receipt {
	public static void main(String arg[]) throws IOException {
		// Solution 1
		// 배열에 곱을 넣어서 다 더한 값을 x 와 비교하는 방법
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
		System.out.println(x==total ? "Yes" : "No");
		
		
		/*
		// solution 2
		// 입력받는 값을 곱해서 x에서 빼가면서 0 이 되는지 확인하는 방법
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int quantity = Integer.parseInt(st.nextToken());
			x -= price*quantity;
		}
		System.out.println(x==0 ? "Yes" : "No");
		*/
		
		/*
		// Solution 3
		// 배열을 쓰지않고 입력받는 값을 곱해서 바로 total 값에 더해가는 방법
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int quantity = Integer.parseInt(st.nextToken());
			total = total + (price*quantity); // total += price*quantity;
		}
		System.out.println(total==x ? "Yes" : "No");
		*/
	}
}
