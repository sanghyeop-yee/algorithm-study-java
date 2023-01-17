import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}
	
	// 1. arithmetic_sequence 함수와 해당 함수 안에 한수의 개수를 셀 cnt 변수 선언
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅
		
		// 2. 1~99 인 경우 (모두 수열) 와 100 이상인 경우로 나누기
		if(num < 100) {
			return num;
		} else {
			// 3. 100 이상의 수들의 각 자릿수가 등차수열인지 짜보기
			// 100 이상의 수가 들어오면 한수의 최소 개수는 99개 임으로 cnt=99 로 초기화
			cnt = 99;
			
			// 4. 100부터 입력받은 값(num) 까지 반복하면서 한수의 개수 세기
			// 이때, 각 자릿수를 변수로 두기
			for(int i=100; i<=num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun-ten) == (ten-one)) { // 각 자릿수가 수열을 이루면
					cnt++;
					
				}
			}
		}
		
		return cnt;
	}
}