package com.company;

public class Kwadrat {
    int bok;
    int obw;
    int pole;

    public Kwadrat(int bok){
        this.bok = bok;
        this.obw = bok+bok+bok+bok;
        System.out.println("Obwod = " + this.obw);
        this.pole = bok*bok;
        System.out.println("Pole = " + this.pole);
    }


}

