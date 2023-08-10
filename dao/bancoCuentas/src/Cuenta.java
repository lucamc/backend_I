public abstract class Cuenta {

    private int numero;
    private double saldo;




    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }


    // Methodo abstracto
    abstract public boolean extraer(double monto);



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
