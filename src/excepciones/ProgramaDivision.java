package excepciones;
//importacion del paquete escanner para poder introducir variables por consola
import java.util.Scanner;
//clase principal 
public class ProgramaDivision {
    //definimos las variables que vamos a usar
    public static int n;
    public static int div;
    public static int res;
    //metodo main donde se ejecutara el programa
    public static void main(String[] args) {

        division();

    }
    //metodo donde se encuentra la implementacion del codigo
    public static void division() {
        //creamos el scanner para meter datos atraves de la consola
        Scanner sc = new Scanner(System.in);
        //metodo try que capturara las excepciones de ser necesario
        try {
            //pedimos los numeros
            System.out.println("Digite el divisor");
            n = sc.nextInt();
            System.out.println("Digite el dividendo: ");
            div = sc.nextInt();
            //hacemos la operacion
            res = n / div;
            //creamos la condicion para lanzar la excpecion por restriccion en el tamaño del numero
            if (n < 10 || div < 10) {
                //metodo try para capturar la excepcion
                try {
                    InsufficientValue.numeros();
                } catch (InsufficientValue ex) {
                    //mostramos la excepcion
                    System.out.println("los numeros deben ser mayores a 10");
                }
            }
            //mostramos el resultado de la division
            System.out.println("La division de " + n + " Entre " + div + " es: " + res);
        } catch (ArithmeticException ae) {
            //mostramos la excepcion sobre la division entre cero
            System.out.println("No se puede dividir entre cero.");
        } catch (Exception e) {
            //mostramos la excepcion en caso de que este poniendo letras en un espacio reservado para numeros
            System.out.println("No es un numero, es una cadena de texto");
        }
    }
}
