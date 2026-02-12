package exceptionhandling;

import java.util.Scanner;

public class ATMsimulation {
    public static void withdraw(int a,int b)throws InsufficientException{
        if(b<a){
            throw new InsufficientException("Insufficient balance");
        }
        b-=a;
        System.out.println("amount withdrawal successfully");
        System.out.println("balance is :"+b);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter amount to withdraw");
        int amount=sc.nextInt();
        System.out.println("enter balance of account");
        int balance=sc.nextInt();
        try{
            withdraw(amount,balance);
        }
        catch (InsufficientException e){
            System.out.println("caught exception is"+e.getMessage());
        }
    }
}
class InsufficientException extends Exception{
    public InsufficientException(String s){
        super(s);
    }
}