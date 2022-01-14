package test;

public class main {
    public static void main(String[] args) {



    try {
        int coso = 1/0;

        System.out.println(coso);

    }catch ( ArithmeticException sss ){

        System.out.println("salto el coso " + sss);

    }



}
}
