import java.util.*;
import java.io.*;

public class Q {
	
	public static void main(String ars[]) throws IOException {
	
		// 시험 본 과목의 개수 n 입력받기
		// n 과목만큼의 현재 성적 입력받기
		// 최고점 m 찾기
		// 새로운 평균 구하기
		// 총점 구하기 ((a+b+m)/m * 100) = total
		// 평균 출력하기 total / n
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr);
		double m = arr[n-1];
		
		double total = 0;
		
		for(int i=0; i<n; i++) {
			total += ((arr[i]/m)*100);
		}
		
		System.out.println(total/n);
		
	}
}