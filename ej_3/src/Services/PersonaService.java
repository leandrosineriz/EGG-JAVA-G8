/*
*   En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después 
    se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido 
    sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje


    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta 
    fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la 
    función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
    significa que la persona tiene sobrepeso, y la función devuelve un 1.
*/
package Services;

import Class.Persona;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class PersonaService {
    
    public Persona crear_persona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo(H, M, O):");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        while (sexo != 'H' || sexo != 'M' || sexo != 'O') {            
            System.out.println("Error. Ingrese el sexo(H, M, O):");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }
        System.out.println("Ingrese el peso:");
        float peso = leer.nextFloat();
        System.out.println("Ingrese la altura:");
        float altura = leer.nextFloat();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public Persona crear_persona(String nombre, int edad, char sexo, float peso, float altura) {
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public boolean mayor_edad(Persona p) {
        return p.getEdad() >= 18;
    }
    
    public int calcular_imc(Persona p) {
        double imc = p.getPeso()/(Math.pow(p.getAltura(),2));
        
        if (imc < 20) {
            return -1;
        } else if(imc > 25) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
}
