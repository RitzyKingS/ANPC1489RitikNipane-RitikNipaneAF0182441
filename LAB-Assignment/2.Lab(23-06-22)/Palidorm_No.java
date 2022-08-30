package Functions;
import java.util.*;
class Palidorm_No
{

    public static void palidorm()
    {
        Scanner sc = new Scanner(System.in);
       
       int n, r,sum=0,temp;    
       
       System.out.print("Please the no : ");
       n= sc.nextInt();
  
        temp=n;

        while(n>0)
        {    
            r = n%10;  
            sum = (sum*10)+r;    
            n = n/10;    
        }

        if(temp==sum)    
        System.out.println("Palindrome number :  "+sum);    
        else    
        System.out.println("Not palindrome : ");    
     }
    

    public static void main(String[] args)
    {

        palidorm();
    }

}
