package zadaniaDomowePetle;

import java.util.Random;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        //losowanie liczby z zakresu 1-100
        Random rand = new Random();
        Scanner skan = new Scanner(System.in);
        int wylosowanaLiczba = rand.nextInt(100) + 1;

        boolean trafionaLiczba= false;
        System.out.println("Użytkowniku podaj liczbę od 1-100");
        while(!trafionaLiczba){
        int zgadywanaLiczba = skan.nextInt();

            if (zgadywanaLiczba > wylosowanaLiczba) {
                System.out.println("Podałeś za dużą wartość, próbuj ponownie");
            } else if (zgadywanaLiczba < wylosowanaLiczba) {
                System.out.println("Podałeś za małą wartość, próbuj ponownie");
            } else if (zgadywanaLiczba == wylosowanaLiczba) {
                System.out.println("Gratulacje");
                trafionaLiczba= true;
            }

        }
        System.out.println("Wylosowana liczba:");
        System.out.println(wylosowanaLiczba);

    }
}
