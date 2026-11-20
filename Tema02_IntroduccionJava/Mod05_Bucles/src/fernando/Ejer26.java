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
 * MÓDULO:    [5]
 * RELACIÓN:  [FERNANDO]
 * EJERCICIO: [26
 * FECHA:     20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
 * alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */

public class Ejer26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int TOTAL_ALUMNOS = 5;
        final int EDAD_LIMITE = 18;
        final double ALTURA_LIMITE = 1.75;
        int edad, contEdad, contAltura;
        double altura, mediaEdad, mediaAltura;

        contEdad = 0;
        contAltura = 0;
        mediaEdad = 0;
        mediaAltura = 0;

        System.out.println("=== CARGA DE DATOS ===");

        for (int i = 1; i <= TOTAL_ALUMNOS; i++) {
            do {
                System.out.println(String.format("Introduce la edad del "
                        + "alumno %d/%d: ", i, TOTAL_ALUMNOS ));
                edad = sc.nextInt();
            } while (edad < 1);
            mediaEdad += edad;
            if (edad > EDAD_LIMITE) {
                contEdad ++;
            }

            do {
                System.out.println(String.format("Introduce la altura "
                        + "(en metros, separador:\",\") del alumno  %d/%d: ", i, TOTAL_ALUMNOS ));
                altura = sc.nextDouble();
            } while (altura < 0.01);
            mediaAltura += altura;
            if (altura > ALTURA_LIMITE) {
                contAltura ++;
            }

        }

        mediaEdad = mediaEdad / TOTAL_ALUMNOS;
        mediaAltura = mediaAltura / TOTAL_ALUMNOS;

        System.out.println("=== ESTADÍSTICAS DE ALMUNOS ===");
        System.out.println("Total alumnos: " + TOTAL_ALUMNOS);
        System.out.println(String.format("· Edad media de alumnos: %.2f.", mediaEdad));
        System.out.println(String.format("· Altura media de alumnos: %.2f.", mediaAltura));
        System.out.println(String.format("· Alumnos mayores de %d años: %d", EDAD_LIMITE,contEdad));
        System.out.println(String.format("· Alumnos que superan %.2f m.: %d", ALTURA_LIMITE, contAltura));



    } // main

} // class