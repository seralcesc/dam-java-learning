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
        
        //Redondeo
        System.out.println("");
        System.out.println("a = " + a);
        System.out.println("Redondeo de la variable a = " + Math.round(a));
        System.out.println("b = " + b);
        System.out.println("Redondeo de la variable b = " + Math.round(b));
    }

}
