package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj tekst do sprawdzenia czy jest to palindrom:");
        String tekst= skan.next();
        //String tekst = "Ko był  a ma ma   ły bo k";
        boolean jestPalindomem = true;
        char[] znaki = tekst.trim().toUpperCase().replace(" ", "").toCharArray();
        for (int i = 0; i <= znaki.length / 2; i++) {
            // znak z drugiego konca tablicy
            char znakOdpowiadajacy = znaki[znaki.length - i - 1];
            System.out.println("Znak to: " + znaki[i] + " a odpowiada mu " + znakOdpowiadajacy);
            if (znaki[i] != znakOdpowiadajacy) {
                jestPalindomem = false;
                break;
            }
        }
        if (jestPalindomem) {
            System.out.println("Sukces! Mamy palindom!");
        } else {
            System.out.println("To nie jest palindrom!");
        }
    }

}
