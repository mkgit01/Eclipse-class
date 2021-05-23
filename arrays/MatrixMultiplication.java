package arrays;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		row1 col1
//		row2 col2
//		dimensionOfrow1 == dimensionOfcol2
//		multiplication = row1*col2
		System.out.println("Enter the dimension of the first matrix:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		System.out.println("Enter the dimension of the second matrix:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		if(r1 != c2) {
			System.out.println("Error:dimension of row and column should be same!");
		}
		int firstMatrix[][] = new int [r1][c1];
		int secondMatrix[][] = new int [r2][c2];
		
	System.out.println("Enter the first matrix:");
	for(int i = 0; i < r1; i++) {
		for(int j = 0; j < c1; j++) {
			firstMatrix[i][j] = sc.nextInt();
        	}
	 }
    System.out.println("Enter the second matrix:");

    for(int i = 0; i < r2; i++) {
    	for(int j = 0; j < c2; j++) {
    		secondMatrix[i][j] = sc.nextInt();
    	}
}          //r1*c2 
    int resultMatrix[][]=new int[r1][c2];
	for(int i = 0; i < r1; i++) {
      	 for(int j = 0; j < c2; j++) {
      		 
      	 }
      		}
   	}    
//    		firstMatrix=r1 c1  secondMatrix=r2 c2
//    		  product=r1 * c2
    		 
    
    System.out.print("The result array is:");
  