/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejemploconversiondatos;
import java.util.Scanner;

/**
 *
 * @author Jesús Pérez
 */
public class EjemploConversionDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        int notaSeneca;
        double media;
        int c = 'a';
        char caracter = 110;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota 1:");
        nota1 = sc.nextInt();

        System.out.println("Introduce la nota 2:");
        nota2 = sc.nextInt();

        System.out.println("Introduce la nota 3:");
        nota3 = sc.nextInt();

        //1. CONVERSIÓN DE ENSANCHAMIENTO (conversión implícita)
        //Un int se puede convertir automáticamente a double.
        //Al dividir por 3.0 hacemos una división decimal.
        media = (nota1 + nota2 + nota3) / 3.0;

        //2. CONVERSIÓN DE ESTRECHAMIENTO (casting explícito)
        //Convertimos la media double a int: se truncan los decimales.
        //No es un redondeo, y puede perderse información.
        notaSeneca = (int) media;

        System.out.println("CONVERSIÓN DE ENSANCHAMIENTO:");
        System.out.println("media = " + media);
        System.out.println("");
        System.out.println("CONVERSIÓN DE ESTRECHAMIENTO:");
        System.out.println("notaSeneca = " + notaSeneca);
        System.out.println("");

        //Sumar 0.5 y truncar sirve para redondear números positivos habituales.
        //No es una solución general para los negativos: usa Math.round().
        System.out.println("REDONDEO DE LA MEDIA AL ENTERO MÁS PRÓXIMO:");
        notaSeneca = (int) (media + 0.5);
        System.out.println("notaSeneca = " + notaSeneca);
        System.out.println("Con Math.round(media) = " + Math.round(media));

        //3. CASO ESPECIAL: CARACTERES Y ENTEROS
        System.out.println("");
        System.out.println("------------------- CASO ESPECIAL -------------------");
        //Un char se puede asignar a int: obtenemos su valor Unicode.
        System.out.println("CONVERSIÓN DEL CARÁCTER a A UN ENTERO (VALOR UNICODE)");
        System.out.println("c = " + c);

        //Un entero constante válido puede asignarse a char (110 = 'n').
        //Con una variable int, normalmente usamos casting explícito.
        System.out.println("CONVERSIÓN DEL VALOR ENTERO 110 A SU CARÁCTER UNICODE");
        System.out.println("caracter = " + caracter);
        int codigo = 65;
        char letra = (char) codigo;
        System.out.println("(char) 65 = " + letra);

        //4. INT A DOUBLE Y DOUBLE A INT
        System.out.println("");
        System.out.println("------------------- INT Y DOUBLE -------------------");
        int entero = 15;
        double decimal = entero; // Ensanchamiento: no hace falta casting.
        System.out.println("int 15 a double = " + decimal);

        double precio = 19.89;
        int precioEntero = (int) precio; // Estrechamiento: trunca a 19.
        System.out.println("double 19.89 a int = " + precioEntero);
        System.out.println("double 19.89 redondeado = " + Math.round(precio));

        //5. INT, LONG, FLOAT Y DOUBLE
        System.out.println("");
        System.out.println("------------------- OTROS NUMÉRICOS -------------------");
        int edad = 43;
        long edadLong = edad; // int -> long: automático.
        int edadRecuperada = (int) edadLong; // long -> int: casting.
        System.out.println("int -> long = " + edadLong);
        System.out.println("long -> int = " + edadRecuperada);

        float medidaFloat = 3.5f; // La f identifica un literal float.
        double medidaDouble = medidaFloat; // float -> double: automático.
        float medidaRecuperada = (float) medidaDouble; // double -> float: casting.
        System.out.println("float -> double = " + medidaDouble);
        System.out.println("double -> float = " + medidaRecuperada);
        // ATENCIÓN: una conversión de ensanchamiento puede perder precisión
        // con valores grandes (por ejemplo, algunos long -> double).
        // Un casting de un tipo amplio a otro pequeño puede desbordarse.

        //6. STRING A INT
        System.out.println("");
        System.out.println("------------------- STRING A INT -------------------");
        String textoEntero = "125";
        int numeroEntero = Integer.parseInt(textoEntero);
        System.out.println("String '125' -> int = " + numeroEntero);
        // Si el texto no contiene un entero válido, lanza NumberFormatException.
        // Ejemplo NO válido: Integer.parseInt("12.5");

        //7. STRING A DOUBLE
        System.out.println("");
        System.out.println("------------------- STRING A DOUBLE -------------------");
        String textoDecimal = "12.75";
        double numeroDecimal = Double.parseDouble(textoDecimal);
        System.out.println("String '12.75' -> double = " + numeroDecimal);
        // Double.parseDouble() espera un punto decimal (.), no una coma.
        // Ejemplo NO válido: Double.parseDouble("12,75");

        //8. INT Y DOUBLE A STRING
        System.out.println("");
        System.out.println("------------------- NÚMEROS A STRING -------------------");
        String textoDesdeInt = String.valueOf(numeroEntero);
        String textoDesdeDouble = String.valueOf(numeroDecimal);
        System.out.println("int -> String = " + textoDesdeInt);
        System.out.println("double -> String = " + textoDesdeDouble);
        System.out.println("Longitud del texto del entero = " + textoDesdeInt.length());
        // Alternativas: Integer.toString(numeroEntero);
        //               Double.toString(numeroDecimal);

        //9. CHAR A STRING Y STRING A CHAR
        System.out.println("");
        System.out.println("------------------- CHAR Y STRING -------------------");
        char inicial = 'S';
        String textoInicial = String.valueOf(inicial);
        String palabra = "Java";
        char primeraLetra = palabra.charAt(0);
        System.out.println("char -> String = " + textoInicial);
        System.out.println("Primer carácter de 'Java' = " + primeraLetra);
        // charAt(0) devuelve el primer carácter. Una cadena puede contener
        // varios caracteres; no se convierte completa a un único char.
        // Si la cadena está vacía, charAt(0) produce una excepción.

         //10. BOOLEAN Y STRING
        System.out.println("");
        System.out.println("------------------- BOOLEAN Y STRING -------------------");
        boolean aprobado = true;
        String textoBooleano = String.valueOf(aprobado);
        boolean booleanoDesdeTexto = Boolean.parseBoolean("true");
        System.out.println("boolean -> String = " + textoBooleano);
        System.out.println("String 'true' -> boolean = " + booleanoDesdeTexto);
        // Boolean.parseBoolean() devuelve true solo si el texto es "true"
        // (sin importar mayúsculas/minúsculas); otros textos dan false.
        // En Java no se convierte boolean a int mediante (int).

        //11. DIVISIÓN ENTERA FRENTE A DIVISIÓN DECIMAL
        System.out.println("");
        System.out.println("------------------- DIVISIONES -------------------");
        int dividendo = 5;
        int divisor = 2;
        double divisionEntera = dividendo / divisor; // 2, no 2.5.
        double divisionDecimal = (double) dividendo / divisor; // 2.5.
        System.out.println("5 / 2 guardado en double = " + divisionEntera);
        System.out.println("(double) 5 / 2 = " + divisionDecimal);
        // El casting debe aplicarse ANTES de dividir.

        //12. FORMATEAR NO ES CONVERTIR EL VALOR ORIGINAL
        System.out.println("");
        System.out.println("------------------- STRING.FORMAT -------------------");
        double importe = 15.789;
        String importeTexto = String.format("%.2f", importe);
        System.out.println("Importe como texto formateado = " + importeTexto);
        System.out.println("Importe original (double) = " + importe);
        // String.format() devuelve String, no double.
        // El separador decimal depende de la configuración regional.

        //13. CASOS ESPECIALES CON MATH.ABS Y TIPOS
        System.out.println("");
        System.out.println("------------------- VALOR ABSOLUTO -------------------");
        int negativo = -345;
        System.out.println("Math.abs(-345) = " + Math.abs(negativo));
        // Integer.MIN_VALUE no tiene valor absoluto positivo representable
        // en int. Convertir primero a long evita ese problema:
        long valorAbsolutoSeguro = Math.abs((long) Integer.MIN_VALUE);
        System.out.println("Math.abs((long) Integer.MIN_VALUE) = " + valorAbsolutoSeguro);
    }

}
