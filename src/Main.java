import Problem1.Problems;
import Problem2.Problem2;
import Problem3.Problem3;
import Problem4.Problem4;
import Problem5.Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Alege un exercitiul1 alege o valoare dintre 1 - 6. ");
        System.out.println("Pentru exercitiul2 scrie 7.");
        System.out.println("Pentru exercitiul3 scrie 8.");
        System.out.println("Pentru exercitiul4 scrie 9.");
        System.out.println("Pentru exercitiul5 scrie 10.");

        Scanner alegeEx = new Scanner(System.in);
        int exercitiu = alegeEx.nextInt();
        if(exercitiu <= 6) {
            Problems.AlegeExercitiu(exercitiu);
        }else if (exercitiu == 7) {
            Problem2.Exercitiul2(exercitiu);
        }else if (exercitiu == 8) {
            Problem3.Exercitiul3(exercitiu);
        }else if (exercitiu == 9) {
            Problem4.Exercitiul4(exercitiu);
        }else if (exercitiu == 10) {
            Problem5.Exercitiul5(exercitiu);
        }

    }


}