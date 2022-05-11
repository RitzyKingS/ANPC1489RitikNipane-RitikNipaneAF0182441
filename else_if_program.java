//WAP to accept a character from user and check it is vowel or not

import java.util.Scanner;

public class else_if_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char al;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet:");
		al=sc.next().charAt(0);
		
		if(al=='a'||al=='e'||al=='i'||al=='o'||al=='u') {
			System.out.println(al+" is lowercase vowel");
		}
		
		else if(al=='A'||al=='E'||al=='I'||al=='O'||al=='U') {
			System.out.println(al+" is uppercase vowel");
		}
		
		else {
			System.out.println(al+" is consonant");
		}
		
		
	}

}
