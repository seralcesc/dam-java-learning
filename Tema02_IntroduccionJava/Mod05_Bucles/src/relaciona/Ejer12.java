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
 * EJERCICIO: [12]
 *
 * ENUNCIADO:
 * Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
 * potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
 * pantalla.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, resultado;
        int expo;

        resultado = 0;

        System.out.println("Introduce el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Introduce el valor del exponente: ");
        expo = sc.nextInt();

//        if (base == 0 && expo <= 0) {
//            System.out.println("Operación no definida.");
//        } else if (base == 0) {
//            resultado = 0;
//        } else if (expo == 0) {
//            resultado = 1;
//        } else if (expo < 0) {
//            resultado = 1;
//            int expoPositivo = Math.abs(expo);
//            double producto = 1;
//            for (int i = 1; i <= expoPositivo; i++) {
//                producto *= base;
//            }
//            resultado = 1.0 / producto;
//        } else {
//            resultado = 1;
//            for (int i = 1; i <= expo; i++) {
//                resultado *= base;
//            }
//        }
//


        if (base == 0 && expo <= 0) {
            System.out.println("Operación no definida.");
        } else if (base == 0) {
            resultado = 0;
        } else if (expo == 0) {
            resultado = 1;
        } else {
            resultado = Math.pow(base, expo);
        }

        if (!(base == 0 && expo <= 0)) {
            System.out.printf("El resultado de calcular %.2f elevado a %d es: %.2f%n", base, expo,
                    resultado);
        }
    } // main

} // class
