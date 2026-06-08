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
            String contrasena = sc.next(); // Usamos next() para evitar problemas de salto de línea
            
            if (contrasena.equals(clave)) {
                System.out.println("======================================");
                System.out.println("CONTRASEÑA CORRECTA. ¡BIENVENIDO!");
                System.out.println("Lograste ingresar en " + intentos + " intentos.");
                System.out.println("======================================");
                return; // Regresa al menú principal
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
        System.out.println("Ingresa numeros positivos. Para terminar, ingresa un número negativo.\n");
        
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();

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
    // EJERCICIO 03: REGISTRO CONTINUO DE NOTAS
    // ==========================================
    public static void ejercicio03(Scanner sc) {
        double nota;
        
        System.out.println("\n=== REGISTRO CONTINUO DE NOTAS ===");
        System.out.println("Ingresa notas entre 0 y 10.");
        System.out.println("Para terminar todo el proceso, ingresa un numero negativo.\n");
        
        System.out.print("Ingresa una nota: ");
        nota = sc.nextDouble();
        
        while (nota >= 0) {
            if (nota <= 10) {
                System.out.println("-> ¡Nota " + nota + " registrada con exito!");
            } else {
                System.out.println("-> ¡Error! " + nota + " no es valida (debe ser máximo 10). No se registró.");
            }
            System.out.println();
            System.out.print("Ingresa la siguiente nota (o un negativo para salir): ");
            nota = sc.nextDouble();
        }
        
        System.out.println("\n------------------------------------------------");
        System.out.println("Proceso terminado porque ingresaste un numero negativo.");
        System.out.println("------------------------------------------------");
    }

    // ==========================================
    // EJERCICIO 04: CAJERO AUTOMÁTICO
    // ==========================================
    public static void ejercicio04(Scanner sc) {
        String claveCorrecta = "1234Isaac";
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
             System.out.println("¡CLAVE CORRECTA! Bienvenido a su cuenta bancaria.");
        } else {
            System.out.println("¡ACCESO BLOQUEADO! Superó los 3 intentos permitidos.");
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
    // EJERCICIO 07: TABLA DE MULTIPLICAR
    // ==========================================
    public static void ejercicio07(Scanner sc) {
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
    // EJERCICIO 08: DETENER POR NEGATIVO
    // ==========================================
    public static void ejercicio08(Scanner sc) {
        int numero;
        System.out.println("\n================================================================");
        System.out.println("Algoritmo que solicite numeros hasta que se ingrese uno negativo");
        System.out.println("=================================================================");
        //Ingresar un numero
        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();
        //While True
        while (numero >= 0) {
            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Se ingreso un numero negativo. Fin del ejercicio.");
    }

    // ==========================================
    // MÉTODO PRINCIPAL: EL MENÚ DE OPCIONES
    // ==========================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // El do-while mantendrá vivo el menú hasta que elijamos la opción 9
        do {
            System.out.println("\n=========================================");
            System.out.println("          MENU PRINCIPAL DE OPCIONES     ");
            System.out.println("=========================================");
            System.out.println("1. Adivinar Credenciales (Ilimitado)");
            System.out.println("2. Contador, Suma y Promedio");
            System.out.println("3. Registro Continuo de Notas");
            System.out.println("4. Cajero Automático (3 Intentos)");
            System.out.println("5. Números Pares e Impares");
            System.out.println("6. Ventas Diarias de Tienda");
            System.out.println("7. Tabla de Multiplicar (1 al 20)");
            System.out.println("8. Solicitar números hasta un Negativo");
            System.out.println("9. SALIR DEL PROGRAMA");
            System.out.print("Elija una opción (1-9): ");
            
            opcion = sc.nextInt();

            // Evaluamos la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    ejercicio01(sc);
                    break;
                case 2:
                    ejercicio02(sc);
                    break;
                case 3:
                    ejercicio03(sc);
                    break;
                case 4:
                    ejercicio04(sc);
                    break;
                case 5:
                    ejercicio05(sc);
                    break;
                case 6:
                    ejercicio06(sc);
                    break;
                case 7:
                    ejercicio07(sc);
                    break;
                case 8:
                    ejercicio08(sc);
                    break;
                case 9:
                    System.out.println("\n¡Gracias por usar el sistema! Hasta pronto.");
                    break;
                default:
                    System.out.println("\n[ERROR] Opción no valida. Intente de nuevo.");
            }

            // Una pequeña pausa visual antes de volver a pintar el menú
            if (opcion != 9) {
                System.out.println("\nRegresando al menu principal...");
            }

        } while (opcion != 9); // El ciclo sigue vivo mientras 'opcion' NO sea 9

        sc.close(); // Cerramos el scanner al apagar todo el programa
    }
}