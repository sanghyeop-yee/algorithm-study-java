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
		// 버퍼에 입력문자를 저장한후 1줄씩 읽어올수 있다.
		// InputStreamReader : 문자 단위 입력하는 클래스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 객체 선언 및 인스턴스 생성
        String s = br.readLine(); // 한 줄 읽어와서
        String[] arr = s.split(" "); // 배열에 구분자로 공백문자를 전달하여 저장
        
        int a = Integer.parseInt(arr[0]); // 첫번째 배열의 값을 형변환하여 a 로 저장
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(a >= 2 && a <= 10000 && b >= 2 && b <= 10000 && c >= 2 && c <= 10000) {
            bw.write(Integer.toString((a+b)%c) + "\n"); // 숫자를 문자열로 변환 (null 은 오류로 처리)
            bw.write(Integer.toString((a%c + b%c)%c) + "\n");
            bw.write(Integer.toString((a*b)%c) + "\n");
            bw.write(Integer.toString((a%c * b%c)%c));
        }
        
        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        bw.close(); // 스트림을 닫음
    }
}
