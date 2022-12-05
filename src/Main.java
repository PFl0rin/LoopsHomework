import Problem1.Problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Alege un exercitiu(1 - 6): ");
        Scanner alegeEx = new Scanner(System.in);
        int exercitiu = alegeEx.nextInt();
        Problems.AlegeExercitiu(exercitiu);

    }


}