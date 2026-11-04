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
 * EJERCICIO: [18]
 *
 * ENUNCIADO:
 * Solicita una palabra y una letra. Muestra las posiciones de la primera y la
 * última aparición de esa letra. Si no aparece, informa al usuario.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto, letra, letraMinuscula, textoMinuscula;
        int primera, ultima;

        System.out.println("Introduce una palabra: ");
        texto = sc.nextLine().trim();
        System.out.println("Y ahora la letra a buscar: ");
        letra = sc.next();

        if (texto.isEmpty() || texto.contains(" ")) {
            System.out.println("Error, introduce una palabra");
        } else if (letra.length() != 1) {
            System.out.println("Error, introduce exactamente una letra.");
        } else {
            textoMinuscula = texto.toLowerCase().trim()
                    .replace('á', 'a')
                    .replace('é', 'e')
                    .replace('í', 'i')
                    .replace('ó', 'o')
                    .replace('ú', 'u')
                    .replace('ü', 'u');

            letraMinuscula = letra.toLowerCase().trim()
                    .replace('á', 'a')
                    .replace('é', 'e')
                    .replace('í', 'i')
                    .replace('ó', 'o')
                    .replace('ú', 'u')
                    .replace('ü', 'u');

            primera = textoMinuscula.indexOf(letraMinuscula);
            ultima = textoMinuscula.lastIndexOf(letraMinuscula);

            if (primera == -1) {
                System.out.println(
                        String.format("La palabra introducida no contiene la letra %s", letra));
            } else {
                System.out.println(String.format("· Primera posicion: %d\n· Última posición: %d\n",
                        primera + 1, ultima + 1));
            }
        }



    } // main

} // class
