package sesiones.sesion1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* final int constantes = 5  */

        Scanner sc = new Scanner(System.in);
        /* Libreria para entrada de teclado */

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        /* Ingresar texto */

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        /* Ingresar entero  */

        System.out.print("Ingrese su estatura: ");
        double estatura = Double.parseDouble(sc.nextLine());
        /* Float.parseFloat(sc.nextLine())
        Ingresar decimal */

        if (nombre.equals("Juan")) {
            /* Comparación de cadenas de texto */
            System.out.println("La condición del nombre coincide.");
        }

        String condicion = (10 > 9) ? "La condición ternaria se cumple" : "La condiciön ternaria no se cumple";
        /* Condicionales ternarios */
        System.out.println(condicion);

        /* Concatenación */
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + estatura);

        /* Uso de Object, variable global en Java */
        Object variable = "Hola Mundo";
        if (variable instanceof Integer) {
            System.out.println("La variable es un entero: " + (int) variable);
        } else if (variable instanceof String) {
            System.out.println("La variable es texto: " + (String) variable);
        }

    }
}
