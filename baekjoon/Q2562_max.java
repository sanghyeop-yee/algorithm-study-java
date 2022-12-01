import java.util.*;
import java.io.*;

public class Q2562_max {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int value : arr) { // for-each 구문으로 배열의 원소를 하나씩 value에 저장한뒤
			count++;
			
			if(value > max) { // 지금의 value 가 max 보다 크면
				max = value; // max 를 지금의 value 로 업데이트
				index = count; 
			}
		}
		br.close();
		System.out.println(max + "\n" + index);
	}
}
