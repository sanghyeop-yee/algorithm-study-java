import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) { // n 번째 줄 동안 
			// 각 n 번째 줄에서 n 의 갯수만큼 * 출력
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine(); // 출력이 끝나면 줄 띄우기
		}
		bw.flush();
		bw.close();

	}

}
