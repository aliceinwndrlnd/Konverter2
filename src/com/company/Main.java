package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите код валюты (USD,EUR,RUB): ");
        String kod1 = scan.nextLine();

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите сумму в BYN: ");
        int sum = scan1.nextInt();
        String []kod = {"USD", "EUR", "RUB"};
        double []kof = {0.398, 0.313, 3.3};
        double result = 0.0;
        String name = "";

        for (int i = 0; i < kof.length; i++) {
            if (kod1.equals(kod[i])){
                result = sum * kof[i];
                System.out.println(result + "" + name);
            break;}
        }

    }
}
