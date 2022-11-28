import java.util.*;
import java.io.*;

public class Q10951_a_plus_b_4 {
	// 더이상 읽을 수 있는 데이터 (EOF)가 없을 때 종료한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while( (str=br.readLine()) != null) { // null 이 아니면 무한반복
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append((a+b)).append("\n");
		}
		System.out.print(sb); // ctrl+d 로 EOF (End of File) 입력 
	}
}
