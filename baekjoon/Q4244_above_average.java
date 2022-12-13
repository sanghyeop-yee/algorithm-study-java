import java.io.*;
import java.util.*;

public class Q4244_above_average {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		
		int[] arr;
		StringTokenizer st;
		
		// 1. 테스트 케이스만큼 반복문을 돌리면서
		// 2. 배열에 성적을 저장함과 동시에 누적 합을 같이 구해준다.
		// 3. 평균 성적을 구하여 배열에 저장된 성적들과 비교한 뒤 몇명의 학생이 평균보다 높은지 세기
		// 4. printf 로 출력하기
		for(int i=0; i<testcase; i++) {
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 학생수
			arr = new int[N];
			
			double sum = 0; // 성적 누적 합 변수
			
			// 성적 입력
			for(int j=0; j<N; j++) {
				int score = Integer.parseInt(st.nextToken()); // 성적 저장
				arr[j] = score;
				sum += score;
			}
			
			double mean = (sum / N);
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평균 넘는 학생 비율 찾기
			for(int j=0; j<N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N) * 100);
		}
	
	}

}
