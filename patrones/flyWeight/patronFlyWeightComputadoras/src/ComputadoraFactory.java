import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {

    private static Map<String, Computadora> pool = new HashMap<>();
    private int cantidad = 0;


    public Computadora obtieneComputadora(int ram, int hdd) {
        String clave = ram + "." + hdd;
        if (!pool.containsKey(clave)) {
            Computadora computadora = new Computadora(clave, ram, hdd);
            cantidad++;
            pool.put(clave, computadora);
        }
        return pool.get(clave);
    }

    public int getCantidad() {
        return cantidad;
    }
}
