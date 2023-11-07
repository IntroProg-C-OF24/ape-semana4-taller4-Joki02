/*
Generar un algoritmo que permita calcular y mostrar el costo de una computadora
de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class CostoComputadora_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double CPU, TECLA, PANTALLA, RATON, TOTAL;
        System.out.println("Ingresa el costo del CPU");
        CPU = teclado.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        TECLA = teclado.nextDouble();
        System.out.println("Ingresa el costo de la pantalla");
        PANTALLA = teclado.nextDouble();
        System.out.println("Ingresa el costo de el raton");
        RATON = teclado.nextDouble();
        TOTAL = CPU + TECLA + PANTALLA + RATON;
        System.out.println("El total a pagar es: " + TOTAL);

    }
}
