/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_guia_1;

import clases.Persona;
import servicios.PersonaService;

/**
 *
 * @author itsmi
 */
public class Ej_guia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService per_serv= new PersonaService();
        Persona p1 = per_serv.crear_persona();
        Persona p2 = per_serv.crear_persona(23, "Justin Believer");
       
        System.out.println(p1 + "\n" + p2);
    }
    
}
