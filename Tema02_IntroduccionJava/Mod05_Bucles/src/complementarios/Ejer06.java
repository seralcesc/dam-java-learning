package complementarios;

import java.util.Scanner;

// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * --------
 * Home + Shift + End : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
 * Ctrl + E           : Eliminar línea actual
 * Ctrl + 7           : Comentar o descomentar (Tambiém Ctrl + Shift + C)
 * Alt + Shift + F    : Formatear y aplicar sangría
 * Ctrl + R           : (sobre la variable) Cambia el nombre a todas las variables iguales
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scanner + Esc + Tab: Crear Scanner sc con import automático
 *
 * STRING.FORMAT:
 * --------------
 * println()        | System.out.println("Texto" + variable);       |    Mostrar texto y valores
 * printf()         | System.out.printf("Texto %.2f%n", variable);  |    Mostrar texto con formato
 * String.format()	| String.format("Texto %.2f", variable);        |    Crear un String formateado
 *
 * %d       entero
 * %f       decimal (6 decimales por defecto)
 * %.1f     decimal (con 1 decimal)
 * %.2f     decimal (con 2 decimales)
 * %03d    Mínimo 3 posiciones, rellenando con ceros	(005)
 * %s       cadena de texto
 * %c       char
 * %n       salto de linea (printf no lo hace por defecto)
 * \t       tabulación
 * \n       Salto de línea (print o println)
 * \'       Mostrar comilla simple '
 * %%       muestra el símbolo %
 * \"       \"Teclado\" => "Teclado"
 *
 * ARRAYS:
 * -------
 * java.util.Arrays
 *
 * ELIMINAR ESTE BLOQUE ANTES DE ENTREGAR.
 * ====================================================
 */
// </editor-fold>
/**
 * ========== PROGRAMACIÓN / JAVA ==========
 *
 * MÓDULO: [5]
 * RELACIÓN: [COMPLEMENTARIOS]
 * EJERCICIO: [06]
 *
 * ENUNCIADO:
 * Desarrollar un programa que permita definir si un número entero ya
 * establecido es un número perfecto o no.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma;

        System.out.println("Introduce un número para saber si es perfecto: ");
        numero = sc.nextInt();
        suma = 0;

        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (numero == suma && numero > 0) {
            System.out.println(String.format("El número %d, es PERFECTO.", numero));
        } else {
            System.out.println(String.format("El número %d, NO es PERFECTO.", numero));
        }

    } // main

} // class
