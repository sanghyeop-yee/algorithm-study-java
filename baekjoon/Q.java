// 1부터 10000까지 배열을 만들고
// n=1부터 시작하여 d(n) 의 함수에 대입하여 나온수를 배열의 인덱스에 true 로 표시하고
// 배열을 스캔하면서 false 로 되어 있는 셀프 넘버를 한줄에 하나씩 출력하기

// d(n) 함수
// int number 를 받는 함수 d(n) 은 
// sum = sum + (num % 10)
// num / 10

public class Q {
	
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10); // 첫번째 자리
			number = number / 10;
		}
		
		return sum;
	}
}