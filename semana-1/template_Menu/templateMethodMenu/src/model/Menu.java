package model;

public abstract class Menu {

    // Attributes
    private double precioBase;

    // Constructor
    public Menu(double precioBase) {
        this.precioBase = precioBase;
    }


    // Getters and Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
