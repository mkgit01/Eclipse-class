package pattern;

import java.util.Scanner;

public class AdvancedPattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	System.out.println("* ");

	for(int j = 2; j <= n - 1; j++) {
		System.out.print("* ");
		
		for(int i = 1; i <= j - 2; i++) {
	      System.out.print("  ");
		}
		System.out.print("* ");
		System.out.println();
	}
	if(n>1) {
	for(int k = 1; k <= n; k++) {
		System.out.print("* ");
	}
	      }
       }
   }