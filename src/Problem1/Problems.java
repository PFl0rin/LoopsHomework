package Problem1;

import java.util.Scanner;

public class Problems {

    public static void AlegeExercitiu (int a) {
        Scanner numberN = new Scanner(System.in);
            System.out.println("Scrie numarul n de randuri: ");
            int n = numberN.nextInt();


        switch (a) {
            case 1:
                System.out.println("Exercitiul 1");
                Exercitiul1(n);
                break;
            case 2:
                System.out.println("Exercitiul 2");
                Exercitiul2(n);
                break;
            case 3:
                System.out.println("Exercitiul 3");
                Exercitiul3(n);
                break;
            case 4:
                System.out.println("Exercitiul 4");
                Exercitiul4(n);
                break;
            case 5:
                System.out.println("Exercitiul 5");
                Exercitiul5(n);
                break;
            case 6:
                System.out.println("Exercitiul 6");
                Exercitiul6(n);
                break;
            default:
                System.out.println("Poti alege doar exercitiile intre valorile 1 si 6.");
                break;
        }
    }


    public static void Exercitiul1 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 2*(n-i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Exercitiul2 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void Exercitiul3 (int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Exercitiul4 (int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
                System.out.print("*");

            System.out.println("");
        }
    }

    public static void Exercitiul5 (int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
                System.out.print("*");

            System.out.println("");
        }
    }

    public static void Exercitiul6(int n) {
        int k = 1;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<i+1; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
