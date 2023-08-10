import org.apache.log4j.Logger;

public class Principal {


    private static final Logger LOGGER = Logger.getLogger(Principal.class);

    public static void main(String[] args) {
        try {

            ListaEnteros l1 = new ListaEnteros();
            l1.addEntero(3);
            l1.addEntero(5);
            l1.addEntero(2);
            System.out.println(l1.promediar());
            LOGGER.info("Promediar números ");

            l1 = new ListaEnteros();
            l1.addEntero(3);
            l1.addEntero(5);
            l1.addEntero(2);
            l1.addEntero(7);
            l1.addEntero(6);
            l1.addEntero(32);
            System.out.println(l1.promediar());
            LOGGER.info("Promediar números ");


            l1 = new ListaEnteros();
            l1.addEntero(3);
            l1.addEntero(5);
            l1.addEntero(2);
            l1.addEntero(7);
            l1.addEntero(6);
            l1.addEntero(32);
            l1.addEntero(3);
            l1.addEntero(5);
            l1.addEntero(2);
            l1.addEntero(7);
            l1.addEntero(6);
            l1.addEntero(32);
            System.out.println(l1.promediar());
            LOGGER.info("Promediar números ");



            int resultado = 0/0;


        } catch (ArithmeticException e) {
            LOGGER.error("No se puede caluclar", e);
        }
    }
}
