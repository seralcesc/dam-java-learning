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
 * MÓDULO: [5]
 * RELACIÓN: [FERNANDO]
 * EJERCICIO: [36]
 * FECHA: 21/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * La Villa de Rota es conocida como la capital de la pizza. Diseña un
 * programa para una pizzería local que gestione los pedidos desde el móvil del
 * cliente:
 * Elegir el tamaño de la pizza ( el precio incluye el tomate y el queso):
 * Individual : 7.50 € ; Mediana: 11.00 €; Familiar: 15.00 €.
 * Añadir ingredientes extra típicos:
 * ○ Extra de queso fundido: 1.50 €
 * ○ Bacon: 2.00 €
 * ○ Champiñones frescos: 1.20 €
 * ○ Jamón York: 1.50 €
 * ○ Cebolla caramelizada: 1.00 €
 * Mostrar un ticket detallado con el importe total a pagar en euros.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion, respuesta;
        double masa, importe, extras, extra1, extra2, extra3, extra4, extra5;
        final double INDIVIDUAL = 7.50;
        final double MEDIANA = 11.00;
        final double FAMILIAR = 15.00;
        final double EXTRA_QUESO = 1.50;
        final double BACON = 2.00;
        final double CHAMPINONES = 1.20;
        final double YORK = 1.50;
        final double CEBOLLA_CARAMEL = 1.00;

        masa = 0;
        extras = 0;

        System.out.println("=== BIENVENIDO A PIZZERIA RISTORANTE \"ER LUIGI\" ===");
        System.out.println(">>> Haga su pedido:");
        do {
            System.out.println(
                    ">>> Escoja el tamaño de la pizza "
                    + "(1.Individual | 2. Mediana | 3. Familiar | 0. Salir): ");
            System.out.print(">>> Tamaño: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    masa = INDIVIDUAL;
                    break;
                case 2:
                    masa = MEDIANA;
                    break;
                case 3:
                    masa = FAMILIAR;
                    break;
                case 0:
                    System.out.println(">>> ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println(">>> Opción no válida.");
            }
        } while (opcion < 0 || opcion > 3);

        if (masa > 0) {
            do {
                System.out.println(
                        ">>> El precio incluye tomate y queso, "
                        + "¿desea añadir algún ingrediente más? (1. No / 2. Si)");
                respuesta = sc.nextInt();
                if (respuesta < 1 || respuesta > 2) {
                    System.out.println(">>> Respuesta incorrecta");
                }
            } while (respuesta != 1 && respuesta != 2);

            if (respuesta == 1) {
                importe = masa;
                System.out.println(String.format("Importe total:  %.2f", importe));
                System.out.println("");
            } else {
                System.out.println("¡Bien! ¡¡¡Añadamos los extras!!!");
                do {
                    System.out.println("¿Queso? (1. No / 2. Si)");
                    respuesta = sc.nextInt();
                    if (respuesta < 1 || respuesta > 2) {
                        System.out.println(">>> Respuesta incorrecta");
                    }
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    extra1 = 0;
                } else {
                    extra1 = EXTRA_QUESO;
                }

                do {
                    System.out.println("¿Bacon? (1. No / 2. Si)");
                    respuesta = sc.nextInt();
                    if (respuesta < 1 || respuesta > 2) {
                        System.out.println(">>> Respuesta incorrecta");
                    }
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    extra2 = 0;
                } else {
                    extra2 = BACON;
                }

                do {
                    System.out.println("¿Champiñones? (1. No / 2. Si)");
                    respuesta = sc.nextInt();
                    if (respuesta < 1 || respuesta > 2) {
                        System.out.println(">>> Respuesta incorrecta");
                    }
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    extra3 = 0;
                } else {
                    extra3 = CHAMPINONES;
                }

                do {
                    System.out.println("¿Jamon York? (1. No / 2. Si)");
                    respuesta = sc.nextInt();
                    if (respuesta < 1 || respuesta > 2) {
                        System.out.println(">>> Respuesta incorrecta");
                    }
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    extra4 = 0;
                } else {
                    extra4 = YORK;
                }

                do {
                    System.out.println("¿Cebolla caramelizada? (1. No / 2. Si)");
                    respuesta = sc.nextInt();
                    if (respuesta < 1 || respuesta > 2) {
                        System.out.println(">>> Respuesta incorrecta");
                    }
                } while (respuesta != 1 && respuesta != 2);

                if (respuesta == 1) {
                    extra5 = 0;
                } else {
                    extra5 = CEBOLLA_CARAMEL;
                }
                extras = extra1 + extra2 + extra3 + extra4 + extra5;
                importe = masa + extras;
                if (extra1 > 0) {
                    System.out.printf("Extra de queso: %.2f €%n", extra1);
                }

                if (extra2 > 0) {
                    System.out.printf("Bacon: %.2f €%n", extra2);
                }

                if (extra3 > 0) {
                    System.out.printf("Champiñones: %.2f €%n", extra3);
                }

                if (extra4 > 0) {
                    System.out.printf("Jamón York: %.2f €%n", extra4);
                }

                if (extra5 > 0) {
                    System.out.printf("Cebolla caramelizada: %.2f €%n", extra5);
                }
                System.out.println(String.format("Importe extras: %.2f €", extras));
                System.out.println(String.format("Importe tamaño: %.2f €", masa));
                System.out.println(String.format("Importe total: %.2f €", importe));
            }
        }

    } // main

} // class
