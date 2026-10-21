package ejercicios;

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
 * %.03d    Mínimo 3 posiciones, rellenando con ceros	(005)
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
 * MÓDULO: [4]
 * EJERCICIO: [16]
 *
 * ENUNCIADO:
 * Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
 * calificación alfabética, escribiendo el resultado.
 * • de 0 a <3 Muy Deficiente.
 * • de 3 a <5 Insuficiente.
 * • de 5 a <6 Bien.
 * • de 6 a <9 Notable
 * • de 9 a 10 Sobresaliente
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Ingresa tu nota: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida.");
        } else if (nota >= 0 && nota < 3) {
            System.out.println("MUY DEFICIENTE");
        } else if (nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota < 6) {
            System.out.println("BIEN");
        } else if (nota < 9) {
            System.out.println("NOTABLE");
        } else {
            System.out.println("SOBRESALIENTE");
        }

    } // main

} // class
