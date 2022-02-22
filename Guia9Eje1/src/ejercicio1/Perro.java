
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Perro {
    
    private String nombre, raza, tamanio;
    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamanio, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + '}';
    }
    
    
    public void agregarPerro(){
    
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Agregar perro: ");
        System.out.print("Ingrese el nombre: ");
        this.nombre = entrada.next();
        System.out.print("Ingrese la raza: ");
        this.raza = entrada.next();
        System.out.print("Ingrese la edad: ");
        this.edad = entrada.nextInt();
        System.out.print("Ingrese tamaño chico/mediano/grande: ");
        this.tamanio = entrada.next();
    } 
    
}
