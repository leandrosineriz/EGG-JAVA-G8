/*
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
    (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay 
    en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters.
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Cafetera {
    private float capacidad_max;
    private float cantidad_actual;

    public Cafetera() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la capacidad MAX de la cafetera:");
        this.capacidad_max = leer.nextFloat();
        System.out.println("Ingrese la cantidad actual de la cafetera:");
        this.cantidad_actual = leer.nextFloat();
    }

    public Cafetera(float capacidad_max, float cantidad_actual) {
        this.capacidad_max = capacidad_max;
        this.cantidad_actual = cantidad_actual;
    }

    public float getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(float cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public float getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(float capacidad_max) {
        this.capacidad_max = capacidad_max;
    }
    
    
}
