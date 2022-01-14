package tp2;

public class ej4 {
    public static void main(String[] args) {
        int a = 8;
        int contador = 0;
        int contador2 = 1;

        while ( contador < 100 && contador2 <= 10) {
            contador = (a * contador2);
            System.out.println(contador);
            contador2++;
        }
    }
}
