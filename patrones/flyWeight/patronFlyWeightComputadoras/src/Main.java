public class Main {
    public static void main(String[] args) {

        ComputadoraFactory computadoraFactory = new ComputadoraFactory();

        Computadora mac = computadoraFactory.obtieneComputadora(16, 500);
        System.out.println(computadoraFactory.getCantidad());

        Computadora win = computadoraFactory.obtieneComputadora(2, 128);
        System.out.println(computadoraFactory.getCantidad());


        Computadora mac2 = computadoraFactory.obtieneComputadora(16, 500);
        System.out.println(computadoraFactory.getCantidad());

        Computadora mac3 = computadoraFactory.obtieneComputadora(16, 500);
        System.out.println(computadoraFactory.getCantidad());


        System.out.println(mac);
        System.out.println(mac2);
        System.out.println(mac3);
        System.out.println(win);




    }
}