package PROTOTYPEGestiónCuentasBancarias;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // Crear un mapa para almacenar cuentas bancarias.
        Map<Integer, CuentaBancaria> cuentas = new HashMap<>();

        // Crear cuentas de ahorro y cuentas corrientes.
        CuentaBancaria cuentaAhorro1 = new CuentaAhorro(101, "Cliente1", 0.05);
        CuentaBancaria cuentaCorriente1 = new CuentaCorriente(201, "Cliente2", 10.0);

        // Agregar cuentas al mapa.
        cuentas.put(cuentaAhorro1.obtenerNumero(), cuentaAhorro1);
        cuentas.put(cuentaCorriente1.obtenerNumero(), cuentaCorriente1);

        // Realizar transacciones y aplicar operaciones especiales.
        cuentaAhorro1.realizarTransaccion(1000.0);
        cuentaAhorro1.aplicarOperacionEspecial();

        cuentaCorriente1.realizarTransaccion(500.0);
        cuentaCorriente1.aplicarOperacionEspecial();

        // Mostrar información de las cuentas.
        for (CuentaBancaria cuenta : cuentas.values()) {
            System.out.println("Número de cuenta: " + cuenta.obtenerNumero());
            System.out.println("Titular: " + cuenta.obtenerTitular());
            System.out.println("Saldo: " + cuenta.obtenerSaldo());
            System.out.println();
        }
    }
}
