public class Uczen extends Osoba {
    private String klasa;
    private boolean czyZdaje;


    public Uczen(String imie, String nazwisko, String PESEL) {
        super(imie, nazwisko, PESEL);
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public boolean isCzyZdaje() {
        return czyZdaje;
    }

    public void setCzyZdaje(boolean czyZdaje) {
        this.czyZdaje = czyZdaje;
    }
}
