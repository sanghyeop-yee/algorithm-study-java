import java.io.*;
import java.util.*;

public class Q10871_smaller_than_x {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// n 과 x 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 수열 a[] 입력받기
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
 		}
		
		// x 와 반복해서 비교해서 
		// x 보다 작은 수 a[i] 를 출력에 담기
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < x) {
				bw.write(arr[i] + " ");
			}
		}
		br.close();
		// 출력하기
		bw.flush();
		bw.close();
	}
}
