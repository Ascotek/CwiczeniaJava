package pl.com.dziendobry.DodatkoweCwiczenia.pisanie_programu;

public class ProstyPortal {
    int[] polaPolozenia;
    int iloscTrafien;

    public void setPolaPolozenia(int[] polaPolozenia) {
        this.polaPolozenia = polaPolozenia;
    }

    public String sprawdz (String stringPole){
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudło";
        for(int pole: polaPolozenia){
            if(strzal == pole){
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if(iloscTrafien == polaPolozenia.length){
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    }

    public static void main(String[] args) {
        int iloscRuchow = 0;
        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal portal = new ProstyPortal();
        int liczbaLosowa = (int) (Math.random()*5);

        int []polozenie = {liczbaLosowa, liczbaLosowa+1,liczbaLosowa+2};
        portal.setPolaPolozenia(polozenie);

        boolean czyIstnieje = true;
        while (czyIstnieje == true){
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbe ");
            String wynik = portal.sprawdz(pole);

            iloscRuchow++;

            if(wynik.equals("zatopiony")){
                czyIstnieje = false;
                System.out.println(iloscRuchow + "ruchów");
            }
        }
    }
}
