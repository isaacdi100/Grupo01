/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;
//Importar librería
import java.util.Scanner;
/**
 *
 * @author COMPU
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Librería Scanner
        Scanner sc = new Scanner(System.in);
        // Declarar variables
        double venta;
        double total = 0;
        int cantidad = 0;
        //Inicio del programa
        System.out.println("=============================================================");
        System.out.println("Algoritmo que permita ingresar ventas diarias de una tienda");
        System.out.println("==============================================================");
        
        System.out.print("Ingrese una venta (0 para terminar): ");
        venta = sc.nextDouble();
        //While True
        while (venta != 0) {

            total = total + venta;
            cantidad++;

            System.out.print("Ingrese otra venta (0 para terminar): ");
            venta = sc.nextDouble();
        }    
    System.out.println("Total vendido: " + total);
        System.out.println("Cantidad de ventas registradas: " + cantidad);

        //FIN DEL PROGRAMA
    
}
}