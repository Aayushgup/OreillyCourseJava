package com.company;

import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber = random.nextInt();
        System.out.println(myRandomNumber);
        myRandomNumber = random.nextInt(1000);
        System.out.println(myRandomNumber);

    }
}
