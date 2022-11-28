import java.io.*;
import java.util.*;

public class Q2439_star_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<=n; i++) { // n번째 행까지 반복
			
			for(int j=1; j<=n-i; j++) { // 각 행마다 n-i 의 값만큼 공백 출력.
				bw.write(" ");
			}
			for(int k=1; k<=i; k++) { // 각 행마다 i의 값만큼 별표 출력.
				bw.write("*"); 
			}
			bw.newLine(); // 한 행의 출력이 끝나면 줄바꿈
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
