package pack;

import java.util.Scanner;

public class Arr2 {
	
	public static void main(String[] args) {
		
		int marks[] = new int[5];
		int count = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter the marks : ");
			marks[i] = sc.nextInt();
			if(marks[i]<40) {
				
				count++;
			}
		}
		
		
		int sum = 0;
		
		System.out.println("Subjects failed : "+count);
		
		System.out.println("Marks : ");
		for(int j=0;j<marks.length;j++) {
			System.out.println(marks[j]);
			sum+=marks[j];
		}
		
		int avg = sum/marks.length;
		System.out.println("The sum is "+sum+" average is "+avg);
	}

}
