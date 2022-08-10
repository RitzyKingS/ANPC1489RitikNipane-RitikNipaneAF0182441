import java.util.Scanner;

public class Exercise6 {

 public static void main(String[] args){
  Scanner in = new scanner(System.in);
  
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
  
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
  
  
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
  
  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
  
  System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
  
  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
   
  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
 }
}



output:

Input first number: 130
Input second number: 25
130 + 25 =155
130 - 25 =105
130 * 25 =3250
130 / 25 =5.2
130 % 25 =5.2
