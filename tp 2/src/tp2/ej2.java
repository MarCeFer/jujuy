package tp2;

import java.util.Scanner;

public class ej2 {
    //Dados dos números enteros cuya relación de valores es que el primero es menor o igual al segundo,
    // escribir la secuencia de números que existe entre ambos:
    //a) Incluyéndolos;
    //b) Excluyéndolos.
    //En la carga debemos asegurarnos de que la relación entre los valores es la correcta.
    //¿Qué pasaría si este control no se tiene en cuenta? ¿Cómo lo solucionaría?

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int dato1 = teclado.nextInt();

        System.out.println("Ingrese numero mayor o igual al numero anterior");
        int dato2 = teclado.nextInt();

        if (dato1 < dato2) {
            while (dato1 <= dato2){
            System.out.println(dato1);
            dato1++;}
        } else if (dato1 == dato2) {
            System.out.println("Los numeros son iguales");
        }
    }
}
