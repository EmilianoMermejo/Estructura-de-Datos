package fes.aragon.inicio;

import fes.aragon.clases.JuegoDeLaVida;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        JuegoDeLaVida juego = new JuegoDeLaVida(10,10);
        juego.inicializarRandom();
        juego.actualizacionRejilla();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Generacion " + (i+1));
            juego.imprimirRejilla();
            juego.actualizacionRejilla();
            Thread.sleep(1000);
        }
    }
}