package ejercicios;

import java.util.Scanner;


// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * Home + Shift + End : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
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
 * scanner + Esc + Tab: Crear Scanner sc con import automático
 *
 * ARRAYS:
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
 * EJERCICIO: [13]
 *
 * ENUNCIADO:
 * Escribe un programa que lee dos números y los visualiza en orden ascendente.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce NÚMERO 1: ");
        a = sc.nextInt();
        System.out.println("Introduce NÚMERO 2: ");
        b = sc.nextInt();

        if (a < b) {
            System.out.println(a + " , " + b);
        } else if (b < a) {
            System.out.println(b + " , " + a);
        } else {
            System.out.println("Los números introducidos son iguales: " + a + " , " + b);
        } // if

    } // main

} // class