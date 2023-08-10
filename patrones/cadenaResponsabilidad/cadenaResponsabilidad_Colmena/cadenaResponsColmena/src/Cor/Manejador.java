package Cor;

import model.Email;

public abstract class Manejador {

    Manejador sigManejador;

    public abstract String comprobar(Email email);

    public Manejador getSigManejador() {
        return sigManejador;
    }

    public void setSigManejador(Manejador sigManejador) {
        this.sigManejador = sigManejador;
    }
}
