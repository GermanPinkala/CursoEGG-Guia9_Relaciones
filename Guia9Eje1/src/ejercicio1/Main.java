/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Win 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        
        persona1.agregarPersona();
        persona2.agregarPersona();
        
        perro1.agregarPerro();
        perro2.agregarPerro();
        perro3.agregarPerro();
        
        persona1.asociarPerro(perro1);
        persona2.asociarPerro(perro2);
        persona2.asociarPerro(perro3);
        
        persona1.mostrarPersona();
        persona2.mostrarPersona();
        
    }
    
}
