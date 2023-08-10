import chain.AnalistaCalidad;
import chain.AnalistaCalidadEnvasado;
import chain.AnalistaCalidadLote;
import chain.AnalistaCalidadPeso;
import model.Articulo;

public class CompruebaCalidad {
    public void verificarCalidadProducto(Articulo articulo) {

        // Crear cadena de responsabilidad
        AnalistaCalidadLote analistaCalidadLote = new AnalistaCalidadLote();
        AnalistaCalidadPeso analistaCalidadPeso = new AnalistaCalidadPeso();
        AnalistaCalidadEnvasado analistaCalidadEnvasado = new AnalistaCalidadEnvasado();

        // Configurar Cadena de manejadores
        analistaCalidadLote.setSiguienteAnalista(analistaCalidadPeso);
        analistaCalidadPeso.setSiguienteAnalista(analistaCalidadEnvasado);

        // Verificar Calidad del Producto
        analistaCalidadLote.controlarProducto(articulo);
    }
}
