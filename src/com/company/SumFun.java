package com.company;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        num = sc.nextInt();
        while (num >= 0) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
