import java.io.*;
import java.util.*;

public class Q10950_a_plus_b_minus_3 {
	public static void main(String[] args) throws IOException {
		// solution 1: 배열을 따로 생성하여 저장했다가 다시 출력하는 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			arr[i] = A + B;
		}
		
		for(int k : arr) {
			System.out.println(k);
		}
		
		/*
		// solution 2: 배열을 따로 생성하여 저장했다가 다시 출력하는 방식이 아닌
		// StringBuilder 에 계산한 식을 넣어준 뒤 나중에 한번에 출력해주는 방식
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		// 테스트 케이스 개수 T 입력받기
		int T = Integer.parseInt(br.readLine());
		
		// 개수 T 만큼 A와 B를 입력받는다
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
		*/
	}
}
