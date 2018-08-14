package sample.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangleLoop {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("Enter the Triangle number:");
	    String line1= br.readLine().trim();
	    int loopNumber= Integer.valueOf(line1);
	    for (int i = 0; i < loopNumber; i++) {
			for (int j = loopNumber; j > i; j--) {
				System.out.print("-");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("$-");
			}
			System.out.println();
		}
	    
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

}
}
