//WAP to accept a no from user if no is even than display the square

import java.util.Scanner;

public class if_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		if(num%2==0) {
			res= num*num;
			System.out.println("The Square is=" +res);
		}

	}

}
