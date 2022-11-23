import java.io.*;
import java.util.*;

public class Q15552_faster_a_plus_b {
	public static void main(String args[]) throws IOException {
		/*
		// solution 1: StringBuilder 로 하나의 문자열로 계속 연결시킨 뒤 가장 마지막에 연결된 하나의 문자열을 출력시키는 방법.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스의 개수 T 입력받기 (T<1,000,000)
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// T 번 동안 
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			// 정수 A 와 B 입력 받기
			// A+B 계산한 값을 StringBuffer + \n 에 넣기
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		// sb 를 출력하기
		br.close();
		
		System.out.println(sb);
		*/
		
		// Solution 2
		// BufferedWriter 로 버퍼에 담아둬았다가 한 번에 데이터를 보내는 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			// String st = br.readLine();
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");			
		}
		br.close();
		
		bw.flush();
		bw.close();

	}
}
