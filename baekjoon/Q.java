import java.util.*;
import java.io.*;

public class Q {
	public static void main(String[] args) throws IOException {
		
		// 시험 과목의 개수 n 입력받기
		// n 개의 점수 입력받으면서 배열에 저장
		// m = 최대값 찾기
		// 배열을 훑으면서 새로운 점수 계산
		// 출력하면서 평균 계산
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		double m = arr[n-1];
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/m*100;
			sum += arr[i];
		}
		
		System.out.println(sum/n);
		
		
	}
	
}