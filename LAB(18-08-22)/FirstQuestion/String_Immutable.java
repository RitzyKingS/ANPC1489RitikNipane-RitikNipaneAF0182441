package FirstQuestion;
import java.util.Scanner;

public class String_Immutable {
	Scanner sc = new Scanner(System.in);						
	String str,str1,ch;
	
	String_Immutable()							
	{
		System.out.print("Enter First String here : ");			
		str = sc.nextLine();
		System.out.print("Enter Second String here : ");			
		str1 = sc.nextLine();
		System.out.println("Before Changing : "+str+" "+str1);
		check(str,str1);							
		System.out.print("Enter a String to Change : ");			
		ch = sc.nextLine();
		 str = str.concat(ch);						
		System.out.println("After Change : "+str+" "+str1);
		check(str,str1);						
		
			
	}
	void check(String x, String y)							
	{
		
		if(x == y)								
		{
			
			System.out.println("This is Mutable");
		}
		else
		{
			
			System.out.println("This is Immutable");			
		}
	}	
	
	public static void main(String[] args)						
	{
		
		new String_Immutable();						
		
	}

}