import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 첫째 줄에 현재 시각 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 입력 시각 분으로 환산하여 시간 빼기
		int T = (H * 60 + M) - 45;
		H = T / 60;
		M = T % 60;
		
		if(M < 45) {
			H += 1;
			M -= 60;
		}
		if(H >= 24) {
			H -= 24;
		}
		System.out.println(H + " " + M);
		
		
		
	}
}
