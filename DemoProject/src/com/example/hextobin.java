package com.example;

public class hextobin{
	
    public static void main(String[] args) {
        String hex = "1b";
        String binary = "";
        
        String hextobinary = ""; 

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);

            switch (Character.toLowerCase(ch)) {
                case '0': hextobinary = "0000";
                break;
                case '1': hextobinary = "0001"; 
                break;
                case '2': hextobinary = "0010";
                break;
                case '3': hextobinary = "0011"; 
                break;
                case '4': hextobinary = "0100";
                break;
                case '5': hextobinary = "0101";
                break;
                case '6': hextobinary = "0110"; 
                break;
                case '7': hextobinary = "0111";
                break;
                case '8': hextobinary = "1000"; 
                break;
                case '9': hextobinary = "1001";
                break;
                case 'a': hextobinary = "1010"; 
                break;
                case 'b': hextobinary = "1011";
                break;
                case 'c': hextobinary = "1100"; 
                break;
                case 'd': hextobinary = "1101"; 
                break;
                case 'e': hextobinary = "1110"; 
                break;
                case 'f': hextobinary = "1111"; 
                break;
                default:
                    System.out.println("Invalid Hexadecimal Input");
                    return; 
            }
            
            binary += hextobinary;
        }

        System.out.println("Hex: " + hex);
        System.out.println("Binary: " + binary);
    }
}