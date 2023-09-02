package PROTOTYPEGestiónCuentasBancarias;

public class Main {
    public static void main(String[] args) {
        try {
            // Paso 4: Crea instancias de cuentas, realiza transacciones y muestra información.
            CuentaBancaria cuentaAhorro = new CuentaAhorro(12345, 1000, "Juan Pérez", 2.5);
            CuentaBancaria cuentaCorriente = new CuentaCorriente(54321, 2000, "María García", 1.0);

            System.out.println("Saldo Cuenta de Ahorro antes de la transacción: " + cuentaAhorro.obtenerSaldo());
            cuentaAhorro.realizarTransaccion(500);
            System.out.println("Saldo Cuenta de Ahorro después de la transacción: " + cuentaAhorro.obtenerSaldo());
            System.out.println("Intereses generados en Cuenta de Ahorro: " + ((CuentaAhorro) cuentaAhorro).calcularIntereses());

            System.out.println("Saldo Cuenta Corriente antes de la transacción: " + cuentaCorriente.obtenerSaldo());
            cuentaCorriente.realizarTransaccion(-300);
            System.out.println("Saldo Cuenta Corriente después de la transacción: " + cuentaCorriente.obtenerSaldo());
            ((CuentaCorriente) cuentaCorriente).cobrarComision();
            System.out.println("Saldo Cuenta Corriente después de cobrar comisión: " + cuentaCorriente.obtenerSaldo());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}