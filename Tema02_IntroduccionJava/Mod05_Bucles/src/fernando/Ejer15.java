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
 * PROGRAMACIÓN / JAVA
 * ================================================
 *
 * MÓDULO:    [5]
 * RELACIÓN:  [FERNANDO]
 * EJERCICIO: [15]
 * FECHA:     18/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 * Con meses de 28, 30 y 31 días. Sin años bisiestos.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        boolean valida;

        valida = false;

        System.out.println("Introduce una fecha para validarla: ");
        System.out.println("· Día:");
        dia = sc.nextInt();
        System.out.println("· Mes:");
        mes = sc.nextInt();
        System.out.println("· Año");
        anio = sc.nextInt();

        if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || anio < 1) {
            System.out.println("La fecha introducida NO es válida.");

        } else {

            switch (mes) {
                case 2:
                    if (dia <= 28) {
                        valida = true;
                    }
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia <= 31) {
                        valida = true;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (dia <= 30) {
                        valida = true;
                    }
                    break;

            }
            if (valida) {
                System.out.println("La fecha introducida es válida.");
            } else {
                System.out.println("La fecha introducida NO es válida.");
            }
        }

    } // main

} // class
