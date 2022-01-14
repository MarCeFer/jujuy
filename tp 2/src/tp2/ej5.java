package tp2;
public class ej5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 9;

        if (a < b && a < c) {
            System.out.println("El numero A es el menor de todos");
        } if (b < a && b <c) {
            System.out.println("El numero B es el menor de todos");
        } else {
            System.out.println("El numero C es el menor de todos");
        }
    }
}
