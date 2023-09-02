package PROTOTYPEGestiónCuentasBancarias;

// Clase concreta que representa una cuenta corriente.
class CuentaCorriente extends CuentaBancaria {
    private double comision;

    public CuentaCorriente(int numero, String titular, double comision) {
        super(numero, titular);
        this.comision = comision;
    }

    public void cobrarComision() {
        realizarTransaccion(-comision);
    }

    @Override
    public void aplicarOperacionEspecial() {
        cobrarComision();
    }
}