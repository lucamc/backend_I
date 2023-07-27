package service;

import model.Menu;
import model.MenuVegetariano;

public class PreparacionMenuVegetariano extends PreparacionMenu {



    @Override
    protected void armado(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        System.out.println("Menú Vegetariano");
        System.out.println("Precio Base: $" + menuVegetariano.getPrecioBase());
        System.out.println("Cantidad Salsas: " + menuVegetariano.getSalsasVegetarianas());
        System.out.println("Valor x Salsa: $" + menuVegetariano.getValorSalsa());
        System.out.println("Adicional x Especias: " + menuVegetariano.getAdicionalEspecias() + "%");
    }

    @Override
    protected void calcularPrecioVenta(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;

        double precioTotal = menuVegetariano.getPrecioBase() + (menuVegetariano.getSalsasVegetarianas() * menuVegetariano.getValorSalsa());
        precioTotal = precioTotal + (precioTotal + ((double) menuVegetariano.getAdicionalEspecias() / 100)) ;
        System.out.println("Precio Final $" + precioTotal);
    }
}
