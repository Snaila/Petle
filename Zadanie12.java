package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie12 {
    public static void czyWiekszaOdZera(int liczba){
        if (liczba>0){
            System.out.println("Liczba jest większa od 0");
        }else if (liczba<=0){
            System.out.println("Liczba nie jest większa od 0");
        }
    }
    public static boolean czyLiczbaJestPierwsza(int liczba){
        if (liczba<2){
            return false;
        }
        for (int i=2; i<=liczba/2; i++){
            if(liczba%i==0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner skan=new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba=skan.nextInt();
        czyWiekszaOdZera(liczba);

       if (czyLiczbaJestPierwsza(liczba)){
           System.out.println(liczba+ " jest pierwsza");
       }else{
           System.out.println(liczba+ " nie jest pierwsza :(");

       }
    }
}
