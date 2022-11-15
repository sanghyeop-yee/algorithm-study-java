import java.io.*;

public class Q2739_times_table {
	public static void main(String[] args) throws IOException {
		// 한줄로 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력받은 값 변수 선언
		int N = Integer.parseInt(br.readLine());
		// N 값 조건 확인
		if(N>=1 && N<=9) {
			// 반복문
			for(int i=1; i<10; i++) {
				System.out.println(N + " * " + i + " = " + N * i);
			}
		}
	}
}
