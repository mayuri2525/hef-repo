import java.util.Scanner;
public class Stringrev {
	
	 
	
	
	   public static void main(String args[])
	   {
	      String name, reverse = "";
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to reverse");
	      name = in.nextLine();
	     
	      int length = name.length();
	     
	      for (int i = length - 1 ; i >= 0 ; i--)
	         reverse = reverse + name.charAt(i);
	         
	      System.out.println("Reverse of the string: " + reverse);
	   }
	}



