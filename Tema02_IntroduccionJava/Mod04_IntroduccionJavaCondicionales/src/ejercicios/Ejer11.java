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
 * EJERCICIO: [11]
 *
 * ENUNCIADO:
 * Escribe un programa que lee 2 números y muestra el mayor.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, mayor;

        System.out.println("Escribe los dos números a comparar: ");
        System.out.println("NÚMERO 1:");
        num1 = sc.nextInt();
        System.out.println("NÚMERO 2:");
        num2 = sc.nextInt();

        mayor = Math.max(num1, num2);
        System.out.println(mayor);

    } // main

} // class
