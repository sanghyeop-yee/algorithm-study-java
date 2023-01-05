import java.util.*;
import java.io.*;

public class Q4244_above_average {
	public static void main(String[] args) throws IOException {
		
		// 테스트 케이스 개수 c 입력받기
		// c 만큼 학생의 수 n, n명의 점수 입력받기
		// 입력받은 첫번째 수가 n
		// 나머지 수는 배열에 저장하기
		// 합산된 합을 동시에 구하기
		// 평균 구하기
		// 배열을 훑으면서 평균보다 높은 값 세기
		// 계산한 값을 sb 에 저장
		// 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			int sum = 0;
			
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			double mean = sum/n;
			double cnt = 0;
			
			for(int j=0; j<n; j++) {
				if(arr[j] > mean) {
					cnt++;
				}
			}
			
			String ans = String.format("%.3f", cnt/n*100);
			sb.append(ans).append('%').append('\n');
			
		}
		System.out.println(sb);
	}
	
}