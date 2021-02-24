package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę 1");
        int a = scan.nextInt();
        System.out.println("Podaj liczbę 2");
        int b = scan.nextInt();
        System.out.println("Podaj liczbę 3");
        int c = scan.nextInt();
        if (a + b > c)
            System.out.println("Tak");

        else

            System.out.println("Nie");
    }
        }



