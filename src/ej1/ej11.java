package ej1;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad = 0;
        double altura = 0;

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        System.out.println("Ingrese su altura");
        altura = teclado.nextDouble();

        if (edad >= 7 || altura >= 1.50) {
            System.out.println("Puede pasar al juego");
        } else {
            System.out.println("Andate a tu casa vovo");
        }


    }
}
