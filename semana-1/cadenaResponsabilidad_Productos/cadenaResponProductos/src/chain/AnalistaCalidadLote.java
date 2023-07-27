package chain;

import model.Articulo;

public class AnalistaCalidadLote extends AnalistaCalidad {


    @Override
    public void controlarProducto(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000) {
            if (getSiguienteAnalistaCalidad() != null) {
                getSiguienteAnalistaCalidad().controlarProducto(articulo);
            }
        } else {
            System.out.println("Lote Rechazado");
        }


    }

}
