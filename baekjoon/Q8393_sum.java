import java.io.*;

public class Q8393_sum {
	public static void main(String args[]) throws IOException {
		// n 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		// 1 <= n <= 10000 일때
		if(n>=1 && n<=10000) {
			// 1부터 n까지 합 출력하기
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		
	}
}
