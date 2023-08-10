package service;


import model.Tarjeta;

public class TarjetaService {


    public int calculaDescuento(Tarjeta tarjeta) {
        if (tarjeta.getBanco().compareToIgnoreCase("StarBank") == 0) {
            return 20;
        } else {
            return 0;
        }
    }

}
