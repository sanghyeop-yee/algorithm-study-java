
public class Q {
	public static void main(String[] args){
		
		// 셀프넘버 출력하기
		// 1-10000 인덱스에서 생성자인 경우에 표시하기
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
			
		}

		// 1-10000 까지 훑으면서 해당이 안되는 셀프넘버 출력하기 
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
			sum = sum + (number % 10);
			number = number/10;
		}
		
		return sum;
	}
	
}