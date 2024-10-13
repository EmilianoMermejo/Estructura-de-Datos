package fes.aragon.clases;

public class Array2D {
    private int[][] red;
    private int filas, columnas;

    public Array2D(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        red = new int[filas][columnas];
    }

    public int get(int fila, int columna) {
        return red[fila][columna];
    }

    public void set(int fila, int columna, int value) {
        red[fila][columna] = value;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void print() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(red[i][j] + " ");
            }
            System.out.println();
        }
    }
}
