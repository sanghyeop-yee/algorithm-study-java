import java.io.*;
import java.util.*;

public class Q2480_three_dice {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int prize = 0;
		
		if(a==b && b==c) {
			prize = 10000+a*1000;
		} 
		else if(a==b && b!=c) {
			prize = 1000+a*100;
		} 
		else if(b==c && c!=a) {
			prize = 1000+b*100;
		}
		else if(a==c && c!=b) {
			prize = 1000+a*100;
		}
		else {
			prize = Math.max(a, Math.max(b, c))*100;
		}
		System.out.println(prize);
		

		/* Solution 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	     int[] input = new int[3];
		
	     for(int i=0;i<3;i++){
	    	 input[i] = Integer.parseInt(st.nextToken());
	    	 }
	     
	     int max = 0;

	     if((input[0] == input[1]) && (input[0] == input[2])){		 
	    	 System.out.println(10000+input[0]*1000);
	     }else if((input[0] != input[1]) && (input[0] != input[2]) && (input[1] != input[2])){		 
	    	 max = Integer.max(input[0],input[1]);
	    	 max = Integer.max(max, input[2]);
	    	 System.out.println(max*100);
	     }else{		 
	    	 if((input[0] == input[1]) || (input[0] == input[2])){		     
	    		 max = input[0];
	    	 }else{		    
	    		 max = input[1];
	    	 }
	    	 System.out.println(1000+max*100);
	     }
	     */


	}
}
