package Cor.impl;

import Cor.Manejador;
import model.Email;

public class ManejadorTecnico extends Manejador {



    @Override
    public String comprobar(Email email) {
        String mensaje = "Va a Tecnico";
        if ("tecnico@colmena.com".equals(email.getDestino()) || "Tecnico".equals(email.getTema())) {
            return mensaje;

        } else if (getSigManejador() != null) {
            getSigManejador().comprobar(email);
        }
        return "";
    }
}
