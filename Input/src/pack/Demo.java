package pack;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the console
    	
    	 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	 
        try {
            
            // Prompt user for input
            System.out.println("Enter an integer:");
            String intInput = bufferedReader.readLine();
            int userInt = Integer.parseInt(intInput);  // Convert string to integer
            
            System.out.println("Enter a double:");
            String doubleInput = bufferedReader.readLine();
            double userDouble = Double.parseDouble(doubleInput);  // Convert string to double
            
            System.out.println("Enter a character:");
            String charInput = bufferedReader.readLine();
            char userChar = charInput.charAt(0);  // Get the first character of the input string

            // Display the inputs
            System.out.println("\nYou entered:");
            System.out.println("Integer: " + userInt);
            System.out.println("Double: " + userDouble);
            System.out.println("Character: " + userChar);
            
        } catch (IOException e) {
            // Handle the exception if there is an issue with the input
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle invalid number format input
            System.out.println("Invalid number format! Please enter correct data types.");
        }
    }
}
