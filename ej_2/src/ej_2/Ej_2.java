/*
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay 
    en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio 
    en el paquete Servicios con los siguiente:
    Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
    acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
    se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto 
    quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera 
    la cantidad de café indicada.

 */
package ej_2;

import Class.Cafetera;
import Services.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cafetera caf1 = new Cafetera(1200, 1200);
        CafeteraService ser_cafetera = new CafeteraService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opc;
        float cafe;
        while (true) {            
            System.out.println("1. Servir taza.");
            System.out.println("2. LLenar cafetera.");
            System.out.println("3. Vaciar cafetera.");
            System.out.println("4. Agregar cafe.");
            
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el tamaño de la taza:");
                    cafe = leer.nextFloat();
                    ser_cafetera.servir_taza(caf1, cafe);
                    break;
                case 2:
                    ser_cafetera.llenar_cafetera(caf1);
                    break;
                case 3:
                    ser_cafetera.vaciar_cafetera(caf1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe a agregar");
                    cafe = leer.nextFloat();
                    ser_cafetera.agregar_cafe(caf1, cafe);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
            System.out.println("***************************");
        }
                
    }
    
}
