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
 * MÓDULO: [X]
 * RELACIÓN: [X]
 * EJERCICIO: [XX]
 *
 * ENUNCIADO:
 * Escribe un programa que toma como dato de entrada un número que corresponde a la longitud
 * de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de
 * la esfera que corresponden con dicho radio.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area, volumen;

        System.out.println("Introduce el valor del radio: ");
        radio = sc.nextDouble();

        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
        volumen = 4.0/3*Math.PI*Math.pow(radio, 3);

        System.out.println("\n######### RESULTADOS #########\n");
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);

    } // main

} // class

