package ejercicios;


import java.util.Scanner;


// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * --------
 * Home + Shift + End : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
 * Ctrl + E           : Eliminar línea actual
 * Ctrl + /           : Comentar o descomentar
 * Alt + Shift + F    : Formatear y aplicar sangría
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scanner + Esc + Tab: Crear Scanner sc con import automático
 *
 * STRINF.FORMAT:
 * --------------
 * println()        | System.out.println("Texto" + variable);       |    Mostrar texto y valores
 * printf()         | System.out.printf("Texto %.2f%n", variable);  |    Mostrar texto con formato
 * String.format()	| String.format("Texto %.2f", variable);        |    Crear un String formateado
 *
 * %d	entero
 * %f	decimal (6 decimales por defecto)
 * %.1f decimal (con 1 decimal)
 * %.2f decimal (con 2 decimales)
 * %s	cadena de texto
 * %c	char
 * %n   salto de linea (printf no lo hace por defecto)
 * \t   tabulación
 * \n	Salto de línea
 * \'	Mostrar comilla simple '
 * %%	muestra el símbolo %
 * \"   \"Teclado\" => "Teclado"
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
 * MÓDULO: [4]
 * EJERCICIO: [14]
 *
 * ENUNCIADO:
 * Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, mayor;

        System.out.println("Introduce dos números. \nNÚMERO 1: ");
        a = sc.nextInt();
        System.out.println("NÚMERO 2: ");
        b = sc.nextInt();

        mayor = Math.max(a, b);
        if (a == b) {
            System.out.print("Has introducido dos números iguales: ");
        } else {
            System.out.print("El mayor es: ");
        }

        System.out.println(mayor);

    } // main

} // class