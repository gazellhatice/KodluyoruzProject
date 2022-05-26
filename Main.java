//Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
//https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double heat;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        heat = inp.nextDouble();

        if (heat < 5){
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }else if(heat <= 15){
            System.out.println("Sinemaya gidebilirisiniz. ");
        }if((heat >= 10) && (heat <= 25)){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else if(heat >= 25){
            System.out.print("Yüzmeye gidebilirsiniz. ");
        }
    }
}
