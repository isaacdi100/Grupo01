/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo01;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
        String claveCorrecta = "1234Isaac";
        boolean accesoConcedido = false; // Empieza en falso porque aún no pone la clave
        
        System.out.println("=== CAJERO AUTOMÁTICO BANCARIO ===");
        
      
        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Intento [ " + i + " de 3 ] - Ingrese su clave: ");
            String claveIngresada = teclado.nextLine();
    }
}
