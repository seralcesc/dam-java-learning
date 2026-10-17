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
 * MÓDULO: [X]
 * RELACIÓN: [X]
 * EJERCICIO: [XX]
 *
 * ENUNCIADO:
 * Escribe un programa que toma como dato de entrada un número que corresponde a la longitud
 * de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de
 * la esfera que corresponden con dicho radio.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area, volumen;

        System.out.println("Introduce el valor del radio: ");
        radio = sc.nextDouble();

        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
        volumen = 4.0/3*Math.PI*Math.pow(radio, 3);

        System.out.println("\n######### RESULTADOS #########\n");
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);

    } // main

} // class

