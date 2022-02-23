package com.company;

public class Recursion {
    public static void main(String[] args) {
       // countDown(10);
        countUpTo(1,10);
    }
    public static void countDown(int num)
    {
        if(num>0) {
            System.out.println(num);
            countDown(num - 1);
        }
        else
            return;
    }
    public static void countUpTo(int num1,int num2)
    {
         if(num1<=num2)
         {
             System.out.println(num1);
             countUpTo(num1+1,num2);
         }
    }
}
