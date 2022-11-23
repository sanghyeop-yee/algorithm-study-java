import java.util.*;
import java.io.*;

public class Q11021_a_plus_b_7 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 테스트 케이스의 개수 T 입력받기
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		// T번 동안 A B 입력받고
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			//  A+B 계산하여 BufferedWriter 에 담기
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + (A + B) + "\n");
		}
		br.close();
		// 출력 
		bw.flush();
		bw.close();
	}
}
