import exception.LiquidadorException;
import model.Empleado;
import model.EmpleadoContratado;
import model.EmpleadoEfectivo;
import service.Liquidador;
import service.LiquidadorEmpleadoContratado;
import service.LiquidadorEmpleadoEfectivo;

public class Main {
    public static void main(String[] args) {

        // Effective and Contractor Employee
        Empleado empleadoEfectivo = new EmpleadoEfectivo("Lucas", "Custodio", "123", 400, 40, 60);

        Empleado empleadoContratado = new EmpleadoContratado("Martin", "Costa", "5235", 7,120);


        // Effective and Contractor Employee Liquidator
        Liquidador liquidadorEfectivo = new LiquidadorEmpleadoEfectivo();
        Liquidador liquidadorContratado = new LiquidadorEmpleadoContratado();


        try {
            liquidadorEfectivo.liquidarSueldo(empleadoEfectivo);
            liquidadorContratado.liquidarSueldo(empleadoContratado);
        } catch (LiquidadorException e) {
            System.out.println(e.toString());
        }








        }
    }
