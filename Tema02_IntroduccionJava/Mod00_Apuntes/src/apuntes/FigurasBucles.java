import java.util.Scanner;

/**
 * ================================================================
 * APUNTES DE JAVA - DIBUJAR FIGURAS CON BUCLES ANIDADOS
 * ================================================================
 *
 * CONTENIDO PRINCIPAL: 10 FIGURAS
 *   1. Rectángulo relleno
 *   2. Rectángulo hueco
 *   3. Triángulo creciente a la izquierda, relleno
 *   4. Triángulo creciente a la derecha, relleno
 *   5. Triángulo decreciente a la izquierda, relleno
 *   6. Triángulo decreciente a la derecha, relleno
 *   7. Triángulo creciente a la izquierda, hueco
 *   8. Triángulo creciente a la derecha, hueco
 *   9. Triángulo decreciente a la izquierda, hueco
 *  10. Triángulo decreciente a la derecha, hueco
 *
 * EXTRA (las pirámides que hemos visto después):
 *  11. Pirámide rellena
 *  12. Pirámide hueca
 *  13. Pirámide invertida rellena
 *  14. Pirámide invertida hueca
 *
 * El cuadrado es un caso particular del rectángulo: alto == ancho.
 *
 * ================================================================
 * TEORÍA: CÓMO PENSAR CUALQUIER FIGURA
 * ================================================================
 * 1) El bucle EXTERIOR recorre las FILAS (variable i).
 * 2) Los bucles INTERIORES recorren COLUMNAS (variable j).
 * 3) print(...) NO cambia de línea; println() SÍ.
 * 4) En figuras HUECAS, un if decide entre símbolo y espacios.
 * 5) Para ALINEAR A LA DERECHA, primero se imprimen espacios.
 *
 * Esquema general:
 *   for (int i = 1; i <= altura; i++) {
 *       for (int j = 1; j <= limite; j++) {
 *           System.out.print(simbolo + " ");
 *       }
 *       System.out.println();  // Solo UNA vez por fila
 *   }
 *
 * REGLAS CLAVE:
 * - Rectángulo: el bucle interior llega hasta ancho.
 * - Triángulo: el bucle interior llega hasta i.
 * - Triángulo alineado a la derecha: primero (altura - i) espacios.
 * - Hueco: símbolo solo en los bordes; en el resto, dos espacios.
 * - Pirámide: (altura - i) bloques de espacios y (2 * i - 1) símbolos.
 *
 * IMPORTANTE: imprimimos el símbolo seguido de un espacio ("* ").
 * Por eso cada espacio vacío se representa con DOS espacios ("  ").
 * Se pide un único carácter para conservar la alineación.
 *
 * ================================================================
 * CÓMO UTILIZAR ESTOS APUNTES
 * ================================================================
 * Ejecuta el archivo, elige una figura del menú y compara cada dibujo
 * con su bloque de código. Cada case contiene su propio algoritmo.
 * No se usan arrays, métodos auxiliares ni programación orientada a objetos.
 */
public class FigurasBucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int altura;
        int ancho;
        String simbolo;

        do {
            System.out.println("\n========== FIGURAS CON BUCLES ANIDADOS ==========");
            System.out.println(" 1. Rectángulo relleno (cuadrado si alto = ancho)");
            System.out.println(" 2. Rectángulo hueco");
            System.out.println(" 3. Triángulo creciente, izquierda, relleno");
            System.out.println(" 4. Triángulo creciente, derecha, relleno");
            System.out.println(" 5. Triángulo decreciente, izquierda, relleno");
            System.out.println(" 6. Triángulo decreciente, derecha, relleno");
            System.out.println(" 7. Triángulo creciente, izquierda, hueco");
            System.out.println(" 8. Triángulo creciente, derecha, hueco");
            System.out.println(" 9. Triángulo decreciente, izquierda, hueco");
            System.out.println("10. Triángulo decreciente, derecha, hueco");
            System.out.println("---- EXTRAS: PIRÁMIDES ----");
            System.out.println("11. Pirámide rellena");
            System.out.println("12. Pirámide hueca");
            System.out.println("13. Pirámide invertida rellena");
            System.out.println("14. Pirámide invertida hueca");
            System.out.println(" 0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Fin de los apuntes.");
            } else if (opcion < 0 || opcion > 14) {
                System.out.println("Opción incorrecta. Introduce un número entre 0 y 14.");
            } else {
                // Todas las figuras necesitan altura positiva.
                do {
                    System.out.print("Introduce la altura (mayor que 0): ");
                    altura = sc.nextInt();
                    if (altura <= 0) {
                        System.out.println("La altura debe ser positiva.");
                    }
                } while (altura <= 0);

                // Solo los rectángulos requieren un ancho independiente.
                ancho = altura;
                if (opcion == 1 || opcion == 2) {
                    do {
                        System.out.print("Introduce el ancho (mayor que 0): ");
                        ancho = sc.nextInt();
                        if (ancho <= 0) {
                            System.out.println("El ancho debe ser positivo.");
                        }
                    } while (ancho <= 0);
                }

                System.out.print("Introduce un símbolo (se usa su primer carácter): ");
                simbolo = sc.next();
                simbolo = simbolo.substring(0, 1);

                System.out.println("\n--- FIGURA ---");
                switch (opcion) {
                    case 1:
                        /* RECTÁNGULO RELLENO
                         * Exterior: tantas filas como altura.
                         * Interior: en CADA fila, tantos símbolos como ancho.
                         * Si ancho == altura, se obtiene un cuadrado.
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= ancho; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        /* RECTÁNGULO HUECO
                         * Un símbolo pertenece al borde si está en:
                         *   - primera fila   (i == 1)
                         *   - última fila    (i == altura)
                         *   - primera columna (j == 1)
                         *   - última columna (j == ancho)
                         * || significa «O»: basta que se cumpla UNA condición.
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= ancho; j++) {
                                if (i == 1 || i == altura || j == 1 || j == ancho) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        /* TRIÁNGULO CRECIENTE IZQUIERDA - RELLENO
                         * i aumenta: 1, 2, 3, ... altura.
                         * j <= i: en cada fila se imprime 1 símbolo más.
                         * Ejemplo altura 4:
                         * *
                         * * *
                         * * * *
                         * * * * *
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        /* TRIÁNGULO CRECIENTE DERECHA - RELLENO
                         * Primero (altura - i) bloques de DOS espacios.
                         * Después i símbolos. Los espacios van disminuyendo.
                         * Ejemplo altura 4:
                         *       *
                         *     * *
                         *   * * *
                         * * * * *
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 5:
                        /* TRIÁNGULO DECRECIENTE IZQUIERDA - RELLENO
                         * i disminuye: altura, altura-1, ... 1.
                         * Seguimos imprimiendo i símbolos por fila.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 6:
                        /* TRIÁNGULO DECRECIENTE DERECHA - RELLENO
                         * i disminuye, por lo que cada fila tiene menos símbolos.
                         * (altura - i) aumenta: cada fila empieza más a la derecha.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 7:
                        /* TRIÁNGULO CRECIENTE IZQUIERDA - HUECO
                         * El bucle es igual que en el caso 3.
                         * Ahora solo dibujamos:
                         *   j == 1      lado vertical izquierdo
                         *   j == i      lado diagonal derecho
                         *   i == altura base inferior completa
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= i; j++) {
                                if (j == 1 || j == i || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 8:
                        /* TRIÁNGULO CRECIENTE DERECHA - HUECO
                         * Igual que caso 7, pero con espacios ANTES del triángulo.
                         * IMPORTANTE: espacios de alineación y espacios interiores
                         * no son lo mismo; se dibujan en bucles diferentes.
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                if (j == 1 || j == i || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 9:
                        /* TRIÁNGULO DECRECIENTE IZQUIERDA - HUECO
                         * i va de altura a 1.
                         * La base SUPERIOR se dibuja cuando i == altura.
                         * Los bordes siguen siendo j == 1 y j == i.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                if (j == 1 || j == i || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 10:
                        /* TRIÁNGULO DECRECIENTE DERECHA - HUECO
                         * Igual que caso 9 + espacios iniciales (altura - i).
                         * Es la figura que combina descenso, alineación y bordes.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= i; j++) {
                                if (j == 1 || j == i || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 11:
                        /* PIRÁMIDE RELLENA
                         * Para centrarla: (altura - i) espacios iniciales.
                         * Nº de símbolos: 2 * i - 1 => 1, 3, 5, 7, ...
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 12:
                        /* PIRÁMIDE HUECA
                         * Lados: primer símbolo (j == 1) y último (j == 2*i-1).
                         * Base completa: i == altura.
                         */
                        for (int i = 1; i <= altura; i++) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                if (j == 1 || j == 2 * i - 1 || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 13:
                        /* PIRÁMIDE INVERTIDA RELLENA
                         * Solo cambia el sentido del for exterior: i disminuye.
                         * El resto de fórmulas son iguales a las del caso 11.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print(simbolo + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 14:
                        /* PIRÁMIDE INVERTIDA HUECA
                         * i == altura dibuja la base SUPERIOR porque i empieza
                         * precisamente en altura. Los laterales no cambian.
                         */
                        for (int i = altura; i >= 1; i--) {
                            for (int j = 1; j <= altura - i; j++) {
                                System.out.print("  ");
                            }
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                if (j == 1 || j == 2 * i - 1 || i == altura) {
                                    System.out.print(simbolo + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                        break;

                    default:
                        // No se llega aquí porque validamos opcion antes.
                        break;
                }
            }
        } while (opcion != 0);

        sc.close();
    }
}
