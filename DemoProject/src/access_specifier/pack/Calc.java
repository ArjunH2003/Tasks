package pack;


public class Calc {

public static void add(int x,int y)

{

System.out.println("The addition of "+x+" and "+y+" is "+(x+y));

}

public void sub(int x,int y)

{

System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));

}

public int mul(int x,int y)

{

return(x*y);

}


protected static void display(int x,int y) {
	
	System.out.println("The numbers are "+x+" and "+y);
	
}


protected void hai(int x,int y) {
	
	System.out.println("Say hai to "+x+" and "+y);
}

public static void main(String[] args) {

Calc.add(22,33);

Calc c=new Calc();

c.sub(33,11);

System.out.println(c.mul(22, 2));

Calc.display(6, 18);

c.hai(72, 108);


}

}