package ejercicios;

import java.util.Scanner;
import javax.swing.AbstractSpinnerModel;


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
 * EJERCICIO: [06]
 *
 * ENUNCIADO:
 * Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el
 * porcentaje de descuento realizado.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vendido, precio, descuento;

        System.out.println("Introduce el precio real del artículo: ");
        precio = sc.nextDouble();
        System.out.println("Introduce el precio por el que fue vendido: ");
        vendido = sc.nextDouble();

        if (precio <= 0 || vendido < 0) {
            System.out.println("Error: Precios no válidos.");
        } else if (vendido > precio) {
            System.out.println(
                    "Error: el precio por el que fue vendido no puede ser superior a su precio inicial.");
        } else {
            descuento = 100 - ((vendido * 100) / precio);
            System.out.println("El descuento es del: " + descuento + "%.");
        } //if

    } // main

} // class

