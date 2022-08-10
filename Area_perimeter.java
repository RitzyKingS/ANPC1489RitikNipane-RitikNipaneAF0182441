import java .util.Scanner;
public class Area_perimeter
{
     public static void main(string[] args)
     {
         int l, b, perimeter, area;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter length of rectangle:");
         l = s.nextInt();
         System.out.println("Enter breadth of rectangle:");		 
		 b = s.nextInt();
		 perimeter = 2 * (l + b);
		 System.out.println("perimeter of rectangle:"+perimeter);
		 area = l * b;
		 System.out.println("Area of rectangle:"+area);
	 }
}


OUTPUT :

Enter length of rectangle:6
Enter breadth of rectangle:7
perimeter of rectangle:26
Area of rectangle:42
