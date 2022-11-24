import java.io.*;
import java.util.*;

public class Q11022_a_plus_b_8 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 테스트 케이스의 개수 T 입력받기
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		// T번 동안 A + B 를 입력받아 계산된 값을 저장한다.
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = A+B;
			bw.write("Case #" + i + ": " + A + " + " + B + " = " + C + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
