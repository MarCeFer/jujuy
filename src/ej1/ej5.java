package ej1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar valor a");
        int a = teclado.nextInt();

        System.out.println("ingresar valor b");
        int b = teclado.nextInt();

        int c = 0;

        c = b;
        b = a;
        a = c;
        System.out.println("a vale: " + a);
        System.out.println("b vale: " + b);
    }
}
