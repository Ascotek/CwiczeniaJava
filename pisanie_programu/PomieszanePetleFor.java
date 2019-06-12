package pl.com.dziendobry.DodatkoweCwiczenia.pisanie_programu;

public class PomieszanePetleFor {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for(int zewn = 0; zewn<3; zewn++){
            for(int wew = 4; wew>1; wew--){
                x++;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x +3;
            }
            y = y-2;
        }
        System.out.println(x + " " + y);
    }
}
