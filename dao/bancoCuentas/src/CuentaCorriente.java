public class CuentaCorriente extends Cuenta{




    public CuentaCorriente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean extraer(double monto) {
        this.setSaldo(getSaldo() - monto);
        return true;
    }
}
