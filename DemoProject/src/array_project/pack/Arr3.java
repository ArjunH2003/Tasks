package pack;

import java.util.Scanner;

public class Arr3 {
	
	public static void main(String[] args) {
		
		int marks[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.println("Enter a number : ");
				marks[i][j]=sc.nextInt();
			}
			
		}
	}

}
