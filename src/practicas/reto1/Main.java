/* Hacer un algoritmo que muestre los primeros n números primos */
package practicas.reto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad: ");
        int number = Integer.parseInt(sc.nextLine());
        int counter = 0;
        int primo = 2;
        while (counter < number) {
            boolean esPrimo = true;
            for (int i = (primo - 1); i > 1; i--) {
                if (primo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                counter++;
            }
            String resultado = (esPrimo) ? "» " + primo + ".\n" : "";
            System.out.print(resultado);
            primo++;
        }
    }
}
