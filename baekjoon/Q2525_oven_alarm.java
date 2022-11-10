import java.io.*;
import java.util.*;

public class Q2525_oven_alarm {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 요리 시작 시간 입력
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 요리 시간 입력
		int C = Integer.parseInt(br.readLine());
		
		H = H + (C/60);
		M = M + (C%60);
		
		// m이 60분 이상일 때 h를 1더하고 60에서 m을 빼준다.
		if(M >= 60) {
			H = H + 1;
			M = M - 60;
		}
		// h가 24 이상일 때 시간을 계산해준다.
		if(H >= 24) {
			H = H - 24;
		}
		System.out.println(H + " " + M);
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 요리 시작 시간 입력
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		// 요리 시간 입력
		int C = Integer.parseInt(br.readLine());
		
		// 시각을 분으로 바꾸고 요리 시간을 더하기
		int T = (H * 60 + M) + C;
		// 만약 총 요리 시간이 1440분보다 같거나 많으면 
		if(T < 1440) { // 즉, 총 요리 시간이 하루 24시인 1440분 미만이면 오늘
			H = T / 60;
			M = T % 60;
		} else if(T >= 1440) { // 1440분 이상이면 다음날
			H = 0; // // 시간을 0으로 리셋하고
			M = T-1440; // 분을 T-1440 으로 리셋
		}
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(H + " " + M);
		bw.flush();
		bw.close();
		*/
	}
}
