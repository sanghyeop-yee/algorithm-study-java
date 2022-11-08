import java.io.*;
import java.util.*;

public class Q2884_alarm {
	public static void main(String args[]) throws IOException {
		// 입력
		// h, m 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute =  Integer.parseInt(st.nextToken());
		
		// 계산
		// 총 분으로 바꿔 45분 빼주기
		int total = (hour * 60 + minute) - 45; // 0 30 -> (0*60 + 30)-45 = -15
		
		// 
		if (total >= 0) { // -> 0 45 이상부터는  
			hour = total / 60; // 다시 시간으로 나누고
			minute = total % 60; // 남는 것은 분으로 바꾸기
			
			// -> 0 44 부터는
		} else { // total = -15 -> hour=23, minute=60+(-15) -> 23 45
			hour = 23; // 시간은 23으로 리셋
			minute = 60 + total; 
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(hour + " " + minute);
		bw.flush();
		bw.close();
		
		/* Solution 2.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hh = Integer.parseInt(st.nextToken());
        int mi = Integer.parseInt(st.nextToken());

        if (mi < 45) {
            mi = 60 + mi - 45;
            if (hh == 0) hh = 23;
            else hh -= 1;
        } else {
            mi -= 45;
        }

        System.out.println(hh + " " + mi);
		 */
	}
}