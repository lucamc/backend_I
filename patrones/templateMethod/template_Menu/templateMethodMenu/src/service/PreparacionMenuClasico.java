package service;

import model.Menu;
import model.MenuClasico;

public class PreparacionMenuClasico extends PreparacionMenu{

    @Override
    protected void armado(Menu menu) {
        MenuClasico menuClasico = (MenuClasico) menu;
        System.out.println("Menú Clásico");
        System.out.println("Precio Base: $" + menuClasico.getPrecioBase());
    }

    @Override
    protected void calcularPrecioVenta(Menu menu) {
        MenuClasico menuClasico = (MenuClasico) menu;
        System.out.printf("Precio Final $" + menuClasico.getPrecioBase());
    }
}
