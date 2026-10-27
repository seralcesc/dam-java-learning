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
 * EJERCICIO: [01]
 *
 * ENUNCIADO:
 * Desarrollar un programa que permita por medio de la edad de una
 * persona, determinar la categoría en la que pertenece a raíz de la
 * siguiente tabla:
 * Rango de edad Categoría
 * 0 - 5 Infante
 * 6 - 10 Niño
 * 11 - 15 Pre adolescente
 * 16 - 18 Adolescente
 * 19 - 25 Pre adulto
 * 26 - 40 Adulto
 * 41 - 55 Pre anciano
 * 56+ Anciano
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Edad introducida incorrecta.");
        } else {
            System.out.println("-- CATEGORÍA: --");
            if (edad <= 5) {
                System.out.println("INFANTE");
            } else if (edad <= 10) {
                System.out.println("NIÑO");
            } else if (edad <= 15) {
                System.out.println("PRE-ADOLESCENTE");
            } else if (edad <= 18) {
                System.out.println("ADOLESCENTE");
            } else if (edad <= 25) {
                System.out.println("PRE-ADULTO");
            } else if (edad <= 40) {
                System.out.println("ADULTO");
            } else if (edad <= 55) {
                System.out.println("PRE-ANCIANO");
            } else {
                System.out.println("ANCIANO");
            }
        }

    } // main

} // class
