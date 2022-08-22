package SecondQuestion;

import java.util.Scanner;

public class Stringscontainsornot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.next();
        System.out.println("Enter second string");
        String s2 = sc.next();
        int lenghtogs1= s1.length();
        int lenghtogs2= s2.length();

        boolean s = false;
        if (lenghtogs1 == lenghtogs2){
            for(int i=0 ;i<lenghtogs1;i++){
                if(s1.charAt(i)==s2.charAt(i)){
                    s= true;
                    break;
                }
            }
            System.out.println("String contains same character");
        }
        else{
            System.out.println("Size is not equal");


        }

    }

}