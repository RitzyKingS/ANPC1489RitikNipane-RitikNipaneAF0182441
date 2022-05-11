//WAP to accept a no from user and check is even or odd

import java.util.Scanner;

public class if_else_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}

	}

}
