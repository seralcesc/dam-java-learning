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
 * EJERCICIO: [17]
 *
 * ENUNCIADO:
 * Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y
 * segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un
 * segundo.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos, minutos, horas;

        System.out.println("Introduce: ");
        System.out.println("HORAS: ");
        horas = sc.nextInt();
        System.out.println("MINUTOS: ");
        minutos = sc.nextInt();
        System.out.println("SEGUNDOS: ");
        segundos = sc.nextInt();
        System.out.printf("Has introducido %02d:%02d:%02d.%n", horas, minutos,
                segundos);

        if ((horas < 0 || horas > 23) || (minutos < 0 || minutos > 59) || (segundos < 0 || segundos > 59)) { // if 1
            System.out.println("Valor introducido incorrecto.");
        } else {
            if (segundos <= 58) { // if 2
                segundos++;
            } else {
                segundos = 0;
                if (minutos <= 58) { // if 3
                    minutos++;
                } else {
                    minutos = 0;
                    if (horas <= 22) { // if 4
                        horas++;
                    } else {
                        horas = 0;
                    } //if 4
                } //if 3
            } // if 2
        } // if 1

        System.out.println(String.format("Resultado: %02d:%02d:%02d.", horas, minutos,
                segundos));

    } // main

} // class
