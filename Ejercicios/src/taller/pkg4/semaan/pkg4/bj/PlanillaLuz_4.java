/*
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de 
teléfono de un casa. Se debe ingresar el costo por minutos, el número de minutos
consumidos en el mes.
 */
package taller.pkg4.semaan.pkg4.bj;
import java.util.Scanner;
public class PlanillaLuz_4 {

    public static void main(String[] args) {
        double costoMinutos;
        double numeroMinutos;
        double valorPlanilla;
        Scanner teclado = new Scanner(System.in); //DECLARANDO E INICIALIZAR
        System.out.println("Ingrese el costo por minutos");
        costoMinutos = teclado.nextDouble();
        System.out.println("Ingrese el numero de minutos");
        numeroMinutos = teclado.nextDouble();
        valorPlanilla = costoMinutos * numeroMinutos;
        System.out.println("El valor de la panilla es : " + valorPlanilla);
    }

}
