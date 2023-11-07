/*
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una 
planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios 
consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costo, valor, edad, result, resultado;
        System.out.println("Ingresar el valor del costo por Kilovatio/hora");
        costo = teclado.nextDouble();
        System.out.println("Ingresar el valor de los kilovatios consumidos en el mes");
        valor = teclado.nextDouble();
        System.out.println("Ingresar tu edad");
        edad = teclado.nextDouble();
        result = costo * valor;
        if (edad >= 65) {
            resultado = result * 10 / 100;
            result = result - resultado;
            System.out.println("El valor de la planilla es: " + +result);
        } else {
            System.out.println("El valor de la planilla es" + " " + result);
        }
    }
}
