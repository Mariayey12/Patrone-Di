package PROTOTYPEGestiónCuentasBancarias;

// Paso 1: Crea una clase abstracta llamada CuentaBancaria con propiedades y métodos comunes.
abstract class CuentaBancaria implements Cloneable {
    private int numero;
    private double saldo;
    private String titular;

    public CuentaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int obtenerNumero() {
        return numero;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public abstract void realizarTransaccion(double monto);

    // Paso 3: Implementa el método clone() para permitir la clonación de cuentas.
    @Override
    public CuentaBancaria clone() throws CloneNotSupportedException {
        return (CuentaBancaria) super.clone();
    }
}


