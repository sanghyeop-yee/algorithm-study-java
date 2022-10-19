import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10430_remainder {
	public static void main(String[] args) throws IOException {
		/* solution 1:
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		*/
		
		// solution 2:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a >= 2 && a <= 10000 && b >= 2 && b <= 10000 && c >= 2 && c <= 10000) {
            bw.write(Integer.toString((a+b)%c) + "\n");
            bw.write(Integer.toString((a%c + b%c)%c) + "\n");
            bw.write(Integer.toString((a*b)%c) + "\n");
            bw.write(Integer.toString((a%c * b%c)%c));
        }
        
        bw.flush();
        bw.close();
    }
}
