//https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class cinZoydagi {
    public static void main(String[] args) {
        int dogumYil;
        String cinBurcu="";
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınız :");
        dogumYil=input.nextInt();
        switch (dogumYil%12) {
            case 0:
                cinBurcu = "Maymun";
                break;
            case 1:
                cinBurcu = "Horoz";
                break;
            case 2:
                cinBurcu = "Köpek";
                break;
            case 3:
                cinBurcu = "Domuz";
                break;
            case 4:
                cinBurcu = "Fare";
                break;
            case 5:
                cinBurcu = "Öküz";
                break;
            case 6:
                cinBurcu = "Kaplan";
                break;
            case 7:
                cinBurcu = "Tavşan";
                break;
            case 8:
                cinBurcu = "Ejderha";
                break;
            case 9:
                cinBurcu = "Yılan";
                break;
            case 10:
                cinBurcu = "At";
                break;
            case 11:
                cinBurcu = "koyun";
                break;
            default:
                System.out.print("Yanlış giriş yaptınız ,lütfen terker deniyiniz ");
        }
        System.out.print("Çin Zodyağınız :"+cinBurcu);
    }
}
