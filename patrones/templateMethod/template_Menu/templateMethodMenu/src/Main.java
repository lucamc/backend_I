import model.Menu;
import model.MenuClasico;
import model.MenuInfantil;
import model.MenuVegetariano;
import service.PreparacionMenuClasico;
import service.PreparacionMenuInfantil;
import service.PreparacionMenu;
import service.PreparacionMenuVegetariano;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Menu menuInfantil = new MenuInfantil(100, 3);
        PreparacionMenu preparadorInfantil = new PreparacionMenuInfantil();
        preparadorInfantil.prepararMenu(menuInfantil);

        System.out.println("--------------------");

        Menu menuVegetariano = new MenuVegetariano(120, 2);
        PreparacionMenu preparacionMenuVegetariano = new PreparacionMenuVegetariano();
        preparacionMenuVegetariano.prepararMenu(menuVegetariano);

        System.out.println("--------------------");


        Menu menuClasico = new MenuClasico(80);
        PreparacionMenu preparacionMenuClasico = new PreparacionMenuClasico();
        preparacionMenuClasico.prepararMenu(menuClasico);
    }
}