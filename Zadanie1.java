package zadaniaDomowePetle;

import org.w3c.dom.ls.LSOutput;

public class Zadanie1 {
    public static void main(String[] args) {
       /* a) for (int i=1; i<= 100; i++){
            System.out.println(i);
        } */
      /* z while
      int i=0;

       while(i<=100){
           System.out.println(i);
           i++;
       }*/
       /* b) for (int i=1000; i<=1020; i++){
           System.out.print(i + ", " + " " );
       } */
       /* z petla while
        int i = 1000;

        while (i <= 1020) {

            if (i < 1020) {
                System.out.print(i + ", " + " ");
            } else {
                System.out.print(i + ". " + " ");
            }
            i++;
        }*/

       /*c)
       for (int i= -30; i<= 1000; i++){

           if (i%5==0){
               System.out.println(i);
           }
       }*/
      /* z petla while
       int i= -30;

       while (i<= 1000){
           if (i%5==0){
               System.out.println(i);
           }
           i++;
       }*/

       /*d) for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                System.out.println(i);
            }

        }*/
      /*z while
       int i=1;

       while (i<=100){
           if (i%3==0){
               System.out.println(i);
           }
           i++;
       }*/
     /*e) for (int i=30; i<=300; i++){
          if (i%3==0){
              System.out.println(i);
          }
          else if (i%5==0){
              System.out.println(i);
          }
      }*/
     /*z while
     int i=30;
     while(i<=300){
         if (i%3==0){
             System.out.println(i);
         }else if (i%5==0){
             System.out.println(i);
         }
         i++;
     }*/

     /*f)
     for (int i= -300; i< 300; i++){
         if (i%2==0){
             System.out.print(i+1 +";");
         }
     }*/
     /* z while
     int i=-300;

     while(i<300){
         if (i%2==0){
             System.out.print(i+1+ ";");
         }
         i++;
     }*/

     /*g)   for (int i = -100; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ";");
            }
        }*/
     /* h)
     for (char i= 'a'; i<='z'; i++){

         System.out.println(i);
     }
 */
    /* z while
        char i = 'a';
        while (i <= 'z') {
            System.out.println(i);
            i++;
        }*/

    /* i)
    for (char i='A'; i<='Z'; i++){

        System.out.println(i);
    } */

       /* j) for (char i = 'A'; i <= 'Z'; i+=2) {
            System.out.println(i);

        }*/
      /* z while
        char i = 'a';
        while (i <= 'z') {
            System.out.println(i);
            i += 2;
        }*/

       /*k) for (char i = 'b'; i <= 'z'; i+=2) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
                i++;
            }
        }*/

       /* char i= 'b';
        while(i<= 'z'){
            if (i%5==0){
                System.out.println(i++);

            }
            i++;
        }*/
    }

    /* l)
    public static void wypiszHelloWorld(int licznik){

        for(int i=1; i<=licznik; i++){
            System.out.println(i + ". Hello World");
        }

        }   */
   /* public static void zWhileWypiszHelloWorld(int licznik){
        int numer= 1;
        while ( numer<= licznik){
            System.out.println(numer + ". Hello World");
            numer++;
        }
    }*/



}
