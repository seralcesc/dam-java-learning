package apuntes;

/**
 * APUNTES - BUCLES Y CONTROL DEL FLUJO DE EJECUCIÓN
 *
 * Un bucle es una estructura repetitiva de control de flujo.
 * Repite instrucciones mientras se cumple una condición o recorre elementos.
 *
 * GUÍA DE ELECCIÓN:
 * while    -> comprobar antes de entrar; puede no ejecutarse ninguna vez.
 * do-while -> realizar una acción al menos una vez y comprobar después.
 * for      -> agrupar inicialización, condición y actualización.
 * for-each -> recorrer directamente elementos de un array o un Iterable.
 *
 * for no exige conocer de antemano el número de vueltas:
 * su condición también puede depender de valores que cambian al ejecutar.
 *
 * Los ejemplos utilizan datos fijos para ejecutarse sin pedir entradas.
 * Consulta cada sección por separado durante los ejercicios.
 *
 * REFERENCIAS:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 */
public class EjemploBucles {

    public static void main(String[] args) {

        //1. WHILE: CONDICIÓN ANTES DE CADA VUELTA
        System.out.println("\n1. WHILE");
        int cuenta = 1;                 // Inicialización.
        while (cuenta <= 3) {           // Condición de continuación.
            System.out.println(cuenta);
            cuenta++;                  // Actualización.
        }
        // Salida: 1, 2, 3 en líneas distintas.
        // Al llegar a 4, la condición es falsa y se continúa después del bucle.
        // Si cuenta empezara en 4, no se ejecutaría el cuerpo.

        //2. DO-WHILE: AL MENOS UNA VUELTA
        System.out.println("\n2. DO-WHILE");
        int valor = 4;
        do {
            System.out.println(valor);
            valor++;
        } while (valor <= 3);
        // Salida: 4. Se ejecuta antes de comprobar la condición.
        // IMPORTANTE: do-while termina con punto y coma.

        /*
         * USO HABITUAL: VALIDAR UNA ENTRADA (plantilla no ejecutada).
         *
         * Scanner sc = new Scanner(System.in);
         * int edad;
         * do {
         *     System.out.print("Edad entre 0 y 120: ");
         *     edad = sc.nextInt();
         * } while (edad < 0 || edad > 120);
         *
         * Repetimos MIENTRAS el dato sea incorrecto.
         * El || expresa que basta con incumplir uno de los límites.
         * Para usar la plantilla, importa java.util.Scanner.
         * Presupone una entrada entera; letras producirían InputMismatchException.
         */

        //3. FOR: INICIALIZACIÓN; CONDICIÓN; ACTUALIZACIÓN
        System.out.println("\n3. FOR ASCENDENTE");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        // Salida: 1, 2, 3.
        // Orden:
        // 1) int i = 1 se ejecuta una vez.
        // 2) Se comprueba i <= 3.
        // 3) Si es true, se ejecuta el cuerpo.
        // 4) Se ejecuta i++ y se vuelve al paso 2.
        // La i declarada aquí no se puede utilizar después del bucle.

        //4. FOR DESCENDENTE Y PASO PERSONALIZADO
        System.out.println("\n4. FOR DESCENDENTE");
        for (int i = 9; i > 0; i -= 3) {
            System.out.println(i);
        }
        // Salida: 9, 6, 3.
        // El paso no tiene que ser de una unidad.
        // Debe permitir alcanzar una situación donde la condición sea falsa.

        //5. RECORRER UN STRING POR POSICIONES
        System.out.println("\n5. RECORRIDO DE STRING");
        String texto = "Java";
        for (int i = 0; i < texto.length(); i++) {
            System.out.printf("Posición %d: %c%n", i, texto.charAt(i));
        }
        // Índices: 0, 1, 2 y 3. Usa < length(), no <= length().
        // String utiliza length() con paréntesis.

        //6. FOR-EACH: ELEMENTOS EN LUGAR DE ÍNDICES
        System.out.println("\n6. FOR-EACH");
        int[] numeros = {10, 20, 30};
        // Un array agrupa valores del mismo tipo.
        // int[] significa "array de enteros".
        for (int numero : numeros) {
            System.out.println(numero);
        }
        // Salida: 10, 20, 30.
        // Se lee: "Para cada numero de numeros".
        // numero recibe el siguiente elemento automáticamente.
        // No se escriben inicialización, condición ni incremento.
        // Es una forma de for; NO existe una palabra reservada "foreach".

        //7. EL MISMO ARRAY CON FOR TRADICIONAL
        System.out.println("\n7. FOR CON ÍNDICE");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Índice %d: %d%n", i, numeros[i]);
        }
        // Un array utiliza length sin paréntesis.
        // Usa el for tradicional cuando necesitas posición, paso o recorrido inverso.
        // for-each también funciona con colecciones Iterable, que se verán después.
        // No puedes escribir "for (char letra : texto)" sobre un String directamente.

        //8. ASIGNAR A LA VARIABLE DEL FOR-EACH NO REEMPLAZA EL ELEMENTO
        System.out.println("\n8. FOR-EACH Y MODIFICACIONES");
        for (int numero : numeros) {
            numero = numero * 2;
        }
        System.out.print("Array tras reasignar numero: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        // Sigue siendo 10, 20, 30: reasignamos la variable local, no el array.
        // Con objetos, esa variable contiene una referencia:
        // se puede modificar el objeto si es mutable, pero reasignar la variable
        // tampoco reemplaza el elemento de la colección o array.
        // Para sustituir enteros del array, usa el índice:
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
        System.out.print("Array modificado mediante índices: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        // Ahora: 20, 40, 60.

        //9. CONTADOR, ACUMULADOR Y BANDERA
        System.out.println("\n9. CONTADOR, ACUMULADOR Y BANDERA");
        int[] datos = {4, -2, 7, 0};
        int positivos = 0;              // Contador: cuántos cumplen.
        int suma = 0;                   // Acumulador: suma de valores.
        boolean hayNegativo = false;   // Bandera: recuerda un hallazgo.

        for (int dato : datos) {
            suma += dato;
            if (dato > 0) {
                positivos++;
            }
            if (dato < 0) {
                hayNegativo = true;
            }
        }
        System.out.println("Positivos: " + positivos);      // 2
        System.out.println("Suma: " + suma);                // 9
        System.out.println("Hay negativo: " + hayNegativo); // true
        // Se inicializan ANTES del bucle para conservar lo acumulado.
        // La bandera no se vuelve a false si un dato posterior es positivo.

        //10. BREAK: SALIR DEL BUCLE
        System.out.println("\n10. BREAK");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }
            System.out.println(numero);
        }
        // Salida: 1, 2. Al llegar a 3, sale del bucle.
        // Un break sin etiqueta termina el bucle o switch más cercano
        // que lo contiene; no finaliza automáticamente todo el programa.

        //11. CONTINUE: OMITIR EL RESTO DE UNA VUELTA
        System.out.println("\n11. CONTINUE");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }
            System.out.println(numero);
        }
        // Salida: 1, 2, 4, 5.
        // En for se ejecuta la actualización antes de comprobar otra vez.
        // En while se vuelve directamente a comprobar la condición:
        // cuidado si continue impide actualizar una variable necesaria.

        //12. BUCLES ANIDADOS
        System.out.println("\n12. BUCLES ANIDADOS");
        for (int fila = 1; fila <= 2; fila++) {
            for (int columna = 1; columna <= 3; columna++) {
                System.out.printf("(%d,%d) ", fila, columna);
            }
            System.out.println();
        }
        // Por cada vuelta exterior se completa el recorrido interior.
        // Hay 2 * 3 = 6 ejecuciones del print interior.

        //13. CONDICIONES COMPUESTAS
        System.out.println("\n13. CONDICIONES COMPUESTAS");
        int intentos = 0;
        boolean encontrado = false;
        while (!encontrado && intentos < 3) {
            intentos++;
            // Simulamos que el hallazgo ocurre en el segundo intento.
            encontrado = intentos == 2;
        }
        System.out.println("Intentos realizados: " + intentos); // 2
        // Continuar MIENTRAS no esté encontrado Y queden intentos.
        // Termina si se encuentra O si se alcanza el límite.
        // La condición expresa continuación, no la situación de salida.

        /*
         * ERRORES FRECUENTES
         * - Reiniciar un contador o acumulador dentro del bucle.
         * - Olvidar la actualización y crear un bucle infinito.
         * - Escribir ; después de while(...) o for(...):
         *   el cuerpo del bucle puede quedar vacío.
         *   Excepción: el ; final de do-while sí es necesario.
         * - Usar <= array.length o <= texto.length(): índice fuera de rango.
         * - Confundir el índice i con el elemento array[i].
         * - Usar for-each esperando obtener automáticamente la posición.
         * - Elegir && u || sin razonar cuándo debe continuar la repetición.
         *
         * COMPROBACIÓN ANTES DE TERMINAR
         * 1) ¿Cómo empieza la variable de control?
         * 2) ¿Cuándo continúa el bucle?
         * 3) ¿Qué cambia en cada vuelta?
         * 4) ¿Qué ocurre si la condición es falsa desde el principio?
         * 5) ¿Se incluyen correctamente el primer y el último dato?
         */
    }
}
