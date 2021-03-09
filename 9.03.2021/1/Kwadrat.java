package pl.Skalinski;


public class Kwadrat implements Figura{

    private int bok;
    private int bok2;
    private int pole;
    private int obwod;


    @Override
    public void obliczPole() {
        int bok = 3;
    int pole = bok * bok;
        System.out.println("Pole = "+ pole);
    }

    @Override
    public void obliczObwod() {
        int bok = 3;
        int obwod = bok + bok + bok + bok;
        System.out.println("Obwod = "+ obwod);
    }
}
