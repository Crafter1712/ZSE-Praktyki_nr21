package pl.Skalinski;

public class Main {

    public static void main(String[] args) {

        osoba Andrzej = new osoba("Andrzej",1970);
        try {
            System.out.println(obliczWiekOsobyWDanymRoku(Andrzej,1960));
        }catch (InvalidAgeException e) {
            System.out.println("Podano nieprawidlowy rok!" + e.getMessage());
        }finally {
            System.out.println("blablal");
        }
    }

    private static int obliczWiekOsobyWDanymRoku(osoba osoba,int rok) {
        int wiek = rok-osoba.getRokUrodzenia();
        if(wiek<0) {
            throw new InvalidAgeException(osoba, rok);
        }else {
            return wiek;
        }
    }
}