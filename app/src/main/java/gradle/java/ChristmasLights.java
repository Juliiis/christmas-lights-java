package gradle.java;

public class ChristmasLights {

    Integer turnOn = 1;
    Integer turnOff = 0;
    public int [][] initialGrid = {{0,0,0},
                            {0,0,0},
                            {0,0,0}};


    public int toggleGrid(Integer fila1, Integer columna1, Integer fila2, Integer columna2) {

        for (int i = 0; i < initialGrid.length; i++) {
            for (int j = 0; j < initialGrid.length; j++) {
                if (i >= fila1 && i <= fila2) {
                    if (j >= columna1 && j <= columna2) {
                        if (initialGrid[i][j] == 0) {
                            return initialGrid[i][j] = 1;
                        }
                        return initialGrid[i][j] = 0;
                    }
                }
            }
        }
        return 25;
    }
}
