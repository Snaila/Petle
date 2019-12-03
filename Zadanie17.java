package zadaniaDomowePetle;

public class Zadanie17 {
    public static void main(String[] args) {

// A
//        int a = -200, b = -1000;
//        for (int i = a; i >= b; i--) {
//            System.out.println(i);
//
//        }

//        while (a >= b) {
//            System.out.println(a);
//            a--;
//        }

//B
//        int a = 1000, b = 100000;
//        for (int i = a; i <= b; i++) {
//            System.out.print(i + " ");
//            if (i % a == 0 && i > 1000) {
//                System.out.println();
//            }
//        }

//        while (a < b) {
//            System.out.print(a + " ");
//            if (a % 1000 == 0 && a > 1000) {
//                System.out.println();
//            }
//            a++;
//        }

        int a = 5, b = 10;

        for (int i = 1; i <= a; ++i) {
            for (int j = 1; j <= 12; ++j) {
                System.out.printf("%4d", (a*b));
            }
            System.out.println();
        }


    }
}
