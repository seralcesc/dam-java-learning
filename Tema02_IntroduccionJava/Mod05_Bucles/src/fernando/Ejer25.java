package fernando;

import java.util.Scanner;



// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * --------
 * Home + Shift + End   : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
 * Ctrl + E             : Eliminar línea actual
 * Ctrl + 7             : Comentar o descomentar (Tambiém Ctrl + Shift + C)
 * Alt + Shift + F      : Formatear y aplicar sangría
 * Ctrl + R             : (sobre la variable) Cambia el nombre a todas las variables iguales
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scaner + Tab       : Crear Scanner sc con import automático
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
 * %03d     Mínimo 3 posiciones, rellenando con ceros	(005)
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
 * ================================================
 *               PROGRAMACIÓN / JAVA
 * ================================================
 *
 * MÓDULO:     [5]
 * RELACIÓN:   [FERNANDO]
 * EJERCICIO:  [25]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_SUELDOS = 10;

        int mayorMil;
        double totalSueldos, sueldo;

        mayorMil = 0;
        totalSueldos = 0;

        System.out.println("=== CALCULADORA DE SUELDOS ===");

        for (int i = 1; i <= TOTAL_SUELDOS; i++) {
            System.out.println(String.format("Introduce sueldo %d/%d: ", i, TOTAL_SUELDOS));
            sueldo = sc.nextDouble();
            if (sueldo < 0) {
                sueldo = 0;
                System.out.println("El sueldo no puede ser inferior a 0€. Se ha introducido 0 por defecto.");
            } else {
                totalSueldos += sueldo;
                if (sueldo > 1000) {
                    mayorMil ++;
            }


            }
        }

        System.out.println(String.format("Suma total de los sueldos: %.2f €", totalSueldos));
        if (mayorMil == 0) {
            System.out.println("No se han introducido sueldos superiores a 1000 €.");
        } else {
            System.out.println("Sueldos superiores a 1.000 €: " + mayorMil);
        }

    } // main

} // class