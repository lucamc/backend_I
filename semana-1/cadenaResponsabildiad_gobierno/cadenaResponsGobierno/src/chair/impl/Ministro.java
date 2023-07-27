package chair.impl;

import chair.JerarquiaGubernamental;
import model.Documento;

public class Ministro extends JerarquiaGubernamental {


    public Ministro(Integer tipoAcceso) {
        super(tipoAcceso);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= this.getTipoAcceso()) {
            System.out.println("Documento Secreto");
            System.out.println("Acceso Ministro");
        } else if (getJerarquiaGubernamental() != null) {
            getJerarquiaGubernamental().leerDocumento(documento);
        }
    }
}
