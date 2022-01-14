package ej1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar valor 1");
        int valor1 = teclado.nextInt();

        System.out.println("ingresar valor 2");
        int valor2 = teclado.nextInt();


        if(valor2 == 0)  {
            System.out.println( "Error! No se puede dividir por 0");
        } else {
            System.out.println( "La division de valor1 y valor 2 da como resultado; " + (valor1/valor2));
        }
    }
}
