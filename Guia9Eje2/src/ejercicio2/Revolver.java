package ejercicio2;

public class Revolver {

    private int posicionActual, posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * 6 + 1);
        this.posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        if (this.posicionActual == 6) {
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void mostrarTambor() {
        for (int i = 1; i < 7; i++) {
            if (posicionActual == posicionAgua && posicionActual == i) {
                System.out.println(i + " O<-");
            } else if (posicionActual == i) {
                System.out.println(i + " Ø<-");
            } else if (posicionAgua == i) {
                System.out.println(i + " O");
            } else {
                System.out.println(i + " Ø");
            }
        }
    }

}
