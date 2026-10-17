/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones02;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
***************************************************************************
*************** EJEMPLO EXCEPCIONES 2: LECTURA DE DATOS *******************
***************************************************************************
*/

/*-------------------------------------------------------------------------
En este caso, estamos tratando un error en tiempo de ejecución, ya que no 
sabemos lo que el usuario va a introducir por consola. Debemos garantizar
que nos facilita el tipo de datos correcto y evitar que se rompa el programa
*/

/**
 *
 * @author Jesús Pérez
 */
public class Excepciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0;
        double decimal = 0;
        boolean repetir;
        do {
            repetir = false;
            try {
                System.out.print("Introduce primer número entero: ");                                             
                x = sc.nextInt();

                System.out.print("Introduce segundo número entero: ");
                y = sc.nextInt();

                System.out.print("Introduce tercer número entero: ");
                z = sc.nextInt();

                System.out.print("Introduce un número con decimales: ");
                decimal = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Valor no válido, tipo de excepción " + e.toString());                                             
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        System.out.println("Valor 1 introducido -> " + x);
        System.out.println("Valor 2 introducido -> " + y);
        System.out.println("Valor 3 introducido -> " + z);
        System.out.println("Decimal introducido -> " + decimal);
    }//main
    
}//class
