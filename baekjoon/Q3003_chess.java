import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003_chess {
	public static void main(String[] args) throws IOException {
		// BufferedReader 에 문자 스트림인 InputStreamReader 와 바이트 스트림인 System.in 을 연결시킴
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// readLine() 으로 한 라인을 입력받고, 구분자로 공백 문자를 전달
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// StringTokenizer 객체의 nextToken() 을 호출하면
		// 구분자로 잘려진 token 이 순서대로 반환되기 때문에
		// 반환받은 다음 형변환 해서 사용
		
		int[] chess = {1,1,2,2,2,8};
		for(int i=0; i<6; i++) {
			int input = Integer.parseInt(st.nextToken());
			sb.append(chess[i] - input).append(" ");
		}
		System.out.println(sb);
	}
}
