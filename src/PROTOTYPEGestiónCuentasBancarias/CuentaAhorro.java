package PROTOTYPEGestiónCuentasBancarias;

// Paso 2: Implementa clases concretas que hereden de CuentaBancaria para representar diferentes tipos de cuentas.
class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(int numero, double saldo, String titular, double tasaInteres) {
        super(numero, saldo, titular);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void realizarTransaccion(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        }
    }

    // Método específico para calcular intereses en una Cuenta de Ahorro.
    public double calcularIntereses() {
        return getSaldo() * tasaInteres / 100;
    }
}