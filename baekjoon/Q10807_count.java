import java.io.*;
import java.util.*;

public class Q10807_count {
	public static void main(String args[]) throws IOException {
		// 정수의 개수 n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n]; 
		
		// n 크기의 배열에 공백으로 구분된 정수 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 찾으려는 정수 v 입력받기 
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// 배열을 도는 동안 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == v) { // 배열의 숫자가 정수 v 와 같으면 
				cnt++; // 카운트 ++
			}
		}
		// 카운트 출력하기
		System.out.println(cnt);
		br.close();
	}
}
