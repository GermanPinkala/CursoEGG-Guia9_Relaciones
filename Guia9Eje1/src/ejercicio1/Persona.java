
package ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Persona {
    
    private String nombre, apellido, documento;
    private int edad;
    
    private ArrayList<Perro> perro = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documentos, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documentos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", edad=" + edad + ", perro=" + perro + '}';
    }
    
    public void agregarPersona(){
    
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Agregar persona:");
        System.out.print("Ingrese el nombre: ");
        this.nombre = entrada.next();
        System.out.print("Ingrese el apellido: ");
        this.apellido = entrada.next();
        System.out.print("Ingrese la edad: ");
        this.edad = entrada.nextInt();
        System.out.print("Ingrese el documento: ");
        this.documento = entrada.next();
        
    } 
    
    public void asociarPerro(Perro perro){
        
        this.perro.add(perro);
    }
         
    public void mostrarPersona(){
    
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Apellido: "+ this.getApellido());
        System.out.println("Documento: "+ this.getDocumento());
        
        System.out.print("Perros: ");
        
        for (Perro perros : perro){
            
            System.out.println("-" + perros.toString());
        }
    }
}
