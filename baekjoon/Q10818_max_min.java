import java.util.*;
import java.io.*;

public class Q10818_max_min {
	public static void main(String args[]) throws IOException {
		// Solution 1
		// 정수의 개수 n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// n 크기의 배열 선언 및 할당
		int[] arr = new int[n];
		// 공백자로 구분된 n개의 정수 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int index=0;
		// 차례대로 배열에 추가하기
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		*/
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);
		
		/*
		// Solution 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // 입력만 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = - 1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
		*/
		
		/*
		// Solution 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int n = Integer.parseInt(br.readLine());
			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int value=Integer.parseInt(st.nextToken());
			min = Math.min(value,min);
			max = Math.max(value,max);
		}
		
		System.out.println(min + " " + max);
		*/
	}
}
