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
 * EJERCICIO: [07]
 *
 * ENUNCIADO:
 * Desarrollar un programa que realice la sumatoria de todas las
 * iteraciones de un ciclo desde 0 hasta un número entero definido
 * previamente, al resultado de la suma realizar las siguientes
 * operaciones.
 * - Raíz cuadrada.
 * - Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
 * - Determinar los divisores.
 * - Hallar la factorial.
 * - Definir si es un número perfecto.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma, numero, aleatorio, perfecto;
        long factorial;
        double rc;

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        suma = 0;
        factorial = 1;
        perfecto = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        for (int i = 1; i <= suma; i++) {
            factorial *= i;
        }

        rc = Math.sqrt(suma);
        aleatorio = (int) (Math.random() * suma) + 1;

        System.out.println("NUMERO INTRODUCIDO = " + numero);
        System.out.println(String.format("SUMATORIA hasta %d = %d", numero, suma));
        System.out.println("RAÍZ CUADRADA = " + rc);
        System.out.println(String.format("NÚMERO ALEATORIO hasta %d = %d ", suma, aleatorio));
        System.out.println("FACTORIAL = " + factorial);
        System.out.print(String.format("Divisores de %d = ", suma));

        for (int i = 1; i <= suma; i++) {
            if (suma % i == 0) {
                System.out.print(i + " ");
                if (i != suma) {
                    perfecto += i;
                }
            }
        }
        System.out.println();
        if (suma == perfecto & suma > 0) {
            System.out.println(String.format("%d, es un número PERFECTO.", suma));
        } else {
            System.out.println(String.format("%d, NO es un número PERFECTO.", suma));
        }

    } // main

} // class
