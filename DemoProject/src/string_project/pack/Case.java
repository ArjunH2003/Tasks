package pack;

public class Case {
	
	public static void main(String[] args) {
	
	String str= "WeLcOmE";
	
	String output = "";
	
	for(int i=0;i<str.length();i++)
	{
		int ascii = (int)str.charAt(i);
		if(ascii>=65 && ascii<=90)
		{
			output+=String.valueOf((char)ascii).toLowerCase();
		}
		else {
			
			output+=String.valueOf((char)ascii).toUpperCase();
		}
		
	}
	
	System.out.println(output);

}
}
