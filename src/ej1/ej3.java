package ej1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor para n1");
        int n1 = teclado.nextInt();
       // System.out.println(n1);

        System.out.println("Ingrese valor para n2");
        int n2 = teclado.nextInt();

        System.out.println("La multiplicacion entre n1 y n2 da: " + (n1 * n2));


    }
}
