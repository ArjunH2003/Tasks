package pack;

import java.util.Arrays;

import java.util.Scanner;


public class Products {

int prdno;

String prdname;

int prdprice;

Scanner sc=new Scanner(System.in);

Products prd[]=new Products[3];

void addProducts()

{

for(int i=0;i<prd.length;i++)

{

prd[i]=new Products();

System.out.println("Enter product No");

prd[i].prdno=sc.nextInt();

System.out.println("Enter Product Name");

prd[i].prdname=sc.next();

System.out.println("Enter product Price");

prd[i].prdprice=sc.nextInt();

}


}

void placeOrder() {
    int total = 0;
    System.out.println("\nEnter number of items to order:");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.println("Enter product number to order:");
        int orderNo = sc.nextInt();
        boolean found = false;

        for (int j = 0; j < prd.length; j++) {
            if (prd[j].prdno == orderNo) {
                System.out.println("Added: " + prd[j].prdname + " - Rs" + prd[j].prdprice);
                total += prd[j].prdprice;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    System.out.println("Total cost: ₹" + total);
}


void displayProducts()

{

for(int i=0;i<prd.length;i++)

{

System.out.println(prd[i].prdname+" "+prd[i].prdprice);

}

}

@Override

public String toString() {

return "Products [prdno=" + prdno + ", prdname=" + prdname + ", prdprice=" + prdprice + ", sc=" + sc + ", prd="

+ "]\n";

}

public static void main(String[] args) {

Products p=new Products();

p.addProducts();

p.displayProducts();

p.placeOrder();

}

}




