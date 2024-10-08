package fes.aragon.clases;

public class Paciente {
    private String nombre;
    private int edad;
    private String enfermedad;

    public Paciente(String nombre, int edad, String enfermedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad = enfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public String toString() {
        return "-Nombre:" + nombre +
                " , Edad:" + edad +
                " , Enfermedad:" + enfermedad;
    }
}