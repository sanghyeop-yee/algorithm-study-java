import java.io.*;

public class Q1330_compare {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] arr = s.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if(a>b) {
			bw.write(">");
		}else if(a<b) {
			bw.write("<");
		}else if(a==b) {
			bw.write("==");
		}
		
		bw.flush();
		bw.close();
		
		
		/*
		// Solution 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a==b ? "==" : a>b ? ">": "<");
		 */
	}
}
