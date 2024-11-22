package es.iessoterohernandez.daw.endes.fibonacciMain;

/**
 * Hello world!
 *
 */
import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;
import java.util.Scanner;
public class fibonacciMain 
{
    public static void main( String[] args )
    {
    	Fibonacci fc = new Fibonacci();
    	Scanner sc = new Scanner(System.in);
        System.out.print( "Vamos a hacer una serie fibonacci, dime cuantas veces deseas la serie: ");
        fc.fibonacci(sc.nextInt());     
    }
}
