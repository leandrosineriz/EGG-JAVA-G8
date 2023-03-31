/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.Persona;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crear_persona() {
        System.out.println("Ingrese el nombre:");
        String n = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        
        return new Persona(edad, n);
    }

    public Persona crear_persona(int edad, String name) {
        return new Persona(edad, name);
    }
    
    public PersonaService() {
    }
    
    
}
