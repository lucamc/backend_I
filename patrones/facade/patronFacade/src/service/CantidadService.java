package service;

public class CantidadService {

    public int calculaDescuento(int cantidad) {
        if (cantidad > 12) {
            return 15;
        } else {
            return 0;
        }
    }
}
