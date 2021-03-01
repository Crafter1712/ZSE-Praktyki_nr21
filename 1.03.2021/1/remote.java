package com.company;

import java.util.Scanner;

public class remote {
    int chanel;
    int volume;
    int online;


    public remote(int chanel, int volume, int online)
    { Scanner scan = new Scanner(System.in);
        this.online = online;
        System.out.println("wlaczyc tv?");
        System.out.println("1 - tak");
        System.out.println("0 - nie");
        int wybor1 = scan.nextInt();
            if(wybor1 == 1){
                int nowy = online + 5;
                System.out.println("wlaczyczony");

            this.chanel = chanel;
        System.out.println("obecny kanal = "+ this.chanel);
        System.out.println("program w dol - 2");
        System.out.println("program w gore - 1");
        int wybor2 = scan.nextInt();
        if (wybor2 == 1){
            System.out.println("O ile kanalow w gore?");
            int ilosc = scan.nextInt();
            int nowy1 = chanel + ilosc;

            System.out.println("obecny kanal = "+ nowy1 );
        }
        if (wybor2 == 2){
            System.out.println("O ile kanalow w dol?");
            int ilosc = scan.nextInt();
            int nowy1 = chanel - ilosc;
            System.out.println("obecny kanal = "+ nowy1 );
        }

            this.volume = volume;
        System.out.println("obecny vol = "+ this.volume);
        System.out.println("vol w dol - 2");
        System.out.println("vol w gore - 1");
        int wybor3 = scan.nextInt();
        if (wybor3 == 1){
            System.out.println("O ile vol w gore?");
            int ilosc = scan.nextInt();
            int nowy2 = volume + ilosc;
            System.out.println("obecny vol = "+ nowy2 );
        }
        if (wybor3 == 2){
            System.out.println("obecny vol = "+ this.volume);
            System.out.println("O ile vol w dol?");
            int ilosc = scan.nextInt();
            int nowy2 = volume - ilosc;
            System.out.println("obecny vol = "+ nowy2 );
        }
            }else {
                System.out.println("dowidzenia");
            }
    }
}
