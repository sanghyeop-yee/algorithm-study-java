import java.io.*;
import java.util.*;

public class Q5597_unsubmitted_task {
	public static void main(String[] args) throws IOException {
		// Solution 1
		// boolean 형 배열을 이용하여 true 면 과제 제출, false 면 제출 못함
		// 28명의 학생 번호가 입력으로 주어지면 배열에서의 입력받은 인덱스를 true 로 바꾸고
		// 마지막에 배열을 순회하면서 false 인 인덱스를 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[31]; // 1번부터 30번이라 31로 지정
		// 온 사람은 출석체크
		for(int i=0; i<28; i++) { // 28번까지 차례대로 
			int n = Integer.parseInt(br.readLine()); // n을 입력받으면 
			arr[n] = true; // n번째 인덱스로 가서 true 로 표시를 바꾸기
		}
		
		for(int i=1; i<=30; i++) {
			if(!arr[i]) System.out.println(i); // 불리지 않은 사람 출력
		}
		
		/*
		// Solution 2
		// boolean 대신 1로 표기할 수 도 있습니다.
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];
		
		for(int i=1; i<29; i++) {
			int success = sc.nextInt();
			student[success] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
		
		
		sc.close();
		*/
	}
}
