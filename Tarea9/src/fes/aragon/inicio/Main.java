package fes.aragon.inicio;

import fes.aragon.clases.BalanceoParentesisLlaves;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de la clase BalanceoParentesisLlaves
        BalanceoParentesisLlaves verificador = new BalanceoParentesisLlaves();

        // Texto de prueba
        String expresion1 = "{(a + b) * (c + d)}"; // Balanceado
        String expresion2 = "{(a + b) * (c + d)";  // No balanceado

        System.out.println("Expresión 1: " + (verificador.estanBalanceados(expresion1) ? "Balanceado" : "No Balanceado"));
        System.out.println("Expresión 2: " + (verificador.estanBalanceados(expresion2) ? "Balanceado" : "No Balanceado"));
    }
}
