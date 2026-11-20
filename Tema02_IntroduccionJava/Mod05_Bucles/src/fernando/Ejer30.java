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
 * EJERCICIO:  [30]
 * FECHA:      20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_NUMEROS = 10;
        int numero;
        boolean negativo;

        negativo = false;

        System.out.println("Introduce diez números: ");
        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.println(String.format("· Número %d de %d: ", i, TOTAL_NUMEROS));
            numero = sc.nextInt();

            if (numero < 0) {
                negativo = true;
            }
        }

        if (negativo == true) {
            System.out.println("Has introducido algún número negativo");
        } else {
            System.out.println("No se han introducido números negativos.");
        }
    } // main

} // class