public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("szymon","szymanski","12983742312");
        Komputer komputer1 = new Komputer();
        komputer1.setNumer(1);
        komputer1.setCzyDziala(true);

        Pracownia pracownia1 = new Pracownia();
        pracownia1.dodajKomputerDoUcznia(uczen1, komputer1);

        pracownia1.wyswietlPracowanie();
    }
}