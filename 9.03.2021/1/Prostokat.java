package pl.Skalinski;

public class Prostokat implements Figura {
    private int bok;
    private int bok2;
    private int pole;
    private int obwod;


    @Override
    public void obliczPole() {
        int bok = 3;
        int bok2 = 4;
        int pole = bok * bok2;
        System.out.println("Pole = "+ pole);
    }

    @Override
    public void obliczObwod() {
        int bok = 3;
        int bok2 = 4;
        int obwod = bok + bok + bok2 + bok2;
        System.out.println("Obwod = "+ obwod);
    }
}
