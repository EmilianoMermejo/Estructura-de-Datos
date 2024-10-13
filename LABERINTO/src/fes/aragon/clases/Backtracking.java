package fes.aragon.clases;

public class Backtracking {
    private Laberinto laberinto;
    private Pila pila;

    // Movimientos: Izquierda, Arriba, Derecha, Abajo
    private final int[][] MOVIMIENTOS = {
            {0, -1},   // Izquierda
            {-1, 0},   // Arriba
            {0, 1},    // Derecha
            {1, 0}     // Abajo
    };

    public Backtracking(Laberinto laberinto) {
        this.laberinto = laberinto;
        pila = new Pila();
    }

    public boolean resolver() {
        int entradaFila = laberinto.getEntradaFila();
        int entradaCol = laberinto.getEntradaCol();
        pila.push(new int[]{entradaFila, entradaCol});

        while (!pila.isEmpty()) {
            int[] actual = pila.peek();
            int fila = actual[0];
            int col = actual[1];

            if (fila == laberinto.getSalidaFila() && col == laberinto.getSalidaCol()) {
                return true; // Laberinto resuelto
            }

            boolean movimientoRealizado = false;

            for (int[] mov : MOVIMIENTOS) {
                int nuevaFila = fila + mov[0];
                int nuevaCol = col + mov[1];

                if (esMovimientoValido(nuevaFila, nuevaCol)) {
                    laberinto.getLaberinto().set(fila, col, 2); // Marcar como visitado
                    pila.push(new int[]{nuevaFila, nuevaCol});
                    movimientoRealizado = true;
                    break;
                }
            }

            if (!movimientoRealizado) {
                laberinto.getLaberinto().set(fila, col, 3); // Marcar sin más opciones
                pila.pop(); // Retroceder
            }
        }

        return false; // No se encontró solución
    }

    private boolean esMovimientoValido(int fila, int col) {
        if (fila < 0 || col < 0 || fila >= laberinto.getLaberinto().getFilas() || col >=
                laberinto.getLaberinto().getColumnas()) {
            return false; // Fuera de límites
        }

        return laberinto.getLaberinto().get(fila, col) == 0; // Verificar si es un pasillo
    }
}
