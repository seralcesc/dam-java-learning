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
 * EJERCICIO:  [27]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pide un número (que debe estar entre 0 y 10) y muestra la tabla de
 * multiplicar de dicho número.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("::: TABLAS DE MULTIPLICAR :::");
        System.out.println("Introduce la tabla que quieres ver (0 - 10): ");
        numero = sc.nextInt();

        while (numero < 0 || numero > 10) {
            System.out.println("Fuera de rango. (0 - 10):");
            numero = sc.nextInt();
        }
        System.out.println();
        System.out.println(String.format("::: TABLA DE MULTIPLICAR DEL %d :::", numero));
        System.out.println("-----------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d x %d = " + numero * i, numero, i));

        }
    } // main

} // class