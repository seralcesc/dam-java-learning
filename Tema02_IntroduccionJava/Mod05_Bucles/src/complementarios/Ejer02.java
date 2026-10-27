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
 * MÓDULO: [X]
 * RELACIÓN: [X]
 * EJERCICIO: [XX]
 *
 * ENUNCIADO:
 * Desarrollar un programa que permita determinar la cantidad de cifras
 * de un número X teniendo en cuenta que el número únicamente puede
 * tener 4 cifras. Mostrar un mensaje por defecto si el número supera las
 * 4 cifras.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, evaluacion;
        String texto;

        System.out.println("·· CONTADOR DE CIFRAS ··");
        System.out.println("Introduce una cantidad:");
        num = sc.nextInt();

        if (num < 0) {
            num = Math.abs(num);
        }

        texto = String.valueOf(num);
        evaluacion = texto.length();

        switch (evaluacion) {
            case 1:
                System.out.println("El número tiene 1 cifra.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.printf("El número tiene %d cifras.%n", evaluacion);
                break;
            default:
                System.out.println("El número supera las 4 cifras.");
        }

    } // main

} // class
