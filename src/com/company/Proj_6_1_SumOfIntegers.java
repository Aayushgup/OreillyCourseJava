package com.company;

import java.util.ArrayList;

public class Proj_6_1_SumOfIntegers {
    public static void main(String[] args) {
      ArrayList<Integer> arr=new ArrayList<>();
      arr.add(16);
      arr.add(33);
      arr.add(939);
      arr.add(32);
        System.out.println(sum(arr));
    }
    public static int sum(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum += arr.get(i);
        return sum;
    }
}
