package com.patterDesignBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter

import java.util.Locale;
import java.util.Scanner;

/**
 * @author: Hugo Abner Palomino Galindo
 */
public class Main {
    public static void main(String[] args) {
        /* TIPOS DE VARIABLES EN JAVA **/
        /*
         *  Es buena practica declarar las variable en formato camelCase
         */
        int miPrimeraVariable;

        miPrimeraVariable = 200;
        miPrimeraVariable = 300;
        System.out.println("El valor de la variable es:  " + miPrimeraVariable);

        /*
         *  NUMEROS ENTEROS
         */
        byte variableByte = 100; // 8 bits
        short variableShort = 1000; // 16 bits
        int variableInt = 100000; // 32 bits
        long variableLong = 10000000000L; // 64 bits

        /*
         *NUMEROS REALES
         * double: 64 bits, mayor precision, recomendado para cálculos científicos y financieros.
         * float: 32 bits, menor precisión, recomendado para gráficos y juegos.
         */
        float variableFloat = 100.9999f; // 32 bits
        double variableDouble = 100.9999999999; // 64 bits

        /*
         * BOOLEANOS
         */
        boolean variableBoolean = true; // Puede ser true o false

        /*
         * CADENAS Y CARACTERES
         */
        String variableString = "Hola Mundo"; // Cadena de texto
        char variableChar = 'a'; // Caracter individual

        /*
        Mostrar en consola el valor de las variables
         */
        System.out.println("Vriable byte: " + variableByte);
        System.out.println("Variable short: " + variableShort);
        System.out.println("Variable int: " + variableInt);
        System.out.println("Variable long: " + variableLong);
        System.out.println("Variable float: " + variableFloat);
        System.out.println("Variable double: " + variableDouble);
        System.out.println("Variable boolean: " + variableBoolean);
        System.out.println("Variable String: " + variableString);
        System.out.println("Variable char: " + variableChar);

        /*
         * CONSTANTES
         * de preferencia utilizamos el nombre de la constante en formato UPPER_SNAKE_CASE
         */

        final int VALOR_CONSTANTE = 100; // No se puede cambiar su valor después de la asignación
        System.out.println("Valor de la constante: " + VALOR_CONSTANTE);

        // Creamos un scanner para pedir datos al usuario
        Scanner sn = new Scanner(System.in);
        // Recomendado para cuando se piden valores decimales
        sn.useLocale(Locale.US);
        // Recomendado para cuando se piden cadenas con espacios
        sn.useDelimiter("\n");

        //Pedimos y mostramos un valor entero al usuario
        System.out.println("Introduce un valor: ");
        int numero = sn.nextInt();

        System.out.println("Has introducido el número: " + numero);

        // pedimos y mostramos un valor decimal al usuario
        System.out.println("Introduce un valor decimal: ");
        double decimal = sn.nextDouble();

        System.out.println("Has introducido el número decimal: " + decimal);

        // Pedimos y mostramos una cadena al usuario
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sn.next();

        System.out.println("Has introducido la cadena: " + cadena);


    }
}























