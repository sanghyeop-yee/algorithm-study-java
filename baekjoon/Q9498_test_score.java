import java.io.*;

public class Q9498_test_score {
	public static void main(String args[]) throws IOException{
		// 시험성적 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		// 조건문 출력
		if(score>=0 && score<=100) {
			if(score>=90) {
				System.out.println("A");
			} else if (score>=80) { // 위쪽 if문의 조건을 만족시키지 않을 경우 다음 조건 확인
				System.out.println("B");
			} else if (score>=70) { // 다시말해 점수가 90, 80 점보다 크지 않으면 여기 실행
				System.out.println("C");
			} else if (score>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}
