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
 * MÓDULO: [5]
 * RELACIÓN: [FERNANDO]
 * EJERCICIO: [32]
 * FECHA: 20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Realizar un programa que nos pida un número n, y nos diga cuántos
 * números hay entre 1 y n que son primos.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, contador, primo;
        primo = 0;

        System.out.println("¿CUÁNTOS NÚMEROS PRIMOS HAY ENTRE 1 Y...");
        System.out.print("Y...(Introduce un número)? :");
        numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            contador = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                primo++;
            }
        }

        System.out.println("Cantidad de números primos: " + primo);

    } // main

} // class
