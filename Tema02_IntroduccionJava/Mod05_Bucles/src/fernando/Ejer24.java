package fernando;

import java.util.Scanner;



// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * --------
 * Home + Shift + End   : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
 * Ctrl + E             : Eliminar línea actual
 * Ctrl + 7             : Comentar o descomentar (Tambiém Ctrl + Shift + C)
 * Alt + Shift + F      : Formatear y aplicar sangría
 * Ctrl + R             : (sobre la variable) Cambia el nombre a todas las variables iguales
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scaner + Tab       : Crear Scanner sc con import automático
 *
 * STRING.FORMAT:
 * --------------
 * println()        | System.out.println("Texto" + variable);       |    Mostrar texto y valores
 * printf()         | System.out.printf("Texto %.2f%n", variable);  |    Mostrar texto con formato
 * String.format()	| String.format("Texto %.2f", variable);        |    Crear un String formateado
 *
 * %d       entero
 * %f       decimal (6 decimales por defecto)
 * %.1f     decimal (con 1 decimal)
 * %.2f     decimal (con 2 decimales)
 * %03d     Mínimo 3 posiciones, rellenando con ceros	(005)
 * %s       cadena de texto
 * %c       char
 * %n       salto de linea (printf no lo hace por defecto)
 * \t       tabulación
 * \n       Salto de línea (print o println)
 * \'       Mostrar comilla simple '
 * %%       muestra el símbolo %
 * \"       \"Teclado\" => "Teclado"
 *
 * ARRAYS:
 * -------
 * java.util.Arrays
 *
 * ELIMINAR ESTE BLOQUE ANTES DE ENTREGAR.
 * ====================================================
 */
// </editor-fold>

/**
 * ================================================
 *               PROGRAMACIÓN / JAVA
 * ================================================
 *
 * MÓDULO:     [5]
 * RELACIÓN:   [FERNANDO]
 * EJERCICIO:  [24]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pedir 10 números. Mostrar la media de los números positivos, la
 * media de los números negativos y la cantidad de ceros.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, positivo, negativo, cero;
        double totalPos, totalNeg;

        cero = 0;
        negativo = 0;
        positivo = 0;
        totalPos = 0;
        totalNeg = 0;

        System.out.println("Introduce 10 números: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("Número %d: ", i));
            numero = sc.nextInt();
            if (numero > 0) {
                positivo += 1;
                totalPos += numero;
            } else if (numero < 0) {
                negativo += 1;
                totalNeg += numero;
            } else {
                cero += 1;
            }
        }

        if (positivo > 0) {
            totalPos = totalPos / positivo;
            System.out.println("La media de los números positivos introducidos es: " + totalPos);
        } else {
            System.out.println("No se han introducido números positivos.");
        }

        if (negativo > 0) {
            totalNeg = totalNeg / negativo;
            System.out.println("La media de los números negativos introducidos es: " + totalNeg);
        } else {
            System.out.println("No se han introducido números negativos.");
        }

        if (cero > 0) {
            System.out.printf("Se han introducido %d ceros%n", cero);
        } else {
            System.out.println("No se han introducido 0.");
        }


    } // main

} // class
