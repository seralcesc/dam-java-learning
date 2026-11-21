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
 * PROGRAMACIÓN / JAVA
 * ================================================
 *
 * MÓDULO:    [5]
 * RELACIÓN:  [FERNANDO]
 * EJERCICIO: [34]
 * FECHA:     20/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Solicitar dos números enteros y calcular el mínimo común múltiplo.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer34 {

    public static void main(String[] args) {

        int mcd, mcm, menor, num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos números positivos:");
        System.out.println("Numero 1:");
        num1 = sc.nextInt();
        System.out.println("Numero 2");
        num2 = sc.nextInt();

        menor = Math.min(num1, num2);
        mcd = 1;

        if (num1 < 1 || num2 < 1) {
            System.out.println("Los dos números deben ser positivos.");
        } else {
            for (int i = 1; i <= menor; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    mcd = i;
                }
            }
            mcm = (num1 / mcd) * num2;
            System.out.println("MCM = " + mcm);
        }
    } // main
} // class
