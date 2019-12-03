package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie13 {
    public static void tabliczkaMnożenia(int liczba) {
        for (int i = 1; i <= liczba; i++) {
            System.out.println(i + "x" + liczba + " = " + i * liczba);
        }
    }

    public static void main(String[] args) {
        Scanner skan=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba= skan.nextInt();
        tabliczkaMnożenia(liczba);

    }
}
