/*
    Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene 
    la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Services;

import Class.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class CuentaBancariaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crear_cuenta() {
        System.out.println("Ingrese el numero de cuenta:");
        int num = leer.nextInt();
        System.out.println("Ingrese el DNI:");
        long dni = leer.nextLong();
        
        return new CuentaBancaria(num, dni);
    }
    
    public void ingresar(CuentaBancaria cuenta, double saldo) {
        cuenta.setSaldo_actual(cuenta.getSaldo_actual() + saldo);
        
        System.out.println("Se han ingresado: " + saldo + "$");
        System.out.println("Su nuevo saldo es: " + cuenta.getSaldo_actual() + "$");
    }
    
    public void retirar(CuentaBancaria cuenta, double retiro) {
        
        if (cuenta.getSaldo_actual() - retiro >= 0) {
            cuenta.setSaldo_actual(cuenta.getSaldo_actual() - retiro);
        
            System.out.println("Se han retirado: " + retiro + "$");
            System.out.println("Su nuevo saldo es: " + cuenta.getSaldo_actual() + "$");
        } else {
            System.out.println("No tiene suficiente saldo para retirar " + retiro + "$");
            System.out.println("Se retiraran " + cuenta.getSaldo_actual() + "$");
            System.out.println("Su nuevo saldo en cuenta es de 0$");
            cuenta.setSaldo_actual(0);
        }
    }
    
    public void extraccion_rapida(CuentaBancaria cuenta, double retiro) {
        
        if (cuenta.getSaldo_actual() * 0.2 >= retiro) {
            System.out.println("Se han retirado: " + retiro + "$");
            cuenta.setSaldo_actual(cuenta.getSaldo_actual() - retiro);
        } else {
            System.out.println("Solo puede retirar un 20% mediante extraccion rapida.");
            System.out.println("Se han retirado " + cuenta.getSaldo_actual() * 0.2 + "$.");
            cuenta.setSaldo_actual(cuenta.getSaldo_actual() - cuenta.getSaldo_actual()*0.2);
            System.out.println("Su nuevo saldo es: " + cuenta.getSaldo_actual() + "$");
        }
    }
    
    public void mostrar_saldo(CuentaBancaria cuenta) {
        System.out.println("El saldo de su cuenta es: " + cuenta.getSaldo_actual() + "$.");
    }
    
    public void mostrar_cuenta(CuentaBancaria cuenta) {
        System.out.println(cuenta);
    }
}
