package pl.com.dziendobry.DodatkoweCwiczenia.pisanie_programu;

public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortal wit = new ProstyPortal();

        int[] polozenie = {2,3,4};

        wit.setPolaPolozenia(polozenie);

        String wybranePole = "2";

        String wynik = wit.sprawdz(wybranePole);

        String wynikTestu = "niepowodzenia";

        if(wynik.equals("trafiony")){
            wynikTestu = "zakończony pomyślnie";

        }
        System.out.println(wynikTestu);
    }

}
