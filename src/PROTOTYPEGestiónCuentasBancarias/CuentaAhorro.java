package PROTOTYPEGestiónCuentasBancarias;

// Clase concreta que representa una cuenta de ahorro.
class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(int numero, String titular, double tasaInteres) {
        super(numero, titular);
        this.tasaInteres = tasaInteres;
    }

    public void calcularIntereses() {
        double intereses = obtenerSaldo() * tasaInteres;
        realizarTransaccion(intereses);
    }

    @Override
    public void aplicarOperacionEspecial() {
        calcularIntereses();
    }
}
