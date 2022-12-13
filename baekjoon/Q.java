import java.io.*;
import java.util.*;

public class Q {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int n = 0;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			for(int j=0; j<n; j++) {
				int arr[] = new int[n];
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			int average = (sum / n);
		}
		
		for(int i=0; i<c;)
		
		// 평균 = 각 케이스별 학생의 총 점수 / 각 케이스별 학생의 수
		// 평균을 넘는 학생들의 비율 = 평균을 넘는 학생 수 / 각 케이스별 학생 수 * 100
		
		
	}
}

