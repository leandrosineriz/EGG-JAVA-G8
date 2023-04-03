/*
 *  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
    acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
    se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto 
    quedó la taza.
    Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera 
    la cantidad de café indicada.
 */
package Services;

import Class.Cafetera;

/**
 *
 * @author itsmi
 */
public class CafeteraService {
    
    public void llenar_cafetera(Cafetera cafetera) {
        cafetera.setCantidad_actual(cafetera.getCapacidad_max());
        System.out.println("Se lleno con " + cafetera.getCapacidad_max() + " mlts de cafe a la cafetera.");
    }
    
    public void servir_taza(Cafetera cafetera, float tam_taza) {
        if (cafetera.getCantidad_actual() < tam_taza) {
            System.out.println("No hay suficiente cafe para llenar la taza.");
            System.out.println("Se lleno " + cafetera.getCantidad_actual() + " mlts de cafe");
            cafetera.setCantidad_actual(0);
        } else {
            cafetera.setCantidad_actual(cafetera.getCantidad_actual() - tam_taza);
            System.out.println("Se sirvio la taza entera.");
        }
    }
    
    public void vaciar_cafetera(Cafetera cafetera) {
        cafetera.setCantidad_actual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }
    
    public void agregar_cafe(Cafetera cafetera, float cafe) {
        if (cafetera.getCantidad_actual() + cafe > cafetera.getCapacidad_max()) {
            cafetera.setCantidad_actual(cafetera.getCapacidad_max());
            System.out.println("Se lleno la cafetera.");
        } else {
            cafetera.setCantidad_actual(cafetera.getCantidad_actual() + cafe);
            System.out.println("Se agregaron " + cafe + " mlts de cafe a la cafetera.");
        }
    }
}
