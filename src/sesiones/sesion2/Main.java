package sesiones.sesion2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void pedirNumero() {
        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            pedirNumero();
        }
    }

    public static void main(String[] args) {
        int[] vector = {5, 2, 0, 9, 1, 8, 7, 9};
        int[] vectorTres = new int[10];
        String[] textos = {"hola", "adios", "como", "estas"};

        // ForEach
        for (String item : textos) {
            System.out.println(item);
        }

        // Ordenar
        Arrays.sort(vector);
        // Imprimir
        System.out.println(Arrays.toString(vector));

        // Rellenar
        Arrays.fill(vectorTres, 2);
        // Imprimir
        System.out.println(Arrays.toString(vectorTres));

        // Copiar
        int[] vectorDos = Arrays.copyOfRange(vector, 2, 5);
        // Imprimir
        System.out.println(Arrays.toString(vectorDos));
        // Comparar
        System.out.println(Arrays.equals(vector, vectorDos));

        // for (int i = 0; i < vector.length; i++) {
        //     System.out.println(vector[i]);
        // }
        // Busqueda Binaria
        System.out.println("Posición del 5: " + Arrays.binarySearch(vector, 5)); // Busqueda Binaria

        pedirNumero();

        char[] cadenaTexto = "HolaMundo".toCharArray();
        for (char item : cadenaTexto) {
            System.out.println(item);
        }
    }
}
