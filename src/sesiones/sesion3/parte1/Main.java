package sesiones.sesion3.parte1;

import java.util.function.Function;

public class Main {

    // Estaticas
    static public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    static public double restar(double num1, double num2) {
        return num1 - num2;
    }

    static public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    // Lambda
    interface Operaciones {

        double resultado(double num1, double num2);
    }

    public static void main(String[] args) {
        double primerNumero = 10, segundoNumero = 2;

        // Funciones Estaticas
        // double suma = sumar(primerNumero, segundoNumero);
        // double resta = restar(primerNumero, segundoNumero);
        // double multiplicar = multiplicar(primerNumero, segundoNumero);
        // double dividir = dividir(primerNumero, segundoNumero);
        // Funciones Lambda
        
        Operaciones suma = (num1, num2) -> num1 + num2;
        Operaciones resta = (num1, num2) -> num1 - num2;
        Operaciones producto = (num1, num2) -> num1 * num2;
        Operaciones dividir = (num1, num2) -> num1 / num2;

        double variableSuma = suma.resultado(primerNumero, segundoNumero);
        double variableResta = resta.resultado(primerNumero, primerNumero);
        double variableProducto = producto.resultado(primerNumero, primerNumero);
        double variableDividir = dividir.resultado(primerNumero, primerNumero);

        // Tipo <R,T>
        Function<Integer, String> convertir = (numero) -> "Numero: " + numero;
        String resultado = convertir.apply(10);
        System.out.println(resultado);

    }

}
