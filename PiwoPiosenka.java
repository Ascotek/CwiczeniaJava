package pl.com.dziendobry.DodatkoweCwiczenia;

public class PiwoPiosenka {
    public static void main(String[] args) {
        int iloscButelek = 99;
        String slowo = "bootles";
        while (iloscButelek > 0) {
            if (iloscButelek == 1) {
                slowo = "bottle";
            }
            System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
            System.out.println(iloscButelek + " " + slowo + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            iloscButelek = iloscButelek - 1;
            if (iloscButelek <= 0) {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}
