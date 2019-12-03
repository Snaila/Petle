package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj liczbę początkową:");
        int poczatekZakresu=skan.nextInt();
        System.out.println("Podaj liczbę końcową:");
        int koniecZakresu=skan.nextInt();
        while(koniecZakresu<=poczatekZakresu){
            System.out.println("Początek zakresu musi być mniejszy niż koniec!!Spróbuj jeszcze raz, podaj koniec zakresu:");
            koniecZakresu=skan.nextInt();
        }
        //a)
        System.out.println("Podaj dzielnik:");
        int dzielnik= skan.nextInt();
        for (int i=poczatekZakresu; i<=koniecZakresu; i++){
            if (i%dzielnik== 0){
                System.out.print(i+ ", ");
            }

        }

    }
}
