package model;

public class MenuVegetariano extends Menu{

    // Attributes
    private int salsasVegetarianas;
    private int valorSalsa = 2;
    private int adicionalEspecias = 1;


    // Constructor
    public MenuVegetariano(double precioBase, int salsasVegetarianas) {
        super(precioBase);
        this.salsasVegetarianas = salsasVegetarianas;
    }

    // Getters and Setters

    public int getSalsasVegetarianas() {
        return salsasVegetarianas;
    }

    public void setSalsasVegetarianas(int salsasVegetarianas) {
        this.salsasVegetarianas = salsasVegetarianas;
    }

    public int getValorSalsa() {
        return valorSalsa;
    }

    public void setValorSalsa(int valorSalsa) {
        this.valorSalsa = valorSalsa;
    }

    public int getAdicionalEspecias() {
        return adicionalEspecias;
    }

    public void setAdicionalEspecias(int adicionalEspecias) {
        this.adicionalEspecias = adicionalEspecias;
    }
}
