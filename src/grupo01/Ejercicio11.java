/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo01;

import java.util.Scanner;

/**
 *
 * @author kerly
 */
public class Ejercicio11 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);//para leer datos
        final int CANT_ESTUDIANTES=20;//numero de estudiantes 
        double sumaCalificaciones=0;//acumulacion de notas
        double calificacion,promedio;
        System.out.println("Ingrese las calificasiones de los estudiantes: ");
        //repetir 20 vesespor alumno
        for (int i = 1; i<=CANT_ESTUDIANTES; i++){
            System.out.println("calificacion del estudiante" + i +":");
            calificacion= sc.nextDouble();//Leer nota
            sumaCalificaciones += calificacion;//sumar total
        }
        //calcular promedio
        promedio = sumaCalificaciones /CANT_ESTUDIANTES;
    }
    
}
