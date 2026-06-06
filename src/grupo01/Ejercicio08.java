/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;
import java.util.Scanner;
/**
 *
 * @author COMPU
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      //Ingresar variable
      int numero;
      //inicio del programa
        System.out.println("================================================================");
        System.out.println("Algoritmo que solicite números hasta que se ingrese uno negativo");
        System.out.println("=================================================================");
        //Ingresar un numero
        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();
        //While True
        while (numero >= 0) {

            System.out.print("Ingrese otro número: ");
            numero = sc.nextInt();
            System.out.println("Se ingresó un número negativo. Fin del programa.");
            // FIN DEL PROGRAMA
        }
    }
    
}
