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
 * EJERCICIO: [08]
 *
 * ENUNCIADO:
 * Crear 2 variables enteras, una llamada “Base” y la otra “Exponente”,
 * asignar valores a su criterio.
 * - Calcular la potencia utilizando el método Math.pow.
 * - Mostrar el resultado de la operación.
 *
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, expo;
        double potencia;

        System.out.println("Introduce el valor de la base: ");
        base = sc.nextInt();
        System.out.println("Introduce el valor del exponente: ");
        expo = sc.nextInt();

        if (base == 0 && expo <= 0) {
            System.out.println("Error.");
        } else if (base == 0 && expo == 0) {
            System.out.println("Resultado = 0.");
        } else if (expo == 0) {
            System.out.println("Resultado = 1.");
        } else {
            potencia = Math.pow(base, expo);
            System.out.println("Resultado = " + potencia);

        }

    } // main

} // class
