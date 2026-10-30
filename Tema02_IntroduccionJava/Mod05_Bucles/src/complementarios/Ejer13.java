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
 * EJERCICIO: [13]
 *
 * ENUNCIADO:
 * Generar 5 números aleatorios entre 0 y 10, que serán almacenados en 5
 * variables llamadas, “nota1”, “nota2” …, utilizar el método Math.random.
 * - Calcular el promedio de las 5 notas.
 * - Mostrar el resultado del promedio en pantalla.
 *
 * AUTOR: Sergio Alcántara Escudero
 * =========================================
 */
public class Ejer13 {

    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, nota5;
        double media;

        nota1 = (int) (Math.random() * 11);
        nota2 = (int) (Math.random() * 11);
        nota3 = (int) (Math.random() * 11);
        nota4 = (int) (Math.random() * 11);
        nota5 = (int) (Math.random() * 11);

        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;

        System.out.println("-- NOTAS A EVALUAR --");
        System.out.println(String.format(
                "Nota 1: %d\nNota 2: %d\nNota 3: %d\nNota 4: %d\nNota 5: %d",
                nota1, nota2, nota3, nota4, nota5));
        System.out.printf("NOTA MEDIA: %.2f%n", media);
    } // main

} // class
