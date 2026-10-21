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
 * EJERCICIO: [18]
 *
 * ENUNCIADO:
 * Escribe un programa que calcula el salario neto semanal de un trabajador en función del
 * número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
 * • Las primeras 35 horas se pagan a tarifa normal.
 * • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
 * • Las tasas de impuestos son:
 * • Los primeros 500 euros son libres de impuestos.
 * • Los siguientes 400 tienen un 25% de impuestos.
 * • Los restantes un 45% de impuestos.
 * Escribir nombre, salario bruto, tasas y salario neto.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer18 {

    public static void main(String[] args) {
        double bruto, neto, extra, tarifa, tasaImpuestos;
        int horas, IMPUESTO_ALTO, IMPUESTO_BAJO, horasExtra;

        horasExtra = 0;
        extra = 0;
        bruto = 0;
        neto = 0;
        tasaImpuestos = 0;
        IMPUESTO_ALTO = 45;
        IMPUESTO_BAJO = 25;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el total de horas trabajadas esta semana: ");
        horas = sc.nextInt();
        System.out.println("Ahora introduce el precio de la hora trabajada: ");
        tarifa = sc.nextDouble();

        if (horas < 0 || tarifa < 0) { // if 1
            System.out.println("Valores introducidos erróneos.");
        } else {

            if (horas <= 35) {
                bruto = horas * tarifa;
            } else {
                horasExtra = horas - 35;
                extra = horasExtra * 1.5 * tarifa;
                bruto = (35 * tarifa) + extra;
            } // if

            if (bruto < 500) { // if 2
                neto = bruto;
            } else {
                if (bruto < 900) { // if 3
                    tasaImpuestos = ((bruto - 500) * IMPUESTO_BAJO / 100.0);
                    neto = bruto - tasaImpuestos;

                } else {
                    tasaImpuestos = ((900 - 500) * IMPUESTO_BAJO / 100.0) + ((bruto - 900) * IMPUESTO_ALTO / 100.0);
                    neto = bruto - tasaImpuestos;
                } // if 3
            } // if 2

            System.out.println("######### · DESGLOSE NÓMINA · #########");
            System.out.println(String.format(" · Horas trabajadas: %d ", horas));
            System.out.println(String.format(" · Precio de la hora: %.2f €", tarifa));
            System.out.println(String.format(" · Horas extras trabajadas: %d ", horasExtra));
            System.out.println(String.format(" · Salario bruto: %.2f €", bruto));
            System.out.println(String.format(" · Retención de impuestos: %.2f €", tasaImpuestos));
            System.out.println(String.format(" · SALARIO NETO: %.2f €", neto));
            System.out.println("#######################################");
        } // if1
    } // main
} // class
