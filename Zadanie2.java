package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie2 {
    private int parametr;

    public static void forWypiszHelloWorld(int parametr) {
        for (int i = 1; i <= parametr; i++) {
            System.out.println(i + ". Hello World");
        }
    }

    public static void whileWypiszHelloWorld(int parametr){
        int i=1;
        while (i<= parametr){
            System.out.println(i + ". Hello World");
            i++;
        }
    }


    public static void main(String[] args) {
        System.out.println("podaj ilość powtórzeń");
        Scanner skaner= new Scanner(System.in);
        int podajIloscPowtorzen = skaner.nextInt();

       // whileWypiszHelloWorld(podajIloscPowtorzen);
        forWypiszHelloWorld(podajIloscPowtorzen);

    }


}

