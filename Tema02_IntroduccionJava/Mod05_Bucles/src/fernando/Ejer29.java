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
 * EJERCICIO:  [29]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        double sueldo, maximo;

        maximo = 0;

        System.out.println("¿Cuántos sueldos quieres cargar? (0. Salir)");
        cantidad = sc.nextInt();
        while (cantidad < 0) {
            System.out.println("Cantidad introducida incorrecta.");
            System.out.println("¿Cuántos sueldos quieres cargar? (0. Salir)");
            cantidad = sc.nextInt();
        }

        for (int i = 1; i <= cantidad; i++) {
            do {
                System.out.printf("Introduce sueldo %d de %d: %n" , i, cantidad);
                sueldo = sc.nextDouble();

                if (sueldo <= 0) {
                    System.out.println("El suelo no puede ser 0, ni negativo.");
                }
            } while (sueldo <= 0);

            maximo = Math.max(maximo, sueldo);

        }

        if (cantidad == 0) {
            System.out.println("Hasta la próxima");
        } else if (cantidad == 1) {
            System.out.println(String.format("Sólo se ha introducido un sueldo: %.2f €", maximo));
        } else {
            System.out.println(String.format("El sueldo más alto ha sido %.2f €", maximo));
        }



    } // main

} // class