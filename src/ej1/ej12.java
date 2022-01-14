package ej1;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        //estaEnA numeros de un solo digito
        //estaEnB numero impar
        // estaEnAmbos   -  noEstaEnNinguno

        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int estaEnA = 0;
        int estaEnB = 0;

        System.out.println("Ingrese un num");
        num = teclado.nextInt();

        if (num >= 0 && num <= 9) {
            estaEnA = 1;
        }
        if (num % 2 == 1) {
            estaEnB = 1;
        }
        if (estaEnA == 0 && estaEnB == 0) {
            System.out.println("no Esta En Ninguno");
        } else if (estaEnA == 1 && estaEnB == 1) {
            System.out.println("Esta En Ambos");

        }
        if (estaEnA == 1 && estaEnB == 0) {
            System.out.println("Esta En A");
        } else if (estaEnB == 1 && estaEnA == 0) {
            System.out.println("Esta En B");
        }
    }
}
