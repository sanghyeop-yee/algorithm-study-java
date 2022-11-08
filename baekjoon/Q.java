import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 입력
		// h, m 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute =  Integer.parseInt(st.nextToken());
		
		// 계산
		// 0시 24시로 업데이트
		if(hour == 0 && hour <= 23) {
			hour = 24;
		
			// 45분 보다 같거나 크면
		} else if(minute >= 45 && minute <= 59) { 
			minute -= 45; // 45를 빼고
			System.out.printf("%d %d", hour, minute);
		} else if(minute < 45) { // 45보다 작으면
			hour -= 1; // 1시간을 빼고
			minute = (60-(45-minute)); // 분을 구합니다.
			System.out.printf("%d %d", hour, minute);
		} 
		
		
		// 10 10 
		// = if m (44) < 45? (60 - (45-m)) and h-1
			
		// = if m (45) => 45 ? (m-45)
		// = if 1 30 => 0 45
		// = if 0 30 => h=23
		
		// 출력
	}
}
