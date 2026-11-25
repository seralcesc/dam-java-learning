package apuntes;

import java.util.Scanner;

// <editor-fold defaultstate="collapsed" desc="RECORDATORIOS NETBEANS / JAVA">
/*
 * ========== RECORDATORIOS NETBEANS / JAVA ==========
 *
 * EDICIÓN:
 * --------
 * Home + Shift + End   : Seleccionar línea completa
 * Alt + Shift + Flecha : Desplazar línea seleccionada
 * Ctrl + E             : Eliminar línea actual
 * Ctrl + 7             : Comentar o descomentar (Tambiém Ctrl + Shift + C)
 * Alt + Shift + F      : Formatear y aplicar sangría
 * Ctrl + R             : (sobre la variable) Cambia el nombre a todas las variables iguales
 *
 * AYUDAS:
 * -------
 * Ctrl + Shift + I   : Corregir y añadir imports
 * Alt + Shift + I    : Importar clase seleccionada
 * Ctrl + Espacio     : Autocompletado
 * Alt + Insert       : Generar código
 * Shift + F6         : Ejecutar archivo actual
 * scaner + Tab       : Crear Scanner sc con import automático
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
 * %03d     Mínimo 3 posiciones, rellenando con ceros	(005)
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
 * ================================================
 *
 * 1. CALCULAR MCD & MCM
 *
 * ================================================
 * MCD
 * ------------------------------------------------
 * 1. Solicitar dos números positivos.
 * 2. Crear una variable mcd e inicializarla a 1.
 * 3. Recorrer mediante un for los posibles divisores desde 1 hasta el menor de ambos números.
 * 4. Comprobar si cada candidato divide exactamente a los dos números.
 * 5. Si es así, guardar ese candidato en mcd.
 * La condición matemática fundamental es:
 * if (a % i == 0 && b % i == 0) {
 *     mcd = i;
 * }
 * ------------------------------------------------
 * mcm
 * ------------------------------------------------
 * 1. Para calcular el mcm antes se necesita el MCD.
 * La condición matemática fundamental es:
 * mcm = (a / mcd) * b;
 * ================================================
 *
 * 2. ECUACIONES DE SEGUNDO GRADO
 *
 * ================================================
 * de la forma ax² + bx + c = 0
 * ================================================
 *
 * 3. NUMERO PERFECTO
 *
 * ================================================
 * ¿Es perfecto? Sumar divisores propios y comparar con n
 * Fórmula:  n = suma de sus divisores propios positivos (sin incluir n)
 * if (n > 0 && sumaDivisoresPropios == n) { ... }
 *
 * La parte matemática fundamental es:
 * if (numero % i == 0) {
 *     suma += i;
 * * ================================================
 *
 * 4. TEOREMA DE PITÁGORAS / HIPOTENUSA
 *
 * ================================================
 * Fórmula:  a² = b² + c²  ⇒  c² = a² + b²  ⇒  c = √(a² + b²)
 *
 * Java:  double c = Math.sqrt(a * a + b * b);
 *
 * Nota: a y b son los catetos de un triángulo rectángulo. También existe Math.hypot(a, b).
 * ================================================
 *
 * AREA DE FIGURAS PLANAS:
 *
 * ================================================
 * Cuadrado:
 * Área: l² | Perímetro: 4l
 * l * l  |  4 * l
 *
 * Rectángulo:
 * Área: b·h | Perímetro: 2(b+h)
 * b * h  |  2 * (b + h)
 *
 * Triángulo:
 * Área: (b·h)/2 | Perímetro: a+b+c
 * b * h / 2.0  |  a + b + c
 *
 * Círculo:
 * Área: πr² | Diámetro: 2r
 * Math.PI * r * r  |  2 * r
 *
 * Circunferencia
 * Longitud: 2πr = πd
 * 2 * Math.PI * r
 *
 * Paralelogramo
 * Área: b·h | Perímetro: 2(a+b)
 * b * h  |  2 * (a + b)
 *
 * Rombo
 * Área: (D·d)/2 | Perímetro: 4l
 * D * d / 2.0  |  4 * l
 *
 * Trapecio
 * Área: ((B+b)·h)/2
 * (B + b) * h / 2.0
 *
 * Polígono regular
 * Perímetro: n·l | Área: (P·apotema)/2
 * n * l  |  P * apotema / 2.0
 * ================================================
 *
 * AREA DE FIGURAS PLANAS:
 *
 * ================================================
 * Cubo
 * V = l³ | Superficie = 6l²
 * l * l * l  |  6 * l * l
 *
 * Prisma rectangular
 * V = largo·ancho·alto
 * largo * ancho * alto
 *
 * Cilindro
 * V = πr²h | Superficie total = 2πr(r+h)
 * Math.PI*r*r*h | 2*Math.PI*r*(r+h)
 *
 * Cono
 * V = πr²h/3
 * Math.PI * r * r * h / 3.0
 *
 * Esfera
 * V = (4/3)πr³ | Superficie = 4πr²
 * 4.0/3 * Math.PI*r*r*r | 4*Math.PI*r*r
 *
 * Pirámide
 * V = (Área base·h)/3
 * areaBase * h / 3.0
 *
 * ================================================
 *
 * AREA DE FIGURAS PLANAS:
 *
 * ================================================
 * Lo que pide el ejercicio                         Fórmula
 * Importe descontado                               precio * porcentaje / 100
 * Precio con descuento                             precio * (1 - porcentaje / 100)
 * Porcentaje descontado                            (original - final) * 100 / original
 * Precio original antes del descuento              final / (1 - porcentaje / 100)
 * Importe de una subida                            valor * porcentaje / 100
 * Precio con aumento                               valor * (1 + porcentaje / 100)
 * Dos descuentos seguidos                          precio * (1 - p1/100) * (1 - p2/100)
 * Añadir IVA                                       precio * (1 + iva/100)
 * Quitar IVA                                       precioConIVA / (1 + iva/100)
 * Porcentaje de una cantidad respecto de otra      parte * 100.0 / total
 *
 * ------------------------------------------------
 * AUTOR: Sergio Alcántara Escudero
 * ================================================
 */


public class FormulasMatematicas {

    public static void main(String[] args) {

        int mcd, mcm, menor, num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("1.");
        System.out.println("=== CALCULAR EL MCD ===");

        System.out.println("Introduce dos números positivos:");
        System.out.println("Numero 1:");
        num1 = sc.nextInt();
        System.out.println("Numero 2");
        num2 = sc.nextInt();

        menor = Math.min(num1, num2);
        mcd = 1;

        System.out.println("=== MCD ===");
        for (int i = 1; i <= menor; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
        }

        System.out.println("MCD = " + mcd);

        // Para calcular el mcm hay que calcular antes el MCD
        System.out.println("=== MCM ===");

        mcm = (num1 / mcd) * num2;

        System.out.println("MCM = " + mcm);

        System.out.println();
        System.out.println("=============================================================");
        System.out.println("=============================================================");
        System.out.println();

        System.out.println("2.");
        System.out.println("=== RESOLVER ECUACIONES DE SEGUNDO GRADO ===");
        double a, b, c, discriminante;

        System.out.println("Introduce el valor de A: ");
        a = sc.nextDouble();
        System.out.println("Introduce el valor de B: ");
        b = sc.nextDouble();
        System.out.println("Introduce el valor de C: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("El valor de 'a' no puede ser 0 en una ecuación de segundo grado.");
        } else {

            discriminante = Math.pow(b, 2) - (4 * a * c);

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales (el discriminante es negativo).");
            }
        }

        System.out.println();
        System.out.println("=============================================================");
        System.out.println("=============================================================");
        System.out.println();

        System.out.println("3.");
        System.out.println("=== NUMERO PERFECTO ===");


        int numero, suma = 0;

        System.out.print("Introduce un número positivo: ");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    suma += i;
                }
            }

            if (suma == numero) {
                System.out.println("El número es perfecto.");
            } else {
                System.out.println("El número NO es perfecto.");
            }
        }




    } // main

} // class
