import java.io.*;
import java.util.*;

public class Q {
	public static void main(String[] args) throws IOException {
		int[] arr = {1,2,3,4,5};    
		for(int i = 0; i < arr.length; i++) {
		       System.out.println(arr[i]);
		}
		for(int number : arr) {
		       System.out.println(number);
		}
	}
}
