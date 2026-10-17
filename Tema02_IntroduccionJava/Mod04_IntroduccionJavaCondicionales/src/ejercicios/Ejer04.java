
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
 * EJERCICIO: [04]
 *
 * ENUNCIADO:
 * Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
 * producto y división.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, suma, resta, producto, division;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;

        System.out.println("SUMA de " + num1 + " y " + num2 + " : " + suma);
        System.out.println("RESTA de " + num1 + " y " + num2 + " : " + resta);
        System.out.println("PRODUCTO de " + num1 + " por " + num2 + " : " + producto);

        if (num2!=0) {
            division = num1 / num2;
            System.out.println("DIVISIÓN de " + num1 + " entre " + num2 + " : " + division);
        } else {
            System.out.println("DIVISIÓN: No se puede dividir por 0.");
        }


    } // main

} // class

