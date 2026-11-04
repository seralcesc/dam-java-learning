package complementarios;

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
 * RELACIÓN: [COMPLEMENTARIOS]
 * EJERCICIO: [17]
 *
 * ENUNCIADO:
 * Solicita un texto y muestra por separado cuántas vocales, consonantes, cifras numéricas y
 * espacios contiene
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contVocales, contConsonantes, contCifras, contEspacios;
        String cifras, consonantes, vocales, texto;

        cifras = "1234567890";
        consonantes = "bcdfghjklmnñpqrstvwxyz";
        vocales = "aeiouáéíóóàèìòùü";

        contCifras = 0;
        contConsonantes = 0;
        contVocales = 0;
        contEspacios = 0;

        System.out.println("Introduce una palabra o un texto: ");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            if (cifras.indexOf(texto.charAt(i)) != -1) {
                contCifras++;
            } else if (vocales.indexOf(texto.toLowerCase().charAt(i)) != -1) {
                contVocales++;
            } else if (consonantes.indexOf(texto.toLowerCase().charAt(i)) != -1) {
                contConsonantes++;
            } else if (texto.charAt(i) == ' ') {
                contEspacios++;
            }
        } // for

        System.out.printf("El texto tiene %d vocales.%n", contVocales);

        System.out.printf("El texto tiene %d consonantes.%n", contConsonantes);

        System.out.printf("El texto tiene %d cifras.%n", contCifras);

        System.out.printf("El texto tiene %d espacios.%n", contEspacios);

    } // main

} // class
