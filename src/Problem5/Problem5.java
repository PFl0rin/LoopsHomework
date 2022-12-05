package Problem5;

import java.util.Scanner;

public class Problem5 {

    public static void Exercitiul5(int n) {
        System.out.println("Introduceti un numar: ");
        Scanner numar = new Scanner(System.in);
        int nr = numar.nextInt();

        int firstNumber = 0, secondNumber = 1;
        System.out.println("Sirul Fibonacci cu primele " + nr + " numere:");

        for (int i = 1; i <= nr; ++i) {
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
