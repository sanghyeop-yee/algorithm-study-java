import java.io.*;
import java.util.*;

public class Q1546_average {
	public static void main(String args[]) throws IOException {
		// 시험 과목 n 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double arr[] = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 시험 점수 입력받고 배열에 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
	
		for(int i=0; i<arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}