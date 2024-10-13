package fes.aragon.inicio;

import fes.aragon.clases.Backtracking;
import fes.aragon.clases.Laberinto;

public class Main {
    public static void main(String[] args) {
        int[][] configuracionLaberinto = {
                {0, 1, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 0, 1, 0, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0}
        };

        Laberinto laberinto = new Laberinto
                (10, 10, 0, 0, 9, 9);
        laberinto.configurarLaberinto(configuracionLaberinto);

        System.out.println("Laberinto inicial:");
        laberinto.imprimirLaberinto();

        Backtracking backtracking = new Backtracking(laberinto);

        if (backtracking.resolver()) {
            System.out.println("\nLaberinto resuelto:");
        } else {
            System.out.println("\nNo se encontró solución:");
        }

        laberinto.imprimirLaberinto();
    }
}