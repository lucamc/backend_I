package chain;

import model.Articulo;

public abstract class AnalistaCalidad {

    // Siguiente manejador
    AnalistaCalidad siguienteAnalistaCalidad;

    public abstract void controlarProducto(Articulo articulo);

    public void setSiguienteAnalista(AnalistaCalidad analistaCalidad) {
        siguienteAnalistaCalidad = analistaCalidad;
    }


    public AnalistaCalidad getSiguienteAnalistaCalidad() {
        return siguienteAnalistaCalidad;
    }
}
