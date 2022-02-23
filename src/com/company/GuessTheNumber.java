package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int computerNum=random.nextInt(100)+1;
        boolean guess=false;
        while(!guess)
        {
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if(num>=1 &&num<=100)
            {
                if(num==computerNum) {
                    System.out.println("you have guessed");
                    guess=true;
                }
                else if(num>computerNum)
                    System.out.println("too high");
                else
                    System.out.println("too less");

            }
            else
            {
                System.out.println(" invalidguess try agin");
            }
        }


    }
}
