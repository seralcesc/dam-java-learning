package fernando;

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
 * RELACIÓN: [FERNANDO]
 * EJERCICIO: [06]
 *
 * ENUNCIADO:
 * La calculadora de un círculo. En un menú un usuario debe decidir si quiere
 * calcular el perímetro o el área de una circunferencia. Después le pediremos el radio de la
 * circunferencia y le daremos el resultado con 4 decimales.
 * Debemos tener en cuenta que se puede confundir el usuario a la hora de introducir los
 * datos Si el radio es negativo mostrar que es imposible la opción, igual si teclea un número
 * distinto al de menú.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio, area, longitud;

        System.out.println("Introduce el valor del radio: ");
        radio = sc.nextDouble();

        if (radio <= 0) {
            System.out.println("El radio debe ser mayor de 0.");

        } else {
            area = Math.PI * Math.pow(radio, 2);
            longitud = 2 * Math.PI * radio;

            do {
                System.out.println("### MENÚ ###\n"
                        + "Elige una acción a realizar: ");
                System.out.println("· 1. Calcular el área del círculo.\n"
                        + "· 2. Calcular la longitud de la circunferencia.\n"
                        + "· 3. Calcular área y longitud de la circunferencia.\n"
                        + "· 0. Salir");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println(String.format("Área = %.4f", area));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println(String.format("Longitud = %.4f", longitud));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println(String.format("Área = %.4f", area));
                        System.out.println(String.format("Longitud = %.4f", longitud));
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("¡Que tenga un buen día!");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        System.out.println();
                }
            } while (opcion != 0);
            System.out.println("Fin del programa");
        }

    } // main

} // class
