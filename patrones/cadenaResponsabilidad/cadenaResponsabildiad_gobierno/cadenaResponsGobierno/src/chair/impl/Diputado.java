package chair.impl;

import chair.JerarquiaGubernamental;
import model.Documento;

public class Diputado extends JerarquiaGubernamental {


    public Diputado(Integer tipoAcceso) {
        super(tipoAcceso);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= this.getTipoAcceso()) {
            System.out.println("Documento Reserado");
            System.out.println("Acceso Diputado");
        } else if (getJerarquiaGubernamental() != null) {
            getJerarquiaGubernamental().leerDocumento(documento);
        }
    }
}
