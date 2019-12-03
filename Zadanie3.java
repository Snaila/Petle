package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie3 {
    private int parametr;

    public static void wypiszHelloWorldJezeliParamWiekszyOdZero() {
        System.out.println("Wpisz liczbę ");
        boolean wyjscie = true;

        while (wyjscie) {
            Scanner skaner = new Scanner(System.in);
            int parametr= skaner.nextInt();

            if (parametr <= 0) {
                wyjscie = false;
                System.out.println("Wyjscie");
                break;

            }
            System.out.println("Hello World");
        }


    }

    public static void main(String[] args) {
        wypiszHelloWorldJezeliParamWiekszyOdZero();
    }
}


