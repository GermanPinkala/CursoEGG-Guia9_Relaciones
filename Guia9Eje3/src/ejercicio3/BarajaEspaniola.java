/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Win 10
 */
public class BarajaEspaniola {

    private ArrayList<Carta> barajaDeCartas = new ArrayList();
    private ArrayList<Carta> cartasMonton = new ArrayList();

    private final String[] palo = new String[]{"Espada", "Basto", "Oro", "Copa"};
    private final int[] numeroCarta = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

    public BarajaEspaniola() {
    }

    public ArrayList<Carta> getBarajaDeCartas() {
        return barajaDeCartas;
    }

    public void setBarajaDeCartas(ArrayList<Carta> barajaDeCartas) {
        this.barajaDeCartas = barajaDeCartas;
    }

    public ArrayList<Carta> getCartasMonton() {
        return cartasMonton;
    }

    public void setCartasMonton(ArrayList<Carta> cartasMonton) {
        this.cartasMonton = cartasMonton;
    }

    public void crearBaraja() {
        /*crearBaraja(): Se crean las cartas en orden por palo y número.*/
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numeroCarta.length; j++) {
                Carta carta = new Carta();
                carta.setPalo(palo[i]);
                carta.setNumero(numeroCarta[j]);
                barajaDeCartas.add(carta);
            }
        }
    }

    public void barajar() {
        /*barajar(): cambia de posición todas las cartas aleatoriamente.*/
        Collections.shuffle(barajaDeCartas);
        System.out.println("Baraja mezclada.");
    }

    public Carta siguienteCarta() {
        /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
         *más o se haya llegado al final, se indica al usuario que no hay más cartas.
         */
        Carta carta = null;
        if (barajaDeCartas.isEmpty()) {
            System.out.println("No hay más cartas.");
        } else {
            carta = barajaDeCartas.get(barajaDeCartas.size() - 1);
        }
        return carta;
    }

    public int cartasDisponibles() {
        /*cartasDisponibles(): indica el número de cartas que aún se puede repartir.
         */
        int cantidadCartas = barajaDeCartas.size();
        return cantidadCartas;
    }

    public ArrayList<Carta> darCartas(int cantidadSolicitada) {
        /*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
        *de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
        *nada, pero debemos indicárselo al usuario.
         */
        ArrayList<Carta> cartas = new ArrayList();
        int tamanio = cartasDisponibles();
        if (tamanio >= cantidadSolicitada) {
            cartas = new ArrayList(barajaDeCartas.subList(tamanio - cantidadSolicitada, tamanio));
            for (Carta carta : cartas) {
                barajaDeCartas.remove(carta);
                cartasMonton.add(carta);
            }
        } else if (tamanio == 0) {
            System.out.println("No hay más cartas en la baraja.");
        } else {
            System.out.println("Cantidad insuficiente de cartas en la baraja.");
            System.out.println("Cartas disponibles: " + cartasDisponibles());
        }
        return cartas;
    }

    public void cartasMonton() {
        /*mostramos aquellas cartas que ya han salido, si no ha salido ninguna
        indicárselo al usuario*/
        if (cartasMonton.size() > 0) {
            System.out.print("Cartas repartidas: ");
            for (Carta carta : cartasMonton) {
                System.out.print(carta);
                
            }
            System.out.println();
        } else {
            System.out.println("No se ha repartido ninguna carta.");
        }
        
    }

    public void mostrarBaraja() {
        /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
        y luego se llama al método, este no mostrara esa primera carta.*/
        if (barajaDeCartas.size() > 0) {
            System.out.print("Cartas en la baraja: ");
            for (Carta carta : barajaDeCartas) {
                System.out.print(carta);
            }
            System.out.println();
        } else {
            System.out.println("No quedan cartas en la baraja.");
        }

    }

}
