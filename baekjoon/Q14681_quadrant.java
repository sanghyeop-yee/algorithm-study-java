import java.io.*;

public class Q14681_quadrant {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		if(x<0 && y>0) {
			System.out.println("2");
		}
		if(x<0 && y<0) {
			System.out.println("3");
		}
		if(x>0 && y<0) {
			System.out.println("4");
		}
		
		/* Solution 2
		if(x<0) {
			if(y<0) {
				System.out.println(3);
			}else {
				System.out.println(2);
			}
		}else {
			if(y<0) {
				System.out.println(4);
			}else {
				System.out.println(1);
			}
		}
		*/
	}
}
