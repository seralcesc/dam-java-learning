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
 * EJERCICIO: [09]
 *
 * ENUNCIADO:
 * Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de
 * edad” o el mensaje de “eres menor de edad”.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Valor incorrecto.");
        } else if (edad < 18) {
            System.out.println("Eres menor de edad. ");
        } else {
            System.out.println("Eres mayor de edad. ");
        } // if
    } // main

} // class

