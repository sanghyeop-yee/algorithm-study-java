import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		// 30명이 있는 반에서 과제체크를 하는데 28명만 제출을 했네요.
		// 남은 2명이 누군지 알아내는 프로그램을 만들어주세요.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 번호를 입력받을때마다 생성한 배열의 인덱스 넘버에 true 로 표시하기
		// 31칸짜리 (0~30까지 번호가 있는) 배열 선언 및 생성
		int[] student = new int[11];
		for(int i=1; i<=8; i++) {
			int n = Integer.parseInt(br.readLine());
			student[n] = 1;
		}
		for(int i=1; i<=10; i++) {
			if(student[i] != 1) System.out.println(i);
		}
		
		// 배열을 훑으면서 false 인 인덱스 번호 출력하기


	}
}
