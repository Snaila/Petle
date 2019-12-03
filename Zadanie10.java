package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        char znakGwiazdki = '*';
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilosc wierszy choinki: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j < (n - i) || j > (n + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(znakGwiazdki);
                }
            }
            System.out.println();
        }
    }
}

