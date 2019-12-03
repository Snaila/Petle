package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią:");
        int n= skan.nextInt();
        while (n <= 0){
            System.out.println("Musisz podać liczbę większą niż 0, spróbuj jeszcze raz:");
            n = skan.nextInt();
        }
        int potega=1;

        while(potega*2<=n){
            System.out.println(potega*=2);
        }

    }
}
