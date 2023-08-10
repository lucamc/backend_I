package model;

public class Articulo {

    // Attributes
    private String nombre;
    private int peso;
    private int lote;
    private String envasado;

    private boolean aceptado;

    // Constructor
    public Articulo(String nombre, int peso, int lote, String envasado) {
        this.nombre = nombre;
        this.peso = peso;
        this.lote = lote;
        this.envasado = envasado;
        this.aceptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }
}
