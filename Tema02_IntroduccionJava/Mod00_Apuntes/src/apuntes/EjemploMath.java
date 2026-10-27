/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomath;

/**
 *
 * @author usuario
 */
public class EjemploMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables de tipo integer
        int aleatorio, min, max;


        // Variables tipo double
        double pi, e;
        double a, b;


        //Números PI y E
        pi = Math.PI;
        e = Math.E;
        System.out.println("pi = " + pi);
        System.out.println("e = " + e);


        //Inicializo a y b
        a = 16.5;
        b = 4.2234;


        //Potencia y Raíz cuadrada
        System.out.println("");
        System.out.println("a elevado a b = " + Math.pow(a, b));
        System.out.println("Raíz cuadrada de a = " + Math.sqrt(a));


        //Máximo y mínimo
        System.out.println("");
        System.out.println("El máximo de a y b = " + Math.max(a, b));
        System.out.println("El mínimo de a y b = " + Math.min(a, b));


        //Valor absoluto
        System.out.println("");
        System.out.println("VALOR ABSOLUTO - Math.abs()");

        int numeroPositivo = 5;
        int numeroNegativo = -8;

        System.out.println("Valor absoluto de " + numeroPositivo
                + " = " + Math.abs(numeroPositivo));
        System.out.println("Valor absoluto de " + numeroNegativo
                + " = " + Math.abs(numeroNegativo));

        // Math.abs() devuelve el valor absoluto de un número.
        // El resultado siempre es positivo o cero.
        // Math.abs(5)  = 5
        // Math.abs(-8) = 8
        // Math.abs(0)  = 0
        // Admite int, long, float y double.
        // Devuelve un resultado del mismo tipo que recibe.
        // IMPORTANTE:
        // Math.abs() NO cambia el signo automáticamente.
        // Si el número es positivo, permanece positivo.
        // Para invertir el signo se utiliza el operador (-).
        // Ejemplo: -numeroPositivo devuelve -5.
        // CASO ESPECIAL:
        // Math.abs(Integer.MIN_VALUE) no devuelve un positivo,
        // porque su valor absoluto no cabe dentro de un int.
        // Solución: convertir a long antes de utilizar Math.abs().
        long absoluto = Math.abs((long) Integer.MIN_VALUE);
        System.out.println("Valor absoluto de Integer.MIN_VALUE = "
                + absoluto);


        //Números aleatorios
        System.out.println("");
        System.out.println("Este número es un número "
                + "aleatorio entre 0 y 1 = " + Math.random());
        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("Este número es un número "
                + "aleatorio entre 1 y 100 = " + aleatorio);
        System.out.println("Para establecer rangos, creamos las variables min y max"
                + "y llevamos a cabo la siguiente expresión:");
        System.out.println("(int) (Math.random() * (max - min + 1)) + min;");

        //        Elemento                      Función
        //      Math.random()           Genera un decimal entre 0 y 1 (sin incluir 1)
        //      max - min + 1           Calcula la cantidad de enteros posibles
        //      (int)                   Descarta la parte decimal
        //      + min                   Desplaza el intervalo hasta el mínimo deseado


        //Redondeo hacia arriba y hacia abajo
        System.out.println("");
        System.out.println("REDONDEOS - Math.ceil(), Math.floor() y Math.round()");

        double positivo = 4.2;
        double negativo = -4.2;

        // Math.ceil(): redondea hacia arriba.
        // Devuelve el entero matemático superior o igual más cercano.
        // El resultado es de tipo double.
        System.out.println("Math.ceil(4.2) = " + Math.ceil(positivo));  // 5.0
        System.out.println("Math.ceil(-4.2) = " + Math.ceil(negativo)); // -4.0

        // Math.floor(): redondea hacia abajo.
        // Devuelve el entero matemático inferior o igual más cercano.
        // El resultado es de tipo double.
        System.out.println("Math.floor(4.2) = " + Math.floor(positivo));  // 4.0
        System.out.println("Math.floor(-4.2) = " + Math.floor(negativo)); // -5.0

        // Math.round(): redondea al entero más cercano.
        // En los casos exactamente a mitad, redondea hacia +infinito.
        // Con double devuelve long y con float devuelve int.
        System.out.println("Math.round(4.2) = " + Math.round(positivo));   // 4
        System.out.println("Math.round(-4.2) = " + Math.round(negativo));  // -4
        System.out.println("Math.round(4.5) = " + Math.round(4.5));       // 5
        System.out.println("Math.round(-4.5) = " + Math.round(-4.5));     // -4
    }

}
