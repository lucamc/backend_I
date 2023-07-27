package Cor.impl;

import Cor.Manejador;
import model.Email;

public class ManjeadorComercial extends Manejador {


    @Override
    public String comprobar(Email email) {
        String mensaje = "Va a comercial";
        if ("comercial@colmena.com".equals(email.getDestino()) || "Comercial".equals(email.getTema())) {
            return mensaje;

        } else if (getSigManejador() != null) {
            getSigManejador().comprobar(email);
        }
        return "";
    }
}
