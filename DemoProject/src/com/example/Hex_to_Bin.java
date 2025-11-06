package com.example;

public class Hex_to_Bin {
	
    public static void main(String[] args) {
        String hex = "1b";
        String binary = "";


        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.toCharArray()[i];
            int decimal = 0;

  
            if (ch >= '0' && ch <= '9') {
                decimal = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                decimal = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                decimal = ch - 'a' + 10;
            } else {
                System.out.println("Invalid Hexadecimal Input");
                return;
            }

            String bin = "";
            int count = 0;
            while (decimal > 0) {
                int rem = decimal % 2;
                bin = rem + bin;
                decimal = decimal / 2;
                count++;
            }

    
            while (count < 4) {
                bin = "0" + bin;
                count++;
            }

            binary += bin;
        }

        System.out.println("Hex: " + hex);
        System.out.println("Binary: " + binary);
    }
}
