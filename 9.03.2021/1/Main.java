package pl.Skalinski;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kwadrat: ");
	Kwadrat kwadrat = new Kwadrat();
	kwadrat.obliczPole();
	kwadrat.obliczObwod();
        System.out.println("Trojkat: ");
	Trojkat trojkat = new Trojkat();
	trojkat.obliczPole();
	trojkat.obliczObwod();
        System.out.println("Prostokat: ");
	Prostokat prostokat = new Prostokat();
	prostokat.obliczPole();
	prostokat.obliczObwod();

    }
}
