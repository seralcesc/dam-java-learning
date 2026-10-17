/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones01;


/*
***************************************************************************
*************** EJEMPLO EXCEPCIONES 2: DIVISIÓN POR 0 *********************
***************************************************************************
*/

/*
Aunque la división por 0 se puede tratar con una excepción, también se puede
evitar con un condicional, impidiendo que la operación se realice si el divisor
es 0. 
*/
/**
 *
 * @author Jesús Pérez
 */
public class Excepciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int div, x, y;
        
        x=3;
        y=0;
        
        try{
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            div=x/y;       
            System.out.println("div = " + div);
        }
        catch(ArithmeticException ex){
            System.err.println(ex);
            System.err.println("No se puede dividir por 0");
        }
        finally{
            System.out.println("Esta frase se imprime pase lo que pase "
                    + "porque está incluida dentro de finally");
        }
    }
    
}
