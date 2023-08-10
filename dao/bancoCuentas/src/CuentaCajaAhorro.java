public class CuentaCajaAhorro extends Cuenta{




    public CuentaCajaAhorro(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean extraer(double monto) {
        boolean resultado = false;
        if (monto <= getSaldo()) {
            this.setSaldo(getSaldo() - monto);
            resultado = true;
        }
        return resultado;
    }
}
