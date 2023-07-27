package model;

public class MenuInfantil extends Menu {

    // Attributes
    private int juguetesIncluidos;
    private int valorJuguete = 3;

    // Constructor
    public MenuInfantil(double precioBase, int juguetesIncluidos) {
        super(precioBase);
        this.juguetesIncluidos = juguetesIncluidos;
    }

    // Getters and Setters
    public int getJuguetesIncluidos() {
        return juguetesIncluidos;
    }

    public void setJuguetesIncluidos(int juguetesIncluidos) {
        this.juguetesIncluidos = juguetesIncluidos;
    }

    public int getValorJuguete() {
        return valorJuguete;
    }

    public void setValorJuguete(int valorJuguete) {
        this.valorJuguete = valorJuguete;
    }
}
