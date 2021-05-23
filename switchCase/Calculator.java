package switchCase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
         long a = sc.nextLong();
         
         
        System.out.println("Enter The Operation");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);
        
        
        System.out.println("Enter The Second Number");
        long b = sc.nextLong();
        
        
        long result = 0;
        
        
    switch (operation) {
    case '+':
    	result = a + b;
    	break;
    case '-':
    	result = a - b;
    	break;
    case '*':
    	result = a * b;
    	break;
    case '/':
    	result = a / b;
    	break;
    default:
    System.out.println("This Operation Is Not Available Yet");
   
        }
	System.out.println("The result is " + result);
	}

}
