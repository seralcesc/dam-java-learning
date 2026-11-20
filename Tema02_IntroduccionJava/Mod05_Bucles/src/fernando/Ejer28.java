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
 * EJERCICIO:  [28]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Solicitamos 6 notas, escribir la cantidad de alumnos aprobados,
 * condicionados (=4) y suspensos.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_NOTAS = 6;
        int aprobados, condicionados, suspensos, notas;

        aprobados = 0;
        condicionados = 0;
        suspensos = 0;

        for (int i = 1; i <= TOTAL_NOTAS; i++) {
            System.out.printf("Introducir nota %02d/%02d: %n", i, TOTAL_NOTAS);
            notas = sc.nextInt();
            while (notas < 0 || notas > 10) {
                System.out.println("Nota fuera de rango (0 - 10).");
                notas = sc.nextInt();
            }
            if (notas < 4) {
                    suspensos ++;
                } else if (notas == 4) {
                    condicionados ++;
                } else {
                    aprobados ++;
                }
        }

        System.out.println("__ ESTADÍSTICAS NOTAS __");
        System.out.println(String.format("Notas obtenidas: %02d", TOTAL_NOTAS));
        System.out.println(String.format("· Suspensos: %02d", suspensos));
        System.out.println(String.format("· Condicionados: %02d", condicionados));
        System.out.println(String.format("· Aprobados: %02d", aprobados));


    } // main

} // class