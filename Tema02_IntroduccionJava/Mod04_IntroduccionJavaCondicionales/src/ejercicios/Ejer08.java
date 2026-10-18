
package ejercicios;

import java.util.Scanner;


/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * Home + Shift + End : Seleccionar línea completa
 * Alt + Shift + Flecha    : Desplazar línea seleccionada
 * Ctrl + E           : Eliminar línea actual
 * Ctrl + /           : Comentar o descomentar
 * Alt + Shift + F    : Formatear y aplicar sangría
 *
 * AYUDAS:
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scanner + Tab      : Crear Scanner sc con import automático
 *
 * ARRAYS:
 * java.util.Arrays
 *
 * ELIMINAR ESTE BLOQUE ANTES DE ENTREGAR.
 * ====================================================
 */


/**
 * ========== PROGRAMACIÓN / JAVA ==========
 *
 * MÓDULO: [4]
 * EJERCICIO: [08]
 *
 * ENUNCIADO:
 * Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de
 * edad” solo si lo somos.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }

        System.out.println("Fin del programa.");

    } // main

} // class

