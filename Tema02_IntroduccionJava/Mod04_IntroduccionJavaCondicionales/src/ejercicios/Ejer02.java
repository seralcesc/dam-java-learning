
package ejercicios;


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
 * EJERCICIO: [02]
 *
 * ENUNCIADO:
 * Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer02 {

    public static void main(String[] args) {
        double lado = 5;
        double area;

        area = Math.pow(lado, 2);
        System.out.println("El área es: " + area);

    } // main

} // class

