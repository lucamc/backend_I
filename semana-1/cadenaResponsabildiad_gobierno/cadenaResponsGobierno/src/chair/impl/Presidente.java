package chair.impl;

import chair.JerarquiaGubernamental;
import model.Documento;

public class Presidente extends JerarquiaGubernamental {


    public Presidente(Integer tipoAcceso) {
        super(tipoAcceso);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= this.getTipoAcceso()) {
            System.out.println("Documento Muy Reservado");
            System.out.println("Acceso Presidente");
        } else {
            System.out.println("Nivel de Documento no correcto");
        }
    }
}
