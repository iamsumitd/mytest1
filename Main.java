package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String withrawalamount;
        System.out.println("Enter the amount");
        withrawalamount =input.next();
        int money;
        money= input.nextInt();
        int sum = 1000 - money;
        System.out.println("Remaining balance: " + sum);









    }
}
