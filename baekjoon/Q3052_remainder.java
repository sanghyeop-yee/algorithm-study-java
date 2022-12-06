import java.io.*;
import java.util.*;

public class Q3052_remainder {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 boolean 배열 생성
		boolean[] arr = new boolean[42];
		// 수 10개 입력받으면서 42로 나눈 나머지를 배열의 인덱스에 표시
		for(int i=1; i<=10; i++) {
			int n = Integer.parseInt(br.readLine()) % 42;
			arr[n] = true;
		}
		int count = 0;
		// 배열을 훑으면서 값이 true 이면 카운트 +1
		for(boolean value : arr) { // 	for(int i=1; i<=41; i++)
			if(value) { // arr[i]==true
				count++;
			}
		}
		System.out.println(count);
		
		/*
		// Solution 2: HashSet 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(h.size());
		*/
	}
}
