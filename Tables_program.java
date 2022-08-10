//WAP to accept a no from the user and display the multiplication table 1*1=1

import java.util.Scanner;

public class tables_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, num, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=sc.nextInt();
		
		for(i=1;i<=12;i++)
		{
			res= num * i;
			System.out.print(res+"\t");
		}

	}

}
