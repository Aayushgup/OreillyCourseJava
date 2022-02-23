package com.company;

import java.util.Random;

public class Arrrays2D {
    public static void main(String[] args) {
        int myArray[][]=new int [2][3];
        fillArray(myArray);
        printArray(myArray);
        twiceArray(myArray);
        printArray(myArray);
    }

    public static void fillArray(int [][] arr)
    {
        Random rand=new Random();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]= rand.nextInt(99);
        }
    }

    public static void printArray(int [][] arr)
    {
        for(int []temp :arr)
        {
            for(int num:temp)
                System.out.print(num+" ");
            System.out.println();
        }
    }
    public static void twiceArray(int [][] arr)
    {
        //Random rand=new Random();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]*=2;
        }
    }
}
