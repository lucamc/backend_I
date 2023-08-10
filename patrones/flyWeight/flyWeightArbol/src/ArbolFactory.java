import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private static Map<String, Arbol> pool = new HashMap<>();

    private int contador = 0;

    public Arbol obtieneArbol(String tipo, int alto, int horizontal, String color) {
        String clave = "key" + tipo;
        if (!pool.containsKey(clave)) {
            Arbol arbol = new Arbol(clave, alto, horizontal, color);
            contador++;
            pool.put(clave, arbol);
        }
        return pool.get(clave);
    }

    public int getContador() {
        return contador;
    }
}
