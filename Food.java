import java.util.Scanner;
class Food
{
public static void main(String args[])
{
int choice,amount=0;
int choice1=0,qty1=0;
int choice2=0,qty2=0;
int choice3=0,qty3=0;
char extra;
Scanner sc=new Scanner(System.in);
System.out.println("\t Raju food corner:");
do
{
System.out.println("\t1.Starter courses   \t 2.Main courses  \t 3.Desert courses");
System.out.println("Enter your choice:");
choice=sc.nextInt();
switch(choice)
{
case 1:
    System.out.println("1.Sabudana wada of rs 100");
    System.out.println("2.masala dosa of rs 150");
    System.out.println("3.Sandwich of rs 80");
   System.out.println("What do you want enter your number:");
   choice1=sc.nextInt();
   System.out.println("Enter your quantity:");
   qty1=sc.nextInt();
   switch(choice1)
     {
           case 1:
                amount+=qty1*100;
             break;              
           case 2:
                 amount+=qty1*100;
             break;              
           case 2:
                amount+=qty1*150;
             break;              
           case 3:
                amount+=qty1*80;
             break;              
        }
  break;
   case 2:
    System.out.println("1.Pulav thali of rs 300");
    System.out.println("2.Biryani of rs 450");
    System.out.println("3.Veg thali of rs 700");
   System.out.println("What do you want enter your number:");
   choice2=sc.nextInt();
   System.out.println("Enter your quantity:");
   qty2=sc.nextInt();
   switch(choice2)
     {
           case 1:
                amount+=qty2*300;
             break;              
           case 2:
                amount+=qty2*450;
             break;              
           case 3:
                amount+=qty2*700;
             break;              
        }
  break;
    
case 3:
    System.out.println("Rasgulla of rs 80");
    System.out.println("Badam shake of rs 150");
    System.out.println("Natural icecream of rs 200");
   System.out.println("What do you want enter your number:");
   choice3=sc.nextInt();
   System.out.println("Enter your quantity:");
   qty3=sc.nextInt();
   switch(choice3)
     {
           case 1:
                amount+=qty3*80;
             break;              
           case 2:
                amount+=qty3*150;
             break;              
           case 3:
                amount+=qty3*200;
             break;              
        }
  
  break;
}
System.out.println("Do you want add anything else:");
extra=sc.next().charAt(0);
if(choice==1)
{
 if(choice1==1)
   {
    System.out.println("You have order sabudana wada "+ " "+qty1+" "+"Plates");
   }
   else if(choice1==2)
    {
 System.out.println("You have order masala dosa "+ " "+qty1+" "+"Plates");
    }
   else
   {
      System.out.println("You have order Sandwich "+ " "+qty1+" "+"Plates");
   }
}
else if(choice==2)
{
if(choice2==1)
   {
    System.out.println("You have order pulav thali "+ " "+qty2+" "+"Plates");
   }
   else if(choice2==2)
    {
 System.out.println("You have order biryani "+ " "+qty2+" "+"Plates");
    }
   else
   {
      System.out.println("You have order Veg thali "+ " "+qty2+" "+"Plates");
   }
  
}
else if(choice==3)
{
if(choice3==1)
   {
    System.out.println("You have order Rasgulla "+ " "+qty3+" "+"Plates");
   }
   else if(choice3==2)
    {
 System.out.println("You have order badam shake"+ " "+qty3+" "+"Plates");
    }
   else
   {
      System.out.println("You have order Natural icecream "+ " "+qty3+" "+"Plates");
   }

}
System.out.println("Sir till now your total order value is rs ="+amount);
}
while(extra=='y' || extra=='Y');
System.out.println("Thankyou for choosing us");
System.out.println("Next time come again");
}
}
