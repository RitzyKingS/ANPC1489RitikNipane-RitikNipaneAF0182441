/*Write a function to accept two no from the user and do the process of swapping
  without third variable*/

import java.util.Scanner;

public class swap_without_third_variable {

	int num1, num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created new object for callling non-static method through static method
		swap_without_third_variable obj=new swap_without_third_variable();
		obj.input();

	}
    void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1=sc.nextInt();
		System.out.println("Enter second number: ");
		num2=sc.nextInt();
		swap(num1, num2);
	}
	void swap(int a, int b)
	{
		a=num2;
		b=num1;
		System.out.println("After the process of swapping");
		System.out.println("First number: "+a);
		System.out.println("Second number: "+b);
		return;
	}
}
