package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner skan= new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int A=skan.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int B= skan.nextInt();
        while (B<A){
            System.out.println("Druga liczba musi być większa od pierwszej!! spróbuj jeszcze raz, podaj drugą liczbę:");
            B=skan.nextInt();
        }
        int suma=0;
       for (int i=A; i<=B; i++){
            suma +=i;

        }
        System.out.println(suma);
        //while

        while (A<=B){
            suma+=A;
            A++;
        }
        System.out.println(suma);

    }
}
