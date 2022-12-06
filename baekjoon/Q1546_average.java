import java.io.*;
import java.util.*;

public class Q1546_average {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 28명 출석 부르기
		// 입력받은 값을 n으로 지정
		// n번째 인덱스의 값을 true 로 변환 
		int[] arr = new int[11]; // 31칸, 0~30번까지
		
		for(int i=0; i<8; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = 1;
		}
		
		for(int i=1; i<=10; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
