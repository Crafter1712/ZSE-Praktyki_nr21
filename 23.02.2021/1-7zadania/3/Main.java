package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        double fahrenheit;
        System.out.println("Ile jest stopni celscjusza?");
        double celsius = scan.nextDouble();
        fahrenheit = (9/5) * celsius + 32;
        System.out.println(celsius + " stopni celscjusza to " + fahrenheit + " stopni fharenheita");


	// write your code here
    }
}
