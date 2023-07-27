package chair;

import model.Documento;

public abstract class JerarquiaGubernamental {

    private Integer tipoAcceso;

    JerarquiaGubernamental jerarquiaGubernamental;

    public JerarquiaGubernamental(Integer tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public abstract void leerDocumento(Documento documento);

    public Integer getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(Integer tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public JerarquiaGubernamental getJerarquiaGubernamental() {
        return jerarquiaGubernamental;
    }

    public void setSiguienteJerarquiaGubernamental(JerarquiaGubernamental jerarquiaGubernamental) {
        this.jerarquiaGubernamental = jerarquiaGubernamental;
    }
}
