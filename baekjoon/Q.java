import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		// 출력
		int chess[] = {1,1,2,2,2,8};
		for(int i=0; i<6; i++) {
			int input = Integer.parseInt(st.nextToken());
			sb.append(chess[i] - input).append(" ");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}
