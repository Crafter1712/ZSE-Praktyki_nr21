package pl.Skalinski;

public class osoba {
    private String imie;
    private int rokUrodzenia;
    public osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }
    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return String.format("%s , rok urodzenia : %d" , imie , rokUrodzenia);
    }
}

