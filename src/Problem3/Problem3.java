package Problem3;

import java.util.Scanner;

public class Problem3 {
    public static void Exercitiul3(int n) {
        System.out.println("Scrie un sir de numere: ");
        Scanner numere = new Scanner(System.in);
        int sirDeNumere = numere.nextInt();
        int numarIntors =0;
        while( sirDeNumere != 0 ) {
            numarIntors = numarIntors * 10;
            numarIntors = numarIntors + sirDeNumere%10;
            sirDeNumere = sirDeNumere/10;
        }
        System.out.println("Numarul introdus intors este: " + numarIntors);
    }
}
