package org.example.services;

public class CalculatorService {
    public static int sumTwoNumbers(int a,int b){
        return a+b;
    }
    public static double DivideTwoNumbers(int a,int b){
        return a/b;
    }
    public static int  MultiplyTwoNumber(int a,int b){
        return a*b;
    }
    public static int sumAnyNumbers(int ...arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
