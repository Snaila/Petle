package zadaniaDomowePetle;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);

        System.out.println("Podaj ilośc liczb:");
        int N = skan.nextInt();
        System.out.println("Wymień te liczby:");
        int[] tablicaWymienionychLiczb = new int[N];
        for (int i = 0; i < tablicaWymienionychLiczb.length; i++) {
            tablicaWymienionychLiczb[i] = skan.nextInt();
        }
        Arrays.sort(tablicaWymienionychLiczb);
        int suma= (tablicaWymienionychLiczb[0]+tablicaWymienionychLiczb[tablicaWymienionychLiczb.length-1]);
        System.out.println("Suma najmniejszej i największej z liczb wynosi:");
        System.out.println(suma);
        int sumaWszystkich=0;
        for (int i=0; i<tablicaWymienionychLiczb.length; i++){
            sumaWszystkich+=tablicaWymienionychLiczb[i];
        }
        System.out.println("Suma wszystkich tych liczb wynosi:");
        System.out.println(sumaWszystkich);
        int srednia= sumaWszystkich/N;
        System.out.println("średnia tych liczb wynosi:");
        System.out.println((double) srednia);


    }
}
