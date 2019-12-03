package zadaniaDomowePetle;

import java.util.Scanner;

public class Zadanie17sama {

    public static void main(String[] args) {
        //a
        //int a = -200;
        //int b = -1000;
        //for (int i=a; i>=b; i--){
        //  System.out.println(i+ " ");
        //}
        //while
       /* while (a >= b) {
            System.out.println(a);
            a--;
        }*/

       //b

       /* for (int i=1000; i<=100000;i++){
            System.out.print(i +" ");
            if (i%1000==0 && i>1000){
                System.out.println();
            }
        }*/
       /* int i=1000;
        while(i<=100000){
            System.out.print(i+ " ");
            i++;
            if (i%1000==0 && i>1000){
                System.out.println();
            }
        }*/
       //c
       /* int a=5;
        int b=10;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                System.out.printf("%4d",(i*j));
            }
            System.out.println();
        }*/
        Scanner skan = new Scanner (System.in);
        //int a=1;
        //int b=1;
        System.out.print("Podaj ilość wierszy ");
        int a = skan.nextInt();
        System.out.print("Podaj ilość kolumn ");
        int b = skan.nextInt();

        for (int i=1; i<=a; i++)
        {
            for (int j=1; j<=b; j++)
            {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
    }


