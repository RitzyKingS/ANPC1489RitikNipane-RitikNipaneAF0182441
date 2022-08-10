/*Write a function to accept two no from the user and do the process of swapping
  With third variable */

import java.util.Scanner;

public class swap_with_third_variable {

	int num1, num2, temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created new object for calling non-static method from static method
		swap_with_third_variable obj=new swap_with_third_variable();
		obj.input();
		obj.swap();
		
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Before swapping process\nNumbers are: " +num1+"  "+num2+"\n");
		return;//it will return to the place from where input() method had been called
	}
	void swap()
	{
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping process\nNumbers are: " +num1+"  "+num2);
	}

}
