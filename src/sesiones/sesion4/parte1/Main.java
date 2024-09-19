package sesiones.sesion4.parte1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            Arrays.fill(matriz[i], i);
        }

        System.out.println("Recorrido Arrays:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Recorrido Por Filas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Recorrido Diagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        System.out.println("Recorrido Diagonal Segundaria:");
        for (int i = (matriz.length - 1); i >= 0; i--) {
            System.out.println(matriz[i][i]);
        }

        System.out.println("Recorrido Columnas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
    }
}
