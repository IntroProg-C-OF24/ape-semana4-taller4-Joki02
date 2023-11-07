/*
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos
iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y
un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado 
mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
multiplicando su base por su altura; 
El área de un triángulo rectángulo se calcula multiplicando su base por su 
altura y luego dividiendo el resultado entre dos; 
Finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de 
uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos 
que hay que preguntar.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lc, at, result, result1, resultado;
        System.out.println("Ingresa el valor de un lado del cuadrado");
        lc = teclado.nextDouble();
        System.out.println("Ingresa el valor de la altura del triangulo");
        at = teclado.nextDouble();
        result = ((lc * at) / 2) * 5;
        result1 = lc * lc;
        resultado = result + result1;
        System.out.println("El area del poligono es:" + " " + resultado);
    }
}
