package com.company;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    public static void doSomething()
    {
        System.out.println("In do something ");
        System.out.println("result : "+ getresult());
    }
    public static int getresult()
    {
        return 10;
    }
}
