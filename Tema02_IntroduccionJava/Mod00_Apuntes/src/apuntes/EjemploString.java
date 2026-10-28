/**
 * RECORDATORIO - CLASE STRING Y TRATAMIENTO DE CARACTERES
 * Ejemplos independientes para consultar durante los ejercicios.
 *
 * IMPORTANTE: String utiliza comillas dobles y char comillas simples.
 * Los índices empiezan en 0, no en 1.
 */
public class EjemploString {

    public static void main(String[] args) {
        String palabra = "Programación";
        String texto = "  Hola Java  ";
        String otraPalabra = "JAVA";
        char letra;

        //1. LONGITUD DE UNA CADENA - length()
        System.out.println("\n1. LONGITUD DE UNA CADENA");
        System.out.println("Palabra: " + palabra);
        System.out.println("Número de caracteres: " + palabra.length());
        // length() cuenta los caracteres, incluidos espacios y signos.
        // Una palabra de longitud 4 tiene índices 0, 1, 2 y 3.

        //2. ACCEDER A UN CARÁCTER - charAt(indice)
        System.out.println("\n2. ACCEDER A CARACTERES");
        letra = palabra.charAt(0);
        System.out.println("Primer carácter: " + letra);
        System.out.println("Último carácter: " + palabra.charAt(palabra.length() - 1));
        // charAt() devuelve un char. El índice empieza en cero.
        // Si el índice no existe, se produce StringIndexOutOfBoundsException.

        //3. RECORRER UNA CADENA CON FOR (de izquierda a derecha)
        System.out.println("\n3. RECORRER UNA CADENA");
        for (int i = 0; i < otraPalabra.length(); i++) {
            System.out.printf("Posición %d: %c%n", i, otraPalabra.charAt(i));
        }
        // Para recorrer al revés, razona qué índice es el último
        // y cómo tendría que cambiar el contador en cada vuelta.

        //4. MAYÚSCULAS Y MINÚSCULAS
        System.out.println("\n4. MAYÚSCULAS Y MINÚSCULAS");
        System.out.println("Original: " + otraPalabra);
        System.out.println("Minúsculas: " + otraPalabra.toLowerCase());
        System.out.println("Mayúsculas: " + palabra.toUpperCase());
        // String es inmutable: estos métodos devuelven otro String.
        // Si quieres guardar el resultado: otraPalabra = otraPalabra.toLowerCase();

        //5. COMPARACIÓN DE CADENAS - equals() / equalsIgnoreCase()
        System.out.println("\n5. COMPARAR CADENAS");
        String a = "Java";
        String b = "java";
        System.out.println("equals(): " + a.equals(b));                  // false
        System.out.println("equalsIgnoreCase(): " + a.equalsIgnoreCase(b)); // true
        // Para comparar el CONTENIDO de String utiliza equals(), NO ==.
        // == compara referencias a objetos, no el texto de forma fiable.

        //6. EXTRAER UNA PARTE - substring()
        System.out.println("\n6. EXTRAER FRAGMENTOS");
        System.out.println("Original: " + palabra);
        System.out.println("substring(0, 4): " + palabra.substring(0, 4));
        System.out.println("substring(4): " + palabra.substring(4));
        // substring(inicio, fin): incluye inicio, excluye fin.
        // substring(inicio): desde inicio hasta el final.

        //7. SUSTITUIR CARACTERES O TEXTO - replace()
        System.out.println("\n7. SUSTITUIR TEXTO");
        System.out.println("casa -> " + "casa".replace('a', 'o'));
        System.out.println("Hola Java -> " + "Hola Java".replace("Java", "mundo"));
        // Con char usa comillas simples; con String, dobles.

        //8. ELIMINAR ESPACIOS AL PRINCIPIO Y AL FINAL - trim()
        System.out.println("\n8. ELIMINAR ESPACIOS EXTREMOS");
        System.out.println("Antes: [" + texto + "]");
        System.out.println("Después: [" + texto.trim() + "]");
        // trim() no elimina los espacios situados entre palabras.

        //9. BUSCAR CARACTERES O FRAGMENTOS
        System.out.println("\n9. BUSCAR EN UN TEXTO");
        System.out.println("¿Contiene 'Java'?: " + texto.contains("Java"));
        System.out.println("Índice de 'J': " + texto.indexOf('J'));
        System.out.println("Índice de 'z': " + texto.indexOf('z'));
        // contains() devuelve boolean; indexOf() devuelve -1 si no encuentra.

        //10. COMPROBAR SI UNA CADENA ESTÁ VACÍA
        System.out.println("\n10. CADENAS VACÍAS");
        String vacia = "";
        System.out.println("¿Está vacía?: " + vacia.isEmpty());
        System.out.println("¿Solo hay espacios?: " + "   ".isBlank());
        // isEmpty(): longitud 0. isBlank(): vacía o solo espacios en blanco.

        //11. CONSTRUIR TEXTO A PARTIR DE CARACTERES
        System.out.println("\n11. CONCATENAR CARACTERES");
        String resultado = "";
        resultado += 'H';
        resultado += 'o';
        resultado += 'l';
        resultado += 'a';
        System.out.println("Cadena construida: " + resultado);
        // += permite añadir caracteres a una cadena.
        // Para textos grandes con muchas concatenaciones existe StringBuilder.

        //12. DISTINCIÓN ENTRE CHAR Y STRING
        System.out.println("\n12. CHAR FRENTE A STRING");
        char vocal = 'a';
        String vocalTexto = "a";
        System.out.printf("char: %c | String: %s%n", vocal, vocalTexto);
        // char se compara con == : vocal == 'a'
        // String se compara con equals(): vocalTexto.equals("a")
        // 'a' y 'á' son caracteres diferentes (también 'a' y 'A').

        //13. RECORDATORIO PARA EJERCICIOS DE PALABRAS Y PÁRRAFOS
        // Invertir una palabra: piensa cómo recorrer índices de final a inicio.
        // Palíndromos: compara una cadena con otra o caracteres de los extremos.
        // Contar vocales: recorre con charAt(), comprueba cada letra y cuenta.
        // Si necesitas ignorar mayúsculas, puedes normalizar con toLowerCase().
        // ¡Estos ejercicios NO están resueltos aquí!
    }
}
