package tp2;

public class ej6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 2;
        int d = 9;
        int promedio =((a+b+c+d)/4);

        if (promedio < 20) {
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("error! el promedio es mayor a 20");
        }
        System.out.println("Los valores leidos son :" + "a= " + a + "  b= " + b + "  c= " + c + "  d= " + d);

    }
}
