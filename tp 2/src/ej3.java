public class ej3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5000;
        int contador = 0;

        while (b > 0){
            contador += a;
            System.out.println(b);
            b --;
        }
        System.out.println("Resultado: " + contador);
    }
}
