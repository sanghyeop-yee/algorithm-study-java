import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2588_multiplication {
	public static void main(String[] args) throws IOException {
		
		/*
		// Solution 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = a*b;
		
		for(int i=0; i<3; i++) {
			bw.write(a*(b%10)+"\n"); // 1. 472*5 | 2. 472*8 | 3. 472*3
			b/=10; // 1. b(385) 는 이제 385/10(38) | 2. b(38)은 이제 38/10(3) | 3. 3/10
		}
		bw.write(String.valueOf(c));
		bw.flush();
		bw.close();
		*/
		
		// solution 2
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		// 472 * 385 
		System.out.println(i * (j % 10)); // 472 * 5
		System.out.println(i * (j % 100 / 10)); // 472 * (385 % 100 / 10) = 472 * (85/10) = 472 * 8
		System.out.println(i * (j / 100));
		System.out.println(i * j);
	}
}
