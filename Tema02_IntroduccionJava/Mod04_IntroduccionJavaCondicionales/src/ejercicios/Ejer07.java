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
 * EJERCICIO: [07]
 *
 * ENUNCIADO:
 * Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y
 * escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double millas, metros;

        System.out.println("Introduce la distancia en millas a convertir: ");
        millas = sc.nextDouble();

        if (millas<0) {
            System.out.println("Distancia incorrecta.");
        } else {
            metros = millas * 1852;
            System.out.println(millas + " son: " + metros + " metros.");
        } // if
    } // main

} // class

