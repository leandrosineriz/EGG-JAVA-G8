/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
 dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class CuentaBancaria {
    
    private int numero_cuenta;
    private long dni_cliente;
    private double saldo_actual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numero_cuenta, long dni_cliente) {
        this.numero_cuenta = numero_cuenta;
        this.dni_cliente = dni_cliente;
        this.saldo_actual = 0;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(long dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numero_cuenta=" + numero_cuenta + ", dni_cliente=" + dni_cliente + ", saldo_actual=" + saldo_actual + '}';
    }
}
