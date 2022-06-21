package NelerYapilir;

import java.util.Scanner;

public class SicaklikaGore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float havaSicakligi;
        System.out.print("Hava sicaligini giriniz: ");
        havaSicakligi = input.nextFloat();

        if (havaSicakligi >= -15 && havaSicakligi < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (5<= havaSicakligi && havaSicakligi <=15){
            System.out.println("Sinemaya filmi izleyebilirsiniz.");
        } else if (16<= havaSicakligi && havaSicakligi <=25){
            System.out.println("Ailen yada arakdaslarinla piknige gidebilirsiniz..");
        } else if (47 > havaSicakligi && havaSicakligi > 25){
            System.out.println("Serinlemek icin plaja gidebilirsin.");
        } else {
            System.out.println("Extream kosullarda aktiviteni evde yapip, evde sosyallesebilirsiniz.");
        }
    }
}









