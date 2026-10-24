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
 * EJERCICIO: [14]
 *
 * ENUNCIADO:
 * Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
 * (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
 * cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
 * billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será
 * necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo
 * 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible).
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, b500, b200, b100, b50, b20, b10, b5;

        System.out.println("Introduce una cantidad de dinero"
                + " (IMPORTANTE: Múltiplo de 5)");
        cantidad = sc.nextInt();

        if (cantidad % 5 != 0) { // if 1
            System.out.println("Cantidad introducida incorrecta"
                    + ". FIN DEL PROGRAMA.");
        } else {

                b500 = cantidad / 500;
                cantidad %= 500;
                if (b500 != 0) {
                    System.out.println("Billetes de 500€: " + b500);
                }

                b200 = cantidad / 200;
                cantidad %= 200;
                if (b200 != 0) {
                    System.out.println("Billetes de 200€: " + b200);
                }

                b100 = cantidad / 100;
                cantidad %= 100;
                if (b100 != 0) {
                    System.out.println("Billetes de 100€: " + b100);
                }

                b50 = cantidad / 50;
                cantidad %= 50;
                if (b50 != 0) {
                    System.out.println("Billetes de 50€: " + b50);
                }

                b20 = cantidad / 20;
                cantidad %= 20;
                if (b20 != 0) {
                    System.out.println("Billetes de 20€: " + b20);
                }

                b10 = cantidad / 10;
                cantidad %= 10;
                if (b10 != 0) {
                    System.out.println("Billetes de 10€: " + b10);
                }

                b5 = cantidad / 5;
                cantidad %= 5;
                if (b5 != 0) {
                    System.out.println("Billetes de 5€: " + b5);
                }


        } // if 1

    } // main

} // class
