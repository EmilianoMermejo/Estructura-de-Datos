package fes.aragon.inicio;

import fes.aragon.clases.ColaADT;
import fes.aragon.clases.Paciente;

public class Main {
    public static void main(String[] args) {
        ColaADT<Paciente> pacientes = new ColaADT<>();

        System.out.println("CLINICA MEDICA");
        System.out.println("La Cola Esta Vacia? ");
        System.out.println(pacientes.estaVacia());
        System.out.println();

        pacientes.encolar(new Paciente("Mateo",28,"Gripe"));
        pacientes.encolar(new Paciente("Daniela" ,32,"Gastritis"));
        pacientes.encolar(new Paciente("Benji",19,"Diabetes"));
        System.out.println(pacientes);
        System.out.println();

        System.out.println("Paciente a Atender: " + pacientes.desEncolar());
        System.out.println("Pacientes en la Sala de Espera: " + pacientes);

        pacientes.encolar(new Paciente("Alondra", 24,"Depresion" ));
        pacientes.encolar(new Paciente("Irene", 15, "Asma"));
        System.out.println();

        System.out.println("Paciente a Atender: " + pacientes.desEncolar());
        System.out.println("Pacientes en la Sala de Espera: " + pacientes);
        System.out.println();

        System.out.println("La Cola Esta Vacia? ");
        System.out.println(pacientes.estaVacia());

    }
}