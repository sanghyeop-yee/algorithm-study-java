
public class Q4673_function_self_number {
	
	// 1 부터 10000 까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면 그 수를 거르기
	public static void main(String[] ars) { // 메인
		
		boolean[] check = new boolean[10001]; // 1부터 10000이므로
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000이 넘는 수는 필요 없음
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			if(!check[i]) { // false 인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) { // 함수
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); // 첫째자리수
			number = number/10; // 10을 나누어 첫째 자리를 없앤다.
		}
		
		return sum;
	}

}
