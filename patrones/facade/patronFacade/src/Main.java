import facade.DescuentoFacadeImpl;
import model.Producto;
import model.Tarjeta;

public class Main {
    public static void main(String[] args) {

        DescuentoFacadeImpl descuentoFacade = new DescuentoFacadeImpl();


        Tarjeta tarjeta = new Tarjeta("124545", "StarBank");

        Producto producto = new Producto("Arvejas", "Lata");


        int totalFinal = descuentoFacade.calculaDescuento(tarjeta, producto, 30);

        System.out.println(totalFinal);

    }
}