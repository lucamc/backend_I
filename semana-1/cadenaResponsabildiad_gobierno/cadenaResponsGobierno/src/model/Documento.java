package model;

public class Documento {

    // ATTRIBUTES
    private String contenido;
    private Integer tipo;


    // CONSTRUCTOR
    public Documento(String contenido, Integer tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
}
