package service;

import model.Menu;
import model.MenuInfantil;

public class PreparacionMenuInfantil extends PreparacionMenu {


    @Override
    protected void armado(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        System.out.println("Menú Infantíl");
        System.out.println("Precio Base: $" + menuInfantil.getPrecioBase());
        System.out.println("Cantidad Juguetes: " + menuInfantil.getJuguetesIncluidos());
        System.out.println("Valor x Juguete: $" + menuInfantil.getValorJuguete());
    }

    @Override
    protected void calcularPrecioVenta(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        double precioTotal = menuInfantil.getPrecioBase() + (menuInfantil.getJuguetesIncluidos() * menuInfantil.getValorJuguete());
        System.out.println("Precio Final $" + precioTotal);
    }
}
