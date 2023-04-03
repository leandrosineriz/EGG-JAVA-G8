/*
    Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
    nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún 
    otro atributo, puede hacerlo. Agregar constructores, getters y setters.
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después 
    se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido 
    sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta 
    fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la 
    función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
    significa que la persona tiene sobrepeso, y la función devuelve un 1.
    A continuación, en la clase main hacer lo siguiente:

    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
    deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para 
    cada objeto si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y 
    cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos 
    crear unos métodos adicionales.

 */
package Main;

import Class.Persona;
import Services.PersonaService;
import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService serv_persona = new PersonaService();
        Persona p1 = serv_persona.crear_persona("Leo", 15, 'H', 60, (float) 1.70);
        Persona p2 = serv_persona.crear_persona("Belen", 25, 'F', 50, (float) 1.65);
        Persona p3 = serv_persona.crear_persona("Julian", 32, 'O', 102, (float) 1.95);
        Persona p4 = serv_persona.crear_persona("Jessica", 17, 'F', 41, (float) 1.60);
        
        Persona[] pers = {p1, p2, p3, p4};
        ArrayList<Boolean> mayores = new ArrayList<>();
        ArrayList<Integer> pesos = new ArrayList<>();
                
        for (Persona p: pers) {
            System.out.println(p.getNombre());
            mayores.add(serv_persona.mayor_edad(p));
            pesos.add(serv_persona.calcular_imc(p));
            
            if (serv_persona.mayor_edad(p)) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
            
            switch (serv_persona.calcular_imc(p)) {
                case -1:
                    System.out.println("Se encuentra por debajo de su peso ideal");
                    break;
                case 1:
                    System.out.println("Se encuentra por encima de su peso ideal");
                    break;
                default:
                    System.out.println("Se encuentra en su peso ideal");
                    break;
            }
        }
        
        int may_cont = 0;
        for (boolean may: mayores) {
            if (may) {
                may_cont += 1;
            }
        }
        
        int cont_debajo = 0;
        int cont_ideal = 0;
        int cont_encima = 0;
        for (int i: pesos) {
            switch (i) {
                case -1:
                    cont_debajo += 1;
                    break;
                case 0:
                    cont_ideal += 1;
                    break;
                case 1:
                    cont_encima += 1;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        System.out.println("******************************");
        System.out.println("Porcentaje de mayores de edad: " + may_cont*100/pers.length + "%");
        System.out.println("Porcentaje de pesos ideales: " + cont_ideal*100/pers.length + "%");
        System.out.println("Porcentaje de pesos por debajo ideal: " + cont_debajo*100/pers.length + "%");
        System.out.println("Porcentaje de pesos por encima ideal: " + cont_encima*100/pers.length + "%");
        
    }
    
}
