import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10172_dog {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("|\\_/|");
		bw.newLine();
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("|\"^\"`    |");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		bw.newLine();	
		
		bw.flush(); // 스트림에 들어있는 데이터 비움
		bw.close(); // 스트림 종료
	}
}
