package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj_5_1_NamePermutation {
    public static void main(String[] args) {
        ArrayList<String> firstName=new ArrayList<>();
        ArrayList<String> lastName=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            String name=new Scanner(System.in).nextLine();
            StringBuilder sb=new StringBuilder(name);
            int index=sb.indexOf(" ");
            String fName=sb.substring(0,index);
            String lName=sb.substring(index+1);
            firstName.add(fName);
            lastName.add(lName);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(firstName.get(i) + " "+lastName.get(j));
            }
        }


    }
}
