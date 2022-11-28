import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q10952_a_plus_b_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		while(true) { // 무한반복하면서 a,b 값 입력받기
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) { // a,b 가 0일 경우는 반복문 종료
				break;
			}
			sb.append((a+b)).append('\n'); // 0이 아니면 a+b 값을 sb에 추가
		}
		br.close();
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	
	}
}
