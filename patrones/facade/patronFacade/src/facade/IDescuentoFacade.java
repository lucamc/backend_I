package facade;

import model.Producto;
import model.Tarjeta;

public interface IDescuentoFacade {

    int calculaDescuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
