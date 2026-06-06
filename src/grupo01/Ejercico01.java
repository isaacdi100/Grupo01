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
public class Ejercico01 {

    /**
     * @param args the command line arguments
     */
    
  public static void credenciales() {
        // Crear un algoritmo para adivinar credenciales (Intentos ilimitados)
        Scanner sc = new Scanner(System.in);
        final String clave = "1234Pozole"; // Contraseña segura
        
        int intentos = 0;
        
        System.out.println("");
        System.out.println("============================");
        System.out.print("\nADIVINAR CREDENCIALES \n");
        System.out.println("============================");
        
         // Usamos while(true) para que el ciclo se repita de forma ILIMITADA
        while (true) {
            intentos = intentos + 1; // Sumamos un intento al contador
            System.out.println("\nNOTA: Intentos ilimitados. INTENTO NUM: " + intentos);
            System.out.print("INTRODUZCA CONTRASEÑA: ");
            String contrasena = sc.nextLine(); 
            
            // Si la contraseña es correcta
            if (contrasena.equals(clave)) {
                System.out.println("======================================");
                System.out.println("CONTRASEÑA CORRECTA. ¡BIENVENIDO!");
                System.out.println("Lograste ingresar en " + intentos + " intentos.");

      
    }

    public static void main(String[] args) {
        // Llamamos a tu método para probarlo
        credenciales();
    }
}