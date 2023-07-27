package Cor.impl;

import Cor.Manejador;
import model.Email;

public class ManjejadorSpam extends Manejador {


    @Override
    public String comprobar(Email email) {
        return "Marcado como Spam";
    }
}
