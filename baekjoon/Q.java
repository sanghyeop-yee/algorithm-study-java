import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 문자의 공백문자를 구분자로 받아서 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 변수 선언
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int prize = 0;
		
		// 계산
		// 같은 눈 3개
		if(a == b && a == c && b == c) {
			prize = 10000 + a * 1000;
		} else if(a == b) {
			prize = 1000 + a * 100;
		} else if(a == c) {
			prize = 1000 + a * 100;
		} else if(b == c) {
			prize = 1000 + b * 100;
		} else {
			prize = Math.max(a, Math.max(b, c));
		}
		
		System.out.println(prize);
		
	}
}
