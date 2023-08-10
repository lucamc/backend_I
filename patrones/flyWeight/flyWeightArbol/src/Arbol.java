public class Arbol {

    private String tipo;
    private int alto;
    private int horizontal;
    private String verde;


    public Arbol(String tipo, int alto, int horizontal, String verde) {
        this.tipo = tipo;
        this.alto = alto;
        this.horizontal = horizontal;
        this.verde = verde;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public String getVerde() {
        return verde;
    }

    public void setVerde(String verde) {
        this.verde = verde;
    }
}
