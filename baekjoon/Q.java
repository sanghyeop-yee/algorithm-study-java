import java.io.*;
import java.util.*;

public class Q {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt += 1;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			sb.append(sum + '\n');
		}
		
		System.out.println(sb);
	}
}
