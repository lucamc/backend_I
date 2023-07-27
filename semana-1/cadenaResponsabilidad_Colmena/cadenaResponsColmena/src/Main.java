import Cor.Manejador;
import Cor.impl.ManejadorGerencia;
import Cor.impl.ManejadorTecnico;
import Cor.impl.ManjeadorComercial;
import Cor.impl.ManjejadorSpam;
import model.Email;

public class Main {
    public static void main(String[] args) {

        Email email = new Email("Cliente", "gerencia@colmena.com", "email");


        Manejador man1 = new ManjeadorComercial();
        Manejador man2 = new ManejadorGerencia();
        Manejador man3 = new ManejadorTecnico();
        Manejador spam = new ManjejadorSpam();

        man1.setSigManejador(man2);
        man2.setSigManejador(man3);
        man3.setSigManejador(spam);


        System.out.println(man1.comprobar(email));




    }
}