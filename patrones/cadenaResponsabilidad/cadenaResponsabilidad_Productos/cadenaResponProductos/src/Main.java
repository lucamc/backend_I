import model.Articulo;

public class Main {
    public static void main(String[] args) {

        // Creación de Artículos
        Articulo articulo1 = new Articulo("Auto", 1200, 1240, "sano");
        Articulo articulo2 = new Articulo("Camion", 1200, 1640, "casi sano");
        Articulo articulo3 = new Articulo("Moto", 500, 140, "sano");


        // Clase Verificadora de Producto
        CompruebaCalidad compruebaCalidad = new CompruebaCalidad();

        // Verificación de Productos
        compruebaCalidad.verificarCalidadProducto(articulo1);
        compruebaCalidad.verificarCalidadProducto(articulo2);
        compruebaCalidad.verificarCalidadProducto(articulo3);

    }
}