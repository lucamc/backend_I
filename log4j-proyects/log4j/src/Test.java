import org.apache.log4j.Logger;

public class Test {


    private static final Logger logger = Logger.getLogger(String.valueOf(Test.class));
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1, 3);
        int suma = calculadora.sumar();
        System.out.println(suma);

        // Division que lanzara un error.
        Calculadora calculadora1 = new Calculadora(1, 0);
        calculadora1.dividir();

        // Division que se ejecutará con exito.
        Calculadora calculadora2 = new Calculadora(2, 3);
        calculadora2.dividir();
    }
}
