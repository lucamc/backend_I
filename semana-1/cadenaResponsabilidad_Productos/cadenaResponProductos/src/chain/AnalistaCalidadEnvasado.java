package chain;

import model.Articulo;

public class AnalistaCalidadEnvasado extends AnalistaCalidad {


    @Override
    public void controlarProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")) {
            System.out.println("Articulo Aceptado");
            articulo.setAceptado(true);

        } else {
            System.out.println("Envasado Rechazado");
        }
    }
}
