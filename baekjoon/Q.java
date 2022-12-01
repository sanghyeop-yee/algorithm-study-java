import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 정수의 개수 n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// n 의 사이즈를 갖는 배열 선언
		int[] arr = new int[n];
		
		// 공백으로 구분된 n개의 정수 입력받으며 바로 배열에 차례대로 집어넣기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// Arrays.sort 로 오름차순으로 정렬하기
		Arrays.sort(arr);
		
		// 배열의 첫번째와 마지막 인덱스 출력하기 
		br.close();
		System.out.println(arr[0] + " " + arr[n-1]);
		
		
	}

}
