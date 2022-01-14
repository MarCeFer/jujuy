import java.util.Scanner;

public class ej12b {
    public static void main(String[] args) {
        //estaEnA numeros de un solo digito
        //estaEnB numero impar
        // estaEnAmbos   -  noEstaEnNinguno

        Scanner teclado = new Scanner(System.in);

        int num = 0;
        boolean estaEnA = false;
        boolean estaEnB = false;

        System.out.println("Ingrese un num");
        num = teclado.nextInt();

        //verifica que el numero sea de un solo digito
        if (num >= 0 && num <= 9) {
            estaEnA = true;
        }
        //verifica que el numero sea impar
        if (num % 2 == 1) {
            estaEnB = true;
        }
        // se usa ! para negar
        if (!estaEnA && !estaEnB) {
            System.out.print("no Esta En Ninguno");
        } else if (estaEnA && estaEnB) {
            System.out.print("Esta En Ambos");

        }
        if (estaEnA  && !estaEnB ) {
            System.out.println("Esta En A");
        } else if (estaEnB && !estaEnA) {
            System.out.println("Esta En B");
        }
    }
}
