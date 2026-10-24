package relaciona;

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
 * RELACIÓN: [A]
 * EJERCICIO: [10]
 *
 * ENUNCIADO:
 * Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
 * termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean congratulations;

        congratulations = false;
        nota = 0;

        do {
            System.out.println("Introduzca sus notas (-1 para salir): ");
            nota = sc.nextInt();
            if (nota < -1 || nota > 10) {
                System.out.println("Valor introducido incorrecto.");
            } else if (nota == 10) {
                congratulations = true;
            }
        } while (nota != -1);

        if (congratulations) {
            System.out.println("Enhorabuena, obtuviste un 10.");
        }
        System.out.println("FIN DEL PROGRAMA");

    } // main

} // class
