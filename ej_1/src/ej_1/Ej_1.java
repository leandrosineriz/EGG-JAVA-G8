/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
 dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 Método para crear cuenta pidiéndole los datos al usuario.
 Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
 Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene 
 la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
 Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
 Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
 Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package ej_1;

import Class.CuentaBancaria;
import Services.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaService cbsrv = new CuentaBancariaService();
        CuentaBancaria cb1 = cbsrv.crear_cuenta();

        int opc;
        double saldo;
        while (true) {            
            System.out.println("1.Ingresar saldo");
            System.out.println("2.Retirar saldo");
            System.out.println("3.Retiro express");
            System.out.println("4.Consultar saldo");
            System.out.println("5.Consultar cuenta");
            
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el saldo a ingresar: ");
                    saldo = leer.nextDouble();
                    if (saldo > 0) {
                        cbsrv.ingresar(cb1, saldo);
                    } else {
                        System.out.println("Saldo invalido.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el saldo a retirar: ");
                    saldo = leer.nextDouble();
                    if (saldo > 0) {
                        cbsrv.retirar(cb1, saldo);
                    } else {
                        System.out.println("Saldo invalido.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el saldo a retirar: ");
                    saldo = leer.nextDouble();
                    if (saldo > 0) {
                        cbsrv.extraccion_rapida(cb1, saldo);
                    } else {
                        System.out.println("Saldo invalido.");
                    }
                    break;
                case 4:
                    cbsrv.mostrar_saldo(cb1);
                    break;
                case 5:
                    cbsrv.mostrar_cuenta(cb1);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
            
            System.out.println("****************************");
        }
    }
    
}
