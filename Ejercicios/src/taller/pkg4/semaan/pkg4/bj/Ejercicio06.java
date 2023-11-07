/*
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo
de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double prestamo, interes, resultado;
        System.out.println("Ingresa el monto del prestamo");
        prestamo = teclado.nextDouble();
        System.out.println("Ingresa el valor del interes mensual");
        interes = teclado.nextDouble();
        resultado = (prestamo / 12) + interes;
        System.out.println("El valor del pago mensual es:" + " " + resultado);
    }
}
