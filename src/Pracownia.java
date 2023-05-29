import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba, Komputer> przypisania = new HashMap<>();

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer)
    {
        przypisania.put(uczen, komputer);
    }


    public void wyswietlPracowanie()
    {
        Set<Map.Entry<Osoba, Komputer>> x = przypisania.entrySet();

        for(Map.Entry<Osoba, Komputer> c : x )
        {
            System.out.println(c.getKey().getImie() + "," + c.getKey().getNazwisko() + " -> " + c.getValue().getNumer());
        }

    }

}
