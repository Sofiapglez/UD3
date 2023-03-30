package problema1;

import java.util.Scanner;

public class Calculadora {
    public static double factorialDeN(double N) {
        if (N < 0) {
            System.out.println("Introduce un valor positivo");
        }
        double factorial = 1;

        while (N > 1) {
            factorial = factorial * N;
            N--;

        }
        return factorial;

        }

        public static double mediaHastaN(double N) {
        if (N < 0) {
            System.out.println("Introduce un valor positivo");
        }
        double media = 1;

            while (N > 1) {
                media = media + N;
                N--;
            }
            return media/N;
        }
    }
