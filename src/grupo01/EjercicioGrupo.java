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


public class EjercicioGrupo {

    // ==========================================
    // EJERCICIO 01: ADIVINAR CREDENCIALES
    // ==========================================
    public static void ejercicio01(Scanner sc) {
        final String clave = "1234Pozole";
        int intentos = 0;
        
        System.out.println("\n============================");
        System.out.println("ADIVINAR CREDENCIALES");
        System.out.println("============================");
        
        while (true) {
            intentos = intentos + 1;
            System.out.println("\nNOTA: Intentos ilimitados. INTENTO NUM: " + intentos);
            System.out.print("INTRODUZCA CONTRASEÑA: ");
            String contrasena = sc.next();
            
            if (contrasena.equals(clave)) {
                System.out.println("======================================");
                System.out.println("CONTRASEÑA CORRECTA. BIENVENIDO");
                System.out.println("Lograste ingresar en " + intentos + " intentos.");
                System.out.println("======================================");
                return;
            } 
            System.out.println("CONTRASEÑA INCORRECTA. Vuelva a intentar.");
        }
    }

    // ==========================================
    // EJERCICIO 02: CONTADOR, SUMA Y PROMEDIO
    // ==========================================
    public static void ejercicio02(Scanner sc) {
        int numero;          
        int cantidadNumeros = 0; 
        int sumaTotal = 0;       
        double promedio = 0;     

        System.out.println("\n=== CONTADOR DE NUMEROS ===");
        System.out.println("Ingresa numeros positivos. Para terminar, ingresa un numero negativo.\n");
        
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
    //While True
        while (numero >= 0) {
            cantidadNumeros = cantidadNumeros + 1;
            sumaTotal = sumaTotal + numero;       
            
            System.out.print("Ingresa otro numero: ");
            numero = sc.nextInt(); 
        }
        
        if (cantidadNumeros > 0) {
            promedio = (double) sumaTotal / cantidadNumeros;
        }
          
        System.out.println("\n---------------------------------");
        System.out.println("¡Proceso terminado por numero negativo!");
        System.out.println("Cantidad de numeros positivos ingresados: " + cantidadNumeros);
        System.out.println("La suma total de los numeros es: " + sumaTotal);
        System.out.println("El promedio es: " + promedio);
        System.out.println("---------------------------------");
    }

    // ==========================================
    // EJERCICIO 03: VALIDACION DE NOTA UNICA
    // ==========================================
    public static void ejercicio03(Scanner sc) {
        double nota;
        
        System.out.println("\n=== VALIDACION DE NOTA UNICA ===");
        System.out.print("Ingresa una nota entre 0 y 10: ");
        nota = sc.nextDouble();
        
        while (nota < 0 || nota > 10) {
            System.out.println(" Error " + nota + " no es una nota valida.");
            System.out.print("Por favor, intenta de nuevo. Ingresa una nota entre 0 y 10: ");
            nota = sc.nextDouble();
        }
        
        System.out.println("\n------------------------------------------------");
        System.out.println(" Nota " + nota + " registrada con exito");
        System.out.println("------------------------------------------------");
    }

    // ==========================================
    // EJERCICIO 04: CAJERO AUTOMATICO
    // ==========================================
    public static void ejercicio04(Scanner sc) {
        String claveCorrecta = "1234Pozole";
        boolean accesoConcedido = false; 
        
        System.out.println("\n=== CAJERO AUTOMATICO BANCARIO ===");
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento [ " + i + " de 3 ] - Ingrese su clave: ");
            String claveIngresada = sc.next();
              
            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido = true; 
                break; 
            } else {
                if (i < 3) {
                    System.out.println("Clave incorrecta. Intente nuevamente.\n");
                }
            }
        }
        
        System.out.println("\n------------------------------------------------");
        if (accesoConcedido) {
             System.out.println("CLAVE CORRECTA Bienvenido a su cuenta bancaria.");
        } else {
            System.out.println("ACCESO BLOQUEADO Superó los 3 intentos permitidos.");
        }
        System.out.println("------------------------------------------------");
    }

    // ==========================================
    // EJERCICIO 05: PARES E IMPARES
    // ==========================================
    public static void ejercicio05(Scanner sc) {
        int numero;
        int pares = 0;
        int impares = 0;
        
        System.out.println("\n====================================================================================");
        System.out.println("PROGRAMA PARA INGRESAR NUMEROS ENTEROS E INDICAR CUALES SON NUMEROS PARES E IMPARES");
        System.out.println("====================================================================================");
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = sc.nextInt();
         
        while (numero != 0) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            System.out.print("Ingrese otro numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }

    // ==========================================
    // EJERCICIO 06: VENTAS DIARIAS
    // ==========================================
    public static void ejercicio06(Scanner sc) {
        double venta;
        double total = 0;
        int cantidad = 0;
        
        System.out.println("=============================================================");
        System.out.println("Algoritmo que permita ingresar ventas diarias de una tienda");
        System.out.println("==============================================================");
        
        System.out.print("Ingrese una venta (0 para terminar): ");
        venta = sc.nextDouble();
        
        while (venta != 0) {
            total = total + venta;
            cantidad++;

            System.out.print("Ingrese otra venta (0 para terminar): ");
            venta = sc.nextDouble();
        }    
        System.out.println("\nTotal vendido: " + total);
        System.out.println("Cantidad de ventas registradas: " + cantidad);
    }

    // ==========================================
    // EJERCICIO 07: DETENER POR NEGATIVO 
    // ==========================================
    public static void ejercicio07(Scanner sc) {
        int numero;
        System.out.println("\n================================================================");
        System.out.println("Algoritmo que solicite numeros hasta que se ingrese uno negativo");
        System.out.println("=================================================================");
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        while (numero >= 0) {
            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Se ingreso un numero negativo. Fin del ejercicio.");
    }

    // ==========================================
    // EJERCICIO 08: TABLA DE MULTIPLICAR (Antes ejercicio 7)
    // ==========================================
    public static void ejercicio08(Scanner sc) {
        int numero;
        System.out.println("\n========================================================================================================");
        System.out.println("Algoritmo que solicite un numero entero positivo y genere su tabla de multiplicar desde el 1 hasta el 20.");
        System.out.println("======================================================================================================");
        
        System.out.print("Ingrese un numero entero positivo: ");
        numero = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // ==========================================
    // EJERCICIO 09: CALCULAR FACTORIAL
    // ==========================================
    public static void ejercicio09(Scanner sc) {
        int numero;
        long factorial = 1;
        System.out.println("\n=== CALCULO DE FACTORIAL ===");
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    // ==========================================
    // EJERCICIO 10: CLASIFICAR 15 NUMEROS
    // ==========================================
    public static void ejercicio10(Scanner sc) {
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        int numero;
        System.out.println("\n=== CLASIFICADOR DE 15 NUMEROS ===");
        System.out.println("Ingrese los numeros: ");
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Numero " + i + ": ");
            numero = sc.nextInt();
            if (numero > 0) {
                contPositivos++;
            } else if (numero < 0) {
                contNegativos++;
            } else {
                contCeros++;
            }
        }
        System.out.println("\nPositivos: " + contPositivos);
        System.out.println("Negativos: " + contNegativos);
        System.out.println("Ceros: " + contCeros);
    }

    // ==========================================
    // EJERCICIO 11: PROMEDIO DE 20 ESTUDIANTES
    // ==========================================
    public static void ejercicio11(Scanner sc) {
        final int CANT_ESTUDIANTES = 20;
        double sumaCalificaciones = 0;
        double calificacion, promedio;
        System.out.println("\n=== PROMEDIO DE NOTAS DE CURSO ===");
        System.out.println("Ingrese las calificaciones de los estudiantes: ");
        
        for (int i = 1; i <= CANT_ESTUDIANTES; i++) {
            System.out.print("Calificacion del estudiante " + i + ": ");
            calificacion = sc.nextDouble();
            sumaCalificaciones += calificacion;
        }
        promedio = sumaCalificaciones / CANT_ESTUDIANTES;
        System.out.printf("El promedio general del curso es: %.2f\n", promedio);
    }

    // ==========================================
    // EJERCICIO 12: SECUENCIA DE FIBONACCI (N TERMINOS)
    // ==========================================
    public static void ejercicio12(Scanner sc) {
        System.out.println("\n=== SERIE DE FIBONACCI ===");
        System.out.print("¿Cuántos terminos desea mostrar?: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Ingrese un numero mayor a 0");
            return;
        }
        
        int a = 0, b = 1;
        System.out.print("Los primeros " + n + " terminos son: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    // ==========================================
    // EJERCICIO 13: BUSCADOR DE MAYOR Y MENOR (10 NUMEROS)
    // ==========================================
    public static void ejercicio13(Scanner sc) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("===Buscador de Mayor y Menor===");
        System.out.println("Ingrese 10 numeros y te dire cual es el mayor y el menor");
        
        int numero;
        int mayor, menor;
        
        System.out.print("Ingrese el numero 1: ");
        numero = sc.nextInt();
        mayor = numero;
        menor = numero;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("==============================");
        System.out.println("El numero MAYOR es: " + mayor);
        System.out.println("El numero MENOR es: " + menor);
        System.out.println("Diferencia: " + (mayor - menor));
        System.out.println("\nGracias por usar el programa. Fin del programa");
    }

    // ==========================================
    // EJERCICIO 14: SUMA DE PARES COMPRENDIDOS ENTRE 1 Y 200
    // ==========================================
    public static void ejercicio14(Scanner sc) {
        int suma = 0;
        System.out.println("\n=== SUMA DE NUMEROS PARES (1 A 200) ===");
        
        for (int i = 2; i <= 200; i += 2) {
            suma += i;
        }
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("La suma de todos los numeros pares entre 1 y 200 es: " + suma);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Gracias por estar en este programa");
    }

    // ==========================================
    // EJERCICIO 15: VERIFICADOR DE NÚMEROS PRIMOS 
    // ==========================================
    public static void ejercicio15(Scanner sc) {
        System.out.println("\n=== VERIFICADOR DE NUMEROS PRIMOS ===");
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        
        int divisores = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        
       
        if (divisores == 2) {
            System.out.println("El numero " + numero + " ES PRIMO");
        } else {
            System.out.println("El numero " + numero + " NO ES PRIMO");
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    // ==========================================
    //MENÚ DE OPCIONES
    // ==========================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=========================================");
            System.out.println("         MENU PRINCIPAL DE OPCIONES     ");
            System.out.println("=========================================");
            System.out.println("1. Adivinar Credenciales (Ilimitado)");
            System.out.println("2. Contador, Suma y Promedio");
            System.out.println("3. Registro Continuo de Notas");
            System.out.println("4. Cajero Automatico (3 Intentos)");
            System.out.println("5. Numeros Pares e Impares");
            System.out.println("6. Ventas Diarias de Tienda");
            System.out.println("7. Solicitar numeros hasta un Negativo");
            System.out.println("8. Tabla de Multiplicar (1 al 20)");
            System.out.println("9. Calcular Factorial de un Numero");
            System.out.println("10. Contador de Positivos, Negativos y Ceros");
            System.out.println("11. Promedio General de 20 Calificaciones");
            System.out.println("12. Serie de Fibonacci (N Terminos)");
            System.out.println("13. Buscador de Mayor y Menor (10 Numeros)");
            System.out.println("14. Suma de Numeros Pares de 1 a 200");
            System.out.println("15. Verificador de Numeros Primos ");
            System.out.println("16. SALIR DEL PROGRAMA");
            System.out.print("Elija una opcion (1-16): ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio01(sc); break;
                case 2: ejercicio02(sc); break;
                case 3: ejercicio03(sc); break;
                case 4: ejercicio04(sc); break;
                case 5: ejercicio05(sc); break;
                case 6: ejercicio06(sc); break;
                case 7: ejercicio07(sc); break;
                case 8: ejercicio08(sc); break;
                case 9: ejercicio09(sc); break;
                case 10: ejercicio10(sc); break;
                case 11: ejercicio11(sc); break;
                case 12: ejercicio12(sc); break;
                case 13: ejercicio13(sc); break;
                case 14: ejercicio14(sc); break;
                case 15: ejercicio15(sc); break;
                case 16:
                    System.out.println("\nGracias por usar el sistema");
                    break;
                default:
                    System.out.println("\nOpción no valida. Intente de nuevo.");
            }

            if (opcion != 16) {
                System.out.println("\nRegresando al menu principal...");
            }

        } while (opcion != 16);

        sc.close(); 
    }
}
