package pl.com.dziendobry.DodatkoweCwiczenia;

public class Wynik {
    public static void main(String[] args) {
        Wynik w = new Wynik();
        w.doDziela();
    }
    void doDziela(){
        int y = 7;
        for(int x=1; x<8; x++){
            y++;
            System.out.println("x " + x);
            System.out.println("y " + y);

            if(x>4){
                System.out.println(++y + "y ");
            }
            if(y>14){
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
