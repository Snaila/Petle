package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie11 {
    public static void dzielniki(int liczba) {

        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner skan=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=skan.nextInt();
       dzielniki(liczba);

    }

}
