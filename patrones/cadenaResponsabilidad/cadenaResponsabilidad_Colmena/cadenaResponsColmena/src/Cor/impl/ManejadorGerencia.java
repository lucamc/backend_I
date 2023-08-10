package Cor.impl;

import Cor.Manejador;
import model.Email;

public class ManejadorGerencia extends Manejador {

    @Override
    public String comprobar(Email email) {
        String mensaje = "Va a Gerencia";
        if ("gerencia@colmena.com".equals(email.getDestino()) || "Gerencia".equals(email.getTema())) {
            return mensaje;

        } else if (getSigManejador() != null) {
            getSigManejador().comprobar(email);
        }
        return "";
    }
}
