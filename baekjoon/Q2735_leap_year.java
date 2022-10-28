import java.io.*;

public class Q2735_leap_year {
	public static void main(String args[]) throws IOException {
		// 연도 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int year = Integer.parseInt(br.readLine());
		
		if(year>=1 && year<=4000) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				bw.write("1");
			}else {
				bw.write("0");
			}
		}
		bw.flush();
		bw.close();
	}
}
