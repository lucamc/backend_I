package facade;

import model.Producto;
import model.Tarjeta;
import service.CantidadService;
import service.ProductoService;
import service.TarjetaService;

public class DescuentoFacadeImpl implements IDescuentoFacade{

    private TarjetaService tarjetaService;
    private ProductoService productoService;
    private CantidadService cantidadService;


    @Override
    public int calculaDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {

        tarjetaService = new TarjetaService();
        productoService = new ProductoService();
        cantidadService = new CantidadService();


        int descuento = tarjetaService.calculaDescuento(tarjeta);
        descuento = descuento + productoService.calculaDescuento(producto);
        descuento = descuento + cantidadService.calculaDescuento(cantidad);

        return descuento;
    }
}
