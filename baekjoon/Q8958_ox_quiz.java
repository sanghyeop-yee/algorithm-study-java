import java.io.*;
import java.util.*;

public class Q8958_ox_quiz {
	public static void main(String[] args) throws IOException {
		// 문자열 배열을 통해 각 줄의 ox 문자열을 각 배열에 저장한 뒤 이후 반복, 조건문으로 풀기3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		// 테스트 케이스 개수 입력받기
		int test_case = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 개수 만큼 입력받아서 배열에 저장
		// String 배열 arr 의 각각의 원소에 문자열을 저장
		String arr[] = new String[test_case];
		
		for(int i=0; i<test_case; i++) {
			arr[i] = br.readLine();
		}
		
		// 각각의 원소를 차례대로 훑기
		for(int i=0; i<test_case; i++) {
			
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적 합산
			
			// 한 원소당 String 의 길이만큼 반복하여
			for(int j=0; j<arr[i].length(); j++) {
				
				// 해당 원소의 문자열을 charAt() 메소드를 통해 하나하나 검사하여
				if(arr[i].charAt(j) == 'O') {
					cnt++; // O 이라는 문자면 cnt 를 1 증가
				} else {
					cnt = 0; // 아닐경우 cnt 를 0 으로 초기화
				}
				sum += cnt; // 누적하여 합산
			}
			
			sb.append(sum).append('\n'); // 해당 배열 원소의 문자열을 다 검사하고 나면 sum 출력
		}
		System.out.println(sb);
	}
}
