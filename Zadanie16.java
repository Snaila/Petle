package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String tekst = sc.nextLine();
        int suma = 0;
        for (int i = 0; i < tekst.length(); i++){
            char c = tekst.charAt(i);
            if(c >= 48 && c <= 57){
                suma += c - 48;
            }

        }
        System.out.println("Suma cyfr w tekście od Użytkownika wynosi: " + suma);

    }
}
