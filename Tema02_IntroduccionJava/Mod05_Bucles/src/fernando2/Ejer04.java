package fernando2;

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
 * PROGRAMACIÓN / JAVA
 * ================================================
 *
 * MÓDULO: [5]
 * RELACIÓN: [FERNANDO2]
 * EJERCICIO: [04]
 * FECHA: 25/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Escribe un programa en Java que solicite al usuario el número de filas (ancho
 * de un triángulo equilátero y rectángulo). y el carácter con el que desea dibujarla.
 * (ejemplo de 5 filas )
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int altura;
        String simbolo;

        System.out.println("Introduce la altura del triángulo: ");
        altura = sc.nextInt();

        System.out.println("¿Qué símbolo quieres utilizar?");
        simbolo = sc.next();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= altura; i++) {

            // Imprimir espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            // Imprimir símbolos
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo + " ");
            }

            // Cambiar de línea
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= altura; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == altura) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= altura; i++) {

            // Espacios de alineación
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            // Símbolos y espacios interiores
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == altura) {
                    System.out.print(simbolo + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    } // main

} // class
