/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Win 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int cartasPedidas = 6;

        BarajaEspaniola baraja = new BarajaEspaniola();
        baraja.crearBaraja();
        baraja.mostrarBaraja();
        System.out.println("");

        baraja.barajar();
        
        baraja.mostrarBaraja();
        System.out.println("");
        
        baraja.cartasMonton();
        System.out.println("");

        do {
            System.out.println("Se pide " + cartasPedidas + " cartas: ");
            //baraja.darCartas(6);
            for (Carta carta : baraja.darCartas(cartasPedidas)) {
                System.out.println(carta);
            }
            baraja.cartasMonton();
            System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
            baraja.mostrarBaraja();
            System.out.println("");
        } while (baraja.cartasDisponibles() >= cartasPedidas);
        
        baraja.darCartas(cartasPedidas);

    }

}
