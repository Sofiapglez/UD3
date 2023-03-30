package problema1;

import problema1.Calculadora;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N;
        int opcion = 0;
        System.out.println("Introduce un número: ");
        N = teclado.nextDouble();
        Calculadora.factorialDeN(N);
        System.out.println("EL factorial es: " + Calculadora.factorialDeN(N));
        Calculadora.mediaHastaN(N);
        System.out.println("La media hasta el número es: " + Calculadora.mediaHastaN(N));

            }
        }