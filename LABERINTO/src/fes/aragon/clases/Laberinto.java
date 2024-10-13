package fes.aragon.clases;

public class Laberinto {
    private Array2D laberinto;
    private int entradaFila, entradaCol, salidaFila, salidaCol;

    public Laberinto(int filas, int columnas, int entradaFila,
                     int entradaCol, int salidaFila, int salidaCol) {
        laberinto = new Array2D(filas, columnas);
        this.entradaFila = entradaFila;
        this.entradaCol = entradaCol;
        this.salidaFila = salidaFila;
        this.salidaCol = salidaCol;
    }

    public void configurarLaberinto(int[][] config) {
        for (int i = 0; i < config.length; i++) {
            for (int j = 0; j < config[0].length; j++) {
                laberinto.set(i, j, config[i][j]);
            }
        }
    }

    public int getEntradaFila() {
        return entradaFila;
    }

    public int getEntradaCol() {
        return entradaCol;
    }

    public int getSalidaFila() {
        return salidaFila;
    }

    public int getSalidaCol() {
        return salidaCol;
    }

    public Array2D getLaberinto() {
        return laberinto;
    }

    public void imprimirLaberinto() {
        laberinto.print();
    }
}
