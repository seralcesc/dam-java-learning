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
 * EJERCICIO: [35]
 * FECHA: 21/11/2026
 *
 * ------------------------------------------------
 * ENUNCIADO
 * ------------------------------------------------
 *
 * Diseña un programa para una tienda que comercializa tres tipos de
 * productos con precios unitarios fijos (Producto 1 = 10€, Producto 2 = 5€ y Producto
 * 3 = 25€). El programa debe solicitar al usuario la cantidad de artículos que desea
 * comprar de cada una de las tres clases.
 * Dependiendo del volumen de cada producto, se aplicarán las siguientes reglas de
 * descuento independientes:
 * ● Producto 1: Si se piden más de 100 unidades, tiene un 5% de descuento.
 * ● Producto 2: Si se piden más de 1.000 unidades, tiene un 10% de descuento.
 * ● Producto 3: Si se piden más de 25 unidades, tiene un 2% de descuento.
 *
 * El programa debe calcular el subtotal, el descuento aplicado (si procede) para cada
 * producto, y finalmente mostrar un desglose completo junto con el precio total de la
 * compra.
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */
public class Ejer35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // declaración de variables
        int opcion1, opcion2, producto1, producto2, producto3, cantidad;
        double precio1, precio2, precio3, descuento1, descuento2, descuento3, precioTotal, descuentoTotal;
        final int P1, P2, P3, D1, D2, D3, L_D1, L_D2, L_D3;
        boolean compraRealizada;

        // precio de cada producto
        P1 = 10;
        P2 = 5;
        P3 = 25;
        // descuentos aplicados por producto
        D1 = 5;
        D2 = 10;
        D3 = 2;
        // limites descuentos
        L_D1 = 100;
        L_D2 = 1000;
        L_D3 = 25;

        // inicialización de variables (acumuladores)
        // cantidad de productos a comprar
        producto1 = 0;
        producto2 = 0;
        producto3 = 0;
        // precio total de cada producto
        precio1 = 0;
        precio2 = 0;
        precio3 = 0;
        // descuentos a aplicar
        descuento1 = 0;
        descuento2 = 0;
        descuento3 = 0;
        // condicion de salida del programa
        compraRealizada = false;

        // presentación del menú principal
        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("¿Qué desea hacer?\n "
                    + "\t1. Ver ofertas disponibles\n "
                    + "\t2. Comprar\n "
                    + "\t3. Ver cesta de la compra\n "
                    + "\t4. Pagar\n "
                    + "\t0. Salir");
            System.out.print("Opción: ");
            opcion1 = sc.nextInt();
            switch (opcion1) {
                // info descuentos
                case 1:
                    System.out.println("\t=== Descuentos disponibles ===\n"
                            + "\t* Producto 1: Por compras superiores a 100 unidades: 5% de descuento.\n"
                            + "\t* Producto 2: Por compras superiores a 1.000 unidades: 10% de descuento.\n"
                            + "\t* Producto 3: Por compras superiores a 25 unidades: 2% de descuento.");
                    System.out.println();
                    break;
                // menú de compra
                case 2:
                    do {
                        System.out.println("\t=== ¿Qué producto desea comprar? ===\n"
                                + " \t1. Producto 1\n"
                                + "\t2. Producto 2\n"
                                + "\t3. Producto 3\n"
                                + "\t0. Volver al menú principal");
                        System.out.print("Opción: ");
                        opcion2 = sc.nextInt();

                        // cantidad de prouctos a añadir según opción
                        switch (opcion2) {
                            case 1:
                                System.out.println("¿Cúantos productos desea añadir?");
                                System.out.print("Cantidad: ");
                                cantidad = sc.nextInt();
                                // permite eliminar productos comprados, poniendo a cero el contador si se vuelve negativo
                                if (cantidad < 0) {
                                    producto1 -= Math.abs(cantidad);
                                    System.out.println(String.format(
                                            ">>> Productos eliminados de la cesta: %d", cantidad));
                                    if (producto1 < 0) {
                                        producto1 = 0;
                                        System.out.println(
                                                ">>> Producto en su cesta de la compra: 0");
                                    }
                                    // mensaje de confirmación de productos añadidos
                                } else {
                                    producto1 += cantidad;
                                    System.out.println(String.format(">>> Productos añadidos: %d",
                                            cantidad));
                                }
                                break;
                            case 2:
                                System.out.println("¿Cúantos productos desea añadir?");
                                System.out.print("Cantidad: ");
                                cantidad = sc.nextInt();
                                // permite eliminar productos comprados, poniendo a cero el contador si se vuelve negativo
                                if (cantidad < 0) {
                                    producto2 -= Math.abs(cantidad);
                                    System.out.println(String.format(
                                            ">>> Productos eliminados de la cesta: %d", cantidad));
                                    if (producto2 < 0) {
                                        producto2 = 0;
                                        System.out.println(
                                                ">>> Producto en su cesta de la compra: 0");
                                    }
                                    // mensaje de confirmación de productos añadidos
                                } else {
                                    producto2 += cantidad;
                                    System.out.println(String.format(">>> Productos añadidos: %d",
                                            cantidad));
                                }
                                break;
                            case 3:
                                System.out.println("¿Cúantos productos desea añadir?");
                                System.out.print("Cantidad: ");
                                cantidad = sc.nextInt();
                                // permite eliminar productos comprados, poniendo a cero el contador si se vuelve negativo
                                if (cantidad < 0) {
                                    producto3 -= Math.abs(cantidad);
                                    System.out.println(String.format(
                                            ">>> Productos eliminados de la cesta: %d", cantidad));
                                    if (producto3 < 0) {
                                        producto3 = 0;
                                        System.out.println(
                                                ">>> Producto en su cesta de la compra: 0");
                                    }
                                    // mensaje de confirmación de productos añadidos
                                } else {
                                    producto3 += cantidad;
                                    System.out.println(String.format(">>> Productos añadidos: %d",
                                            cantidad));
                                }
                                break;
                            case 0:
                                System.out.println(">>> Vuelta al menú principal");
                                break;
                            default:
                                System.out.println(">>> Opción incorrecta.");
                        }

                        System.out.println();
                    } while (opcion2 != 0); // fin del menú de compra

                    System.out.println();
                    break;
                // ver cesta de la compra
                case 3:
                    System.out.println("\t=== Cesta de la compra ===");
                    if (producto1 == 0 && producto2 == 0 && producto3 == 0) {
                        System.out.println(">>> Cesta de la compra vacía");
                    } else {
                        if (producto1 > 0) {
                            System.out.println("Producto 1: " + producto1);
                        }
                        if (producto2 > 0) {
                            System.out.println("Producto 2: " + producto2);
                        }
                        if (producto3 > 0) {
                            System.out.println("Producto 3: " + producto3);
                        }
                    }
                    System.out.println();
                    break;
                // cálculo y presentación de datos
                case 4:
                    System.out.println(">>> Comprando...");
                    // reseteo de variables
                    precio1 = 0;
                    precio2 = 0;
                    precio3 = 0;

                    descuento1 = 0;
                    descuento2 = 0;
                    descuento3 = 0;


                    System.out.println("\t=== Comprado ===");
                    // si los tres productos están a 0 de cantidad, dice que no hay nada que comprar
                    if (producto1 < 1 && producto2 < 1 && producto3 < 1) {
                        System.out.println(">>> No hay productos en su cesta de la compra");
                    } else {
                        System.out.println("SUBTOTAL\n"
                                + "----------");

                        // subtotal producto1
                        if (producto1 > 0) {
                            System.out.println(String.format(
                                    "Producto1: Cantidad: %d | Precio/Ud.: %d €",
                                    producto1, P1));
                            precio1 = producto1 * P1;
                            System.out.println(String.format("\tCoste Producto1: %.2f €", precio1));
                            // cálculo del descuento
                            if (producto1 <= L_D1) {
                                descuento1 = 0;
                            } else {
                                descuento1 = precio1 * D1 / 100;
                                System.out.println(String.format("\tDescuento aplicado: %d %%", D1));
                            }
                            System.out.println(String.format("\tDescuento Producto1: %.2f €",
                                    descuento1));
                            System.out.println(String.format("\tTotal Producto1: %.2f €",
                                    precio1 - descuento1));
                            System.out.println();
                        }
                        // subtotal producto2
                        if (producto2 > 0) {
                            System.out.println(String.format(
                                    "Producto2: Cantidad: %d | Precio/Ud.: %d €",
                                    producto2, P2));
                            precio2 = producto2 * P2;
                            System.out.println(String.format("\tCoste Producto2: %.2f €", precio2));
                            // cálculo del descuento
                            if (producto2 <= L_D2) {
                                descuento2 = 0;
                            } else {
                                descuento2 = precio2 * D2 / 100;
                                System.out.println(String.format("\tDescuento aplicado: %d %%", D2));
                            }
                            System.out.println(String.format("\tDescuento Producto2: %.2f €",
                                    descuento2));
                            System.out.println(String.format("\tTotal Producto2: %.2f €",
                                    precio2 - descuento2));
                            System.out.println();
                        }
                        // subtotal producto3
                        if (producto3 > 0) {
                            System.out.println(String.format(
                                    "Producto3: Cantidad: %d | Precio/Ud.: %d €",
                                    producto3, P3));
                            precio3 = producto3 * P3;
                            System.out.println(String.format("\tCoste Producto3: %.2f €", precio3));
                            // cálculo del descuento
                            if (producto3 <= L_D3) {
                                descuento3 = 0;
                            } else {
                                descuento3 = precio3 * D3 / 100;
                                System.out.println(String.format("\tDescuento aplicado: %d %%", D3));
                            }
                            System.out.println(String.format("\tDescuento Producto3: %.2f €",
                                    descuento3));
                            System.out.println(String.format("\tTotal Producto3: %.2f €",
                                    precio3 - descuento3));
                            System.out.println();

                        }
                        // calculo y presentación datos de los totales
                        System.out.println("TOTAL\n"
                                + "----------");
                        precioTotal = precio1 + precio2 + precio3;
                        descuentoTotal = descuento1 + descuento2 + descuento3;
                        System.out.println(String.format("Precio total (sin descuento): %.2f €",
                                precioTotal));
                        System.out.println(
                                String.format("Total a descontar: %.2f €", descuentoTotal));
                        System.out.println(String.format("Total a pagar: %.2f €: ",
                                precioTotal - descuentoTotal));
                        // activador de salida del programa
                        compraRealizada = true;
                    }

                    System.out.println();
                    break;
                case 0:
                    System.out.println(">>> ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion1 != 0 && !compraRealizada); // fin del menú principal
        System.out.println();
        System.out.println("Fin del programa");
    } // main

} // class
