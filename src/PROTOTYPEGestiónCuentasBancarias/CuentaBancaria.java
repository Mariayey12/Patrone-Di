package PROTOTYPEGestiónCuentasBancarias;

// Clase abstracta que representa una cuenta bancaria genérica.
abstract class CuentaBancaria implements Cloneable {
    private int numero;
    private double saldo;
    private String titular;

    public CuentaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int obtenerNumero() {
        return numero;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void realizarTransaccion(double monto) {
        saldo += monto;
    }

    // Método abstracto para calcular intereses o cobrar comisiones.
    public abstract void aplicarOperacionEspecial();

    @Override
    public CuentaBancaria clone() throws CloneNotSupportedException {
        return (CuentaBancaria) super.clone();
    }

    public String obtenerTitular() {
        return titular;
    }
}



