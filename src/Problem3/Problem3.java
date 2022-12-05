package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void Exercitiul3(int n) {
        System.out.println("Introduceti un numar pozitiv: ");
        Scanner numar = new Scanner(System.in);
        int nr = numar.nextInt();
        if (nr >= 1) {
            for (int i = 0; i < 10; i++) {
                System.out.println(nr + " * " + (i + 1) + " = " + (nr * (i + 1)));
            }
        } else {
            System.out.println("Trebuie sa alegi un numar pozitiv.");
        }
    }
}
