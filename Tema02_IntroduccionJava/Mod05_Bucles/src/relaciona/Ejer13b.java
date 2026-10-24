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
 * EJERCICIO: [13]
 *
 * ENUNCIADO:
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
 * adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
 * usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer13b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aleatorio, opcion, max, min;
        boolean acierto;

        min = 1;
        max = 100;
        acierto = false;

        System.out.println(
                "Piensa un número del 1 al 100. Voy a intentar adivinarlo.\nPulsa \"Empezar\" cuando estés listo: \n1.EMPEZAR | 2.SALIR");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                do {
                    if (min == max) {
                        System.out.println(String.format("No queda otra, es el %d", min));
                        break;
                    } else if (min > max) {
                        System.out.println("Me has mentido en tus respuestas.\nFIN DEL PROGRAMA");
                        break;
                    } else {
                        aleatorio = (int) (Math.random() * (max - min + 1)) + min;
                        System.out.println(String.format("El número que has pensado es el... %d?",
                                aleatorio));
                        System.out.println("1. Mayor | 2.Menor | 3.Igual | 0.Salir");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                min = aleatorio + 1;
                                break;
                            case 2:
                                max = aleatorio - 1;
                                break;
                            case 3:
                                acierto = true;
                                System.out.println(
                                        String.format("¡Bien! ¡He acertado! El número era el %d",
                                                aleatorio));
                                break;
                            case 0:
                                System.out.println("Fin del programa");
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                } while (acierto == false && opcion != 0);
                break;
            case 2:
                System.out.println("FIN DEL PROGRAMA");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    } // main

} // class
