
import java.util.ArrayList;

public class ListaEnteros {

    private ArrayList<Integer> lista = new ArrayList<>();

    // Getter and Setter
    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }


    //Methods
    public void addEntero(int entero) {
        lista.add(entero);
    }


    public double promediar() throws ArithmeticException {
        double sale;
        double suma = 0;
        for (int numero : lista) {
            suma = suma + numero;
        }
        sale = suma / lista.size();

        return sale;
    }
}
