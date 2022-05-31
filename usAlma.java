//https://app.patika.dev/gazellhatice

import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sonuc;

        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Üssünü giriniz: ");
        int b = scanner.nextInt();

        sonuc = Math.pow(a,b);
        System.out.println("Sonuc= "+sonuc);


    }
}
