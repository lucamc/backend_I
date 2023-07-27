package chain;

import model.Articulo;

public class AnalistaCalidadPeso extends AnalistaCalidad {


    @Override
    public void controlarProducto(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            if (getSiguienteAnalistaCalidad() != null) {
                getSiguienteAnalistaCalidad().controlarProducto(articulo);
            }
        } else {
            System.out.println("Peso Rechazado");
        }

    }
}
