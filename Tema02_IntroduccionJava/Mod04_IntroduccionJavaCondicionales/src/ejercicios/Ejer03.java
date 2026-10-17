
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
 * EJERCICIO: [03]
 *
 * ENUNCIADO:
 * Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado, area;

        System.out.println("Introduce el valor del lado: ");
        lado = sc.nextInt();

        area = lado*lado;
        System.out.println("El área del cuadrado es: " + area);

    } // main

} // class

