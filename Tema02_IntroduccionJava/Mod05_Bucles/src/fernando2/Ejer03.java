package fernando2;

import java.util.Scanner;

// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS ECLIPSE / JAVA">
/*
 * ========== RECORDATORIOS ECLIPSE / JAVA ==========
 *
 * EDICIÓN EN ECLIPSE:
 * -------------------
 * Shift + Home / End   : Seleccionar línea completa
 * Alt + Flecha Arriba/Abajo : Desplazar línea seleccionada
 * Ctrl + D             : Eliminar línea actual
 * Ctrl + Shift + C     : Comentar o descomentar líneas (o Ctrl + /)
 * Ctrl + Shift + F     : Formatear código (sangría y espacios)
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + O     : Organizar e importar clases automáticamente
 * Ctrl + Espacio       : Autocompletado (escribir 'scanner' + Tab/Enter)
 * Alt + Shift + S      : Menú contextual para generar código (Getters, Setters...)
 * F11                  : Ejecutar aplicación en modo Debug / Ctrl + F11 : Ejecutar normal
 *
 * STRING.FORMAT:
 * --------------
 * println()        | System.out.println("Texto" + variable);       |   Mostrar texto y valores
 * printf()         | System.out.printf("Texto %.2f%n", variable);  |   Mostrar texto con formato
 * String.format()  | String.format("Texto %.2f", variable);        |   Crear un String formateado
 *
 * %d       entero
 * %f       decimal (6 decimales por defecto)
 * %.1f     decimal (con 1 decimal)
 * %.2f     decimal (con 2 decimales)
 * %03d     Mínimo 3 posiciones, rellenando con ceros    (005)
 * %s       cadena de texto
 * %c       char
 * %n       salto de línea (printf no lo hace por defecto)
 * \t       tabulación
 * \n       salto de línea (print o println)
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
 * ========== PROGRAMACIÓN / JAVA ==========
 *
 * MÓDULO: [5]
 * RELACIÓN: [FERNANDO2]
 * EJERCICIO: [03]
 *
 * ENUNCIADO:
 * Escribe un programa en Java que solicite al usuario el número de filas (ancho
 * de un triángulo equilátero y rectángulo). y el carácter con el que desea dibujarla.
 * (ejemplo de 5 filas )
 * 		*****
 * 		****
 * 		***
 * 		**
 * 		*
 *
 * AUTOR: Sergio Alcántara Escudero
 * FECHA: 23 nov 2026
 * =========================================
 */
public class Ejer03 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base;
        String simbolo;

        System.out.println("Introduce la base del triángulo: ");
        base = sc.nextInt();

        System.out.println("¿Qué símbolo quieres utilizar?");
        simbolo = sc.next();

        for (int i = base; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = base; i >= 1; i--) {
            // Primero imprimimos los espacios
            for (int j = 1; j <= base - i; j++) {
                System.out.print("  ");
            }
            // Después imprimimos los asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo + " ");
            }
            // Cambiamos de fila
            System.out.println();
        }

        System.out.println();

        for (int i = base; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();

        for (int i = base; i >= 1; i--) {

            // Espacios iniciales
            for (int j = 1; j <= base - i; j++) {
                System.out.print("  ");
            }

            // Símbolos y espacios interiores
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
