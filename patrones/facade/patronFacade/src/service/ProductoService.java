package service;

import model.Producto;

public class ProductoService {

    public int calculaDescuento(Producto producto) {
        if (producto.getTipo().compareToIgnoreCase("Lata") == 0) {
            return 10;
        } else {
            return 0;
        }
    }
}
