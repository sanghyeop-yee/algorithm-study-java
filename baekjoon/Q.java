import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		// 정수 개수 n 입력받기
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n]; // n개의 크기를 가진 int 형 배열 선언 및 생성
		
		// 공백으로 구분된 정수 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 입력된 정수 차례대로 배열에 저장하기
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 찾으려는 정수 v 입력받기
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		// v 와 같은 정수의 개수 출력하기
		// 배열을 차례대로 탐색하여
		// v 와 같으면 카운트 +1
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == v) {
				cnt++;
			}
		}
		
		// 출력
		System.out.println(cnt);

	}

}
