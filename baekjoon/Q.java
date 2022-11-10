import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 설정한 알람 시각 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 계산
		// 주어진 시각을 분으로 바꾸고 45분 빼주기 (h*60 + m) - 45
		int T = (H * 60 + M) - 45;
		
		// 만약 계산된 값 T가 0보다 크거나 같으면
		if(T >= 0) {
			// 시간 구하기
			H = T / 60;
			// 분 구하기 
			M = T % 60;
		} else if(T < 0) { // 만약 0보다 작으면
			H = 23; // 시간은 23시로 리셋하고
			M = 60 + T; // 분은 (60+ (t))
		}

		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(H + " " + M);
		bw.flush();
		bw.close();
	}
}
