package complementarios;

import java.awt.BorderLayout;
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
 * EJERCICIO: [04]
 *
 * ENUNCIADO:
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo
 * la siguiente información: cantidad total de preguntas que se le
 * realizaron y la cantidad de preguntas que contestó correctamente.
 * Desarrolle un programa que informe el nivel según el porcentaje de
 * respuestas correctas que ha obtenido, y sabiendo que:
 * 1. Nivel máximo: Porcentaje >= 90%.
 * 2. Nivel medio: Porcentaje >= 75% y <90%.
 * 3. Nivel regular: Porcentaje >= 50% y <75%.
 * 4. Fuera de nivel: Porcentaje < 50%.
 *
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aciertos;
        final int PREGUNTAS;
        double porcentaje;

        PREGUNTAS = 50;

        System.out.println("-- RESULTADOS --");
        System.out.println("Introduzca sus aciertos: ");
        aciertos = sc.nextInt();

        if (aciertos < 0 || aciertos > PREGUNTAS) {
            System.out.println("Valor introducido incorrecto");
        } else {
            porcentaje = aciertos * 100.0 / PREGUNTAS;
            System.out.println("");
            System.out.println("###################################");
            System.out.println(" ###### TABLA DE PUNTUACIÓN ######");
            System.out.println("###################################");
            System.out.println("1. Nivel máximo: Porcentaje >= 90%\n"
                    + "2. Nivel medio: Porcentaje >= 75% y <90%.\n"
                    + "3. Nivel regular: Porcentaje >= 50% y <75%.\n"
                    + "4. Fuera de nivel: Porcentaje < 50%.");
            System.out.println("#################################");
            System.out.println("");

            System.out.println(String.format("Porcentaje de aciertos: %.2f\n", porcentaje));

            System.out.print("Nivel del aspirante: ");
            if (porcentaje < 50) {
                System.out.println(" FUERA DE NIVEL");
            } else if (porcentaje < 75) {
                System.out.println(" REGULAR");
            } else if (porcentaje < 90) {
                System.out.println(" MEDIO");
            } else {
                System.out.println(" MÁXIMO");
            }
        }

    } // main

} // class
