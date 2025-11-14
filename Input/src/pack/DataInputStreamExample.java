package pack;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) {
        // Create a DataInputStream to read data from the console
        try (DataInputStream dataInputStream = new DataInputStream(System.in)) {
            
            // Prompt user for input
            System.out.println("Enter an integer:");
            int userInt = dataInputStream.readInt();
            
            System.out.println("Enter a double:");
            double userDouble = dataInputStream.readDouble();
            
            System.out.println("Enter a character:");
            char userChar = dataInputStream.readChar();

            // Display the inputs
            System.out.println("\nYou entered:");
            System.out.println("Integer: " + userInt);
            System.out.println("Double: " + userDouble);
            System.out.println("Character: " + userChar);
            
        } catch (IOException e) {
            // Handle the exception if there is an issue with the input
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}



