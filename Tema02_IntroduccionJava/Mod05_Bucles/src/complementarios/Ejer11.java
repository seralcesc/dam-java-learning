package complementarios;

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
 * EJERCICIO: [11]
 *
 * ENUNCIADO:
 * Desarrollar un programa que permita contar cuantas vocales existentes
 * en el siguiente parrafo.
 * “Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas
 * risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat.
 * Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie
 * euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea
 * non proin aliquet scelerisque nam maecenas elit cum.”
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer11 {

    public static void main(String[] args) {

        String texto, vocales;
        int contador;

        contador = 0;

        texto = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus"
                + " risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat."
                + "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit "
                + "molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent "
                + "est. Platea non proin aliquet scelerisque nam maecenas elit cum.";

        vocales = "aeiouáéíóú";

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contador += 1;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);

    } // main

} // class
