package fernando2;

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
 * RELACIÓN: [FERNANDO2]
 * EJERCICIO: [05]
 * FECHA: 25/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Escribe un programa en Java que solicite al usuario un número entero positivo
 * que represente la altura (número de filas) de una pirámide. A continuación,
 * utilizando bucles anidados, el programa debe dibujar la figura geométrica por
 * consola. (ejemplo de 5 filas)
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer05 {

    public static void main(String[] args) {

        int altura = 5;

        for (int i = 1; i <= altura; i++) {

            // Espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            // Símbolos de la fila
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        } // triangulo 1

        System.out.println();

        for (int i = 1; i <= altura; i++) {

            // Espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }
            // Bordes y espacios interiores
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } // triangulo 2

        System.out.println();

        for (int i = altura; i >= 1; i--) {

            // Espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            // Símbolos de la fila
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        } // triangulo 3

        System.out.println();

        for (int i = altura; i >= 1; i--) {

            // Espacios iniciales
            for (int j = 1; j <= altura - i; j++) {
                System.out.print("  ");
            }

            // Bordes y espacios interiores
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == altura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        } // triangulo 4

    } // main

} // class
