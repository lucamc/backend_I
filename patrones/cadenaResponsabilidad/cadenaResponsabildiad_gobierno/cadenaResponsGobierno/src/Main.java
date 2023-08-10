import chair.JerarquiaGubernamental;
import chair.impl.Diputado;
import chair.impl.Ministro;
import chair.impl.Presidente;
import model.Documento;

import javax.swing.event.DocumentEvent;

public class Main {
    public static void main(String[] args) {


        // Crear Documento
        Documento documento = new Documento("Licitación", 3);

        // Crear Jerarquías
        JerarquiaGubernamental diputado = new Diputado(1);
        JerarquiaGubernamental ministro = new Ministro(2);
        JerarquiaGubernamental presidente = new Presidente(3);

        // Configurar cadena
        diputado.setSiguienteJerarquiaGubernamental(ministro);
        ministro.setSiguienteJerarquiaGubernamental(presidente);

        
        diputado.leerDocumento(documento);

    }
}