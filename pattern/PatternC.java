package pattern;

import java.util.Scanner;

public class PatternC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
	for(int i = 1; i <= n; i++) {	
		for(int j = 1; j <= i - 1; j++) {
	             System.out.print("  ");		
		}
     for(int k = 1; k <= n - i + 1; k++) {
    	 System.out.print("* ");
     }
         	System.out.println();
	            }
           }
    }