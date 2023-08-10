
public class Main {
    public static void main(String[] args) {


        // Vinculación Dinamica - Dymanic Binding
        Cuenta cuenta = new CuentaCajaAhorro(1, 500);

        // Permite el "Polimorfismo"
        cuenta.extraer(600);
        System.out.println(cuenta.getSaldo());

        Cuenta cuenta2 = new CuentaCorriente(1, cuenta.getSaldo());
        cuenta = cuenta2;

        cuenta.extraer(600);



        System.out.println(cuenta.getSaldo());



    }
}