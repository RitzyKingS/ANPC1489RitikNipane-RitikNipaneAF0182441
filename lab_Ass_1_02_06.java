package com.company;

import java.util.Scanner;

public class lab_Ass_1_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        for(int i=0;i<array.length;i++){

            System.out.println("Enter the "+(i+1)+" number");
            array[i]=sc.nextInt();
            sum+=array[i];
        }

        System.out.println("The sum is:"+ sum);
    }
}
