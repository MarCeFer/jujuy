package tp2;

import javax.swing.*;

public class ej1 {
    public static void main(String[] args) {
        //Mostrar todos los números enteros del 1 al 100.
        // Luego, mostrar los mismos números en orden inverso.

        int num = 1;
        while (num < 100) {
            System.out.println(num);
            num++;
        }

         while (num >0) {
            System.out.println(num);
            num--;
        }
    }
}
