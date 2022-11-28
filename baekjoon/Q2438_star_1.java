import java.io.*;
import java.util.*;

public class Q2438_star_1 {
	public static void main(String[] args) throws IOException {
		// n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		// n행까지 반복해서 출력
		for(int i=1; i<=n; i++) { 
			for(int j=1; j<=i; j++) { // n번째 행에 n개 출력 == i값만큼 반복해서 출력
				bw.write("*"); // 한 행(i)당 j의 반복 횟수만큼 출력
			}
			bw.newLine(); // 한 행의 출력이 끝나면 줄바꿈
		}
		bw.flush();
		bw.close();
	}
}
