package PROTOTYPEGestiónCuentasBancarias;

class CuentaCorriente extends CuentaBancaria {
    private double comision;

    public CuentaCorriente(int numero, double saldo, String titular, double comision) {
        super(numero, saldo, titular);
        this.comision = comision;
    }

    @Override
    public void realizarTransaccion(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        } else {
            double nuevaComision = Math.abs(monto) * comision / 100;
            setSaldo(getSaldo() - nuevaComision);
        }
    }

    // Método específico para cobrar comisiones en una Cuenta Corriente.
    public void cobrarComision() {
        double comisionCalculada = getSaldo() * comision / 100;
        setSaldo(getSaldo() - comisionCalculada);
    }
}

