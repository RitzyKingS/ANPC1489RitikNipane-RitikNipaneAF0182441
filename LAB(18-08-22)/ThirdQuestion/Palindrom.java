package ThirdQuestion;
import java.util.Scanner;

public class Palindrom {
	Scanner sc = new Scanner(System.in);				
	String st,rev="";
	char ch;
	
	public void accept()						
	{
		System.out.print("Enter a String : ");
		st = sc.nextLine();
		st = st.toLowerCase();
		for(int i=0; i<st.length(); i++)				
		{
			ch = st.charAt(i);				
			rev = ch+rev;									
		}
		
		if(st.equals(rev))					
		{
			System.out.println("It is Palindrome String : "+rev);
		}
		else
			System.out.println("Not a Palindrome String : "+st);
				
	}
	
	public static void main(String[] args) {				
		Palindrom ob = new Palindrom();			 
		ob.accept();							
	}

}