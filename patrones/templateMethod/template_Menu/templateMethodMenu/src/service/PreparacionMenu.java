package service;


import model.Menu;

public abstract class PreparacionMenu {

    public void prepararMenu(Menu menu) {
        armado(menu);
        calcularPrecioVenta(menu);
    }

    protected abstract void armado(Menu menu);
    protected abstract void calcularPrecioVenta(Menu menu);

}
