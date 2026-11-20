package fernando;

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
 * Ctrl + R           : (sobre la variable) Cambia el nombre a todas las variables iguales
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
 * RELACIÓN: [FERNANDO]
 * EJERCICIO: [05]
 *
 * ENUNCIADO:
 * Escribe un programa JAVA que permita resolver una ecuación de segundo grado de la forma ax² + bx
 * + c = 0
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */

public class Ejer05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, discriminante;

        System.out.println("Introduce el valor de A: ");
        a = sc.nextDouble();
        System.out.println("Introduce el valor de B: ");
        b = sc.nextDouble();
        System.out.println("Introduce el valor de C: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("El valor de 'a' no puede ser 0 en una ecuación de segundo grado.");
        } else {

            discriminante = Math.pow(b, 2) - (4 * a * c);

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales (el discriminante es negativo).");
            }
        }



    } // main

} // class