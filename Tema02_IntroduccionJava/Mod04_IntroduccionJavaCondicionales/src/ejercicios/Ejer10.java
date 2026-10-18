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
 * EJERCICIO: [10]
 *
 * ENUNCIADO:
 * Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
 * producto y división. (Ten en cuenta la división por cero).
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, suma, resta, producto, division;

        System.out.println("Escribe NUMERO 1: ");
        num1 = sc.nextDouble();
        System.out.println("Escribe NUMERO 2: ");
        num2 = sc.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;

        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("PRODUCTO: " + producto);

        if (num2 == 0) {
            System.out.println("ERROR: No se puede dividir entre cero");
        } else {
            division = num1 / num2;
            System.out.println("DIVISIÓN: " + division);
        }

    } // main

} // class

