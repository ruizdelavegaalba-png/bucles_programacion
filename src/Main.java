import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio18for();
    }

    public static void while1() {
        //sirve para ejecutar un bucle mientras se cumpla una condición concreta
        boolean ok = false;
        int i = 0;
        while (!ok) {
            Scanner sc = new Scanner(System.in);
            String linea = sc.nextLine();
            if (linea.equals("vale")) {
                ok = true;
            }
        }
    }

    public static void ejercicio1while() {
        //Imprime los números del 1 al 10.
        int i = 1; // inicia variable
        while (i <= 10) {//mientas nº sea menor o igual 10 imprime el valor
            System.out.println(i);
            i++; //detente cuando llega a 11
        }
    }

    public static void ejercicio2while() {
        //Imprime los números del 10 al 1
        int i = 10;// inicia variable
        while (i >= 1) {// nº sea mayor o igual 1 imprime valor
            System.out.println(i);
            i--; //detente cuando llegue a 0
        }
    }

    public static void ejercicio3while() {
        //Imprime la suma de los números del 1 al 10.
        int i = 1; //
        int suma = 0;//acumulador
        while (i <= 10) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }

    public static void ejercicio4while() {
        //Imprime los números del 1 al 20 saltando de 2 en 2
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i += 2;// para saltarme dos numeros
        }
    }

    public static void ejercicio5while() {
        //Calcula el factorial del número 8.
        int i = 8;
        int factorial = 1;//inicial factorial en 1

        while ( i > 0) {
            factorial *= i ;// multiplica factorial por nº del 1 al 8
           i--;//incrementa contador en cada iteración
        }
        System.out.println(factorial);
    }

    public static void ejercicio6while() {
        //Genera un número aleatorio entre 1 y 10, y pide al usuario que introduzca un número.
        // Si acierta, imprime un mensaje de éxito.
        // Si no, imprime un mensaje de error y repite infinitamente hasta que acierte.
        int aleatorio = new Random().nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {  // Bucle infinito hasta que acierte
            System.out.println("Introduzca un numero:");
            int numero = sc.nextInt();

            if (numero == aleatorio) {
                System.out.println("Éxito");
                break;  // Sale del bucle cuando acierta
            } else {
                System.out.println("Error");
            }
        }
    }

    public static void ejercicio7while() {
        //Imprime los números divisibles entre 3 que hay entre el 1 y el 50.
        int i = 3;
        while (i <= 50) {
            System.out.println(i);
            i += 3; // sumamos 3 para ir al siguiente visible

        }
    }

    public static void ejercicio8while() {
        //Crea dos variables que contengan un nombre de usuario y una contraseña.
        // Pide al usuario que introduzca nombre y contraseña. Si el usuario o la contraseña son incorrectos,
        // imprime un mensaje de error.
        // Repite infinitamente hasta que el usuario introduzca correctamente el nombre y la contraseña.
        Scanner sc = new Scanner(System.in);

        // Variables con nombre y contranseya
        String usuarioCorrecto = "admin";
        String contrasenyaCorrecta = "1234";

        while (true) {
            System.out.println("Introduzca el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Introduzca la contraseña:");
            String contrasenya = sc.nextLine();

            if (nombre.equals(usuarioCorrecto) && contrasenya.equals(contrasenyaCorrecta)) {
                System.out.println("Éxito");
                break;  // Sale del bucle cuando las credenciales son correctas
            } else {
                System.out.println("Error: Usuario o contraseña incorrectos");
            }
        }
    }
    public static void ejercicio9while() {
        //Modifica el ejercicio anterior para que el usuario solo tenga 3 intentos.
        // Si se llega a los 3 intentos, imprime “Demasiados intentos”.
        Scanner sc = new Scanner(System.in);

        // Variables con nombre y contranseya
        String usuarioCorrecto = "admin";
        String contrasenyaCorrecta = "1234";

        int intentos = 0;
        int maxintentos = 3;

        while (true) {
            System.out.println("Introduzca el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Introduzca la contraseña:");
            String contrasenya = sc.nextLine();

            if (nombre.equals(usuarioCorrecto) && contrasenya.equals(contrasenyaCorrecta)) {
                System.out.println("Éxito");
                break;
            } else {
                intentos++;
                if (intentos < maxintentos) {
                    System.out.println("Error: Usuario o contraseña incorrectos");
                } else {
                    System.out.println("Error: demasiados intentos");
                }
            }
        }
    }
    public static void ejercicio10for() {
        //Imprime los números del 1 al 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void ejercicio11for() {
        //Imprime los números del 10 al 1.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void ejercicio12for() {
        //Imprime la suma de los números del 1 al 10.
        int suma = 0;
        for (int i = 1; i <= 10; i++ ){
            suma += i;
            System.out.println(suma);
        }
    }
    public static void ejercicio13for() {
        //Imprime los números del 1 al 20 saltando de 2 en 2.
        for ( int i = 1; i <= 20 ; i += 2){
            System.out.println(i);
        }
    }
    public static void ejercicio14for() {
        //Calcula el factorial del número 9.
        int factorial = 1;
        for ( int i = 9; i > 0; i --){
            factorial *= i;
            System.out.println(factorial);
        }
    }
    public static void ejercicio15for() {
        //Imprime la tabla de multiplicar del 7.
        for ( int i = 1; i <= 10; i++){
            System.out.println(i * 7);
        }
    }
    public static void ejercicio16for() {
        //Imprime los números pares que hay entre el 1 y el 50.
        for (int i = 2; i <= 50; i += 2){
            System.out.println(i);
        }
    }
    public static void ejercicio17for() {
        //Simula lanzar un dado 6 veces e imprime los resultados.
        for (int i = 1; i <= 6; i++) {
            int aleatorio = new Random().nextInt(6) + 1;
            System.out.println("Lanzamiento " + i + ": " + aleatorio);
        }
    }
    public static void ejercicio18for() {
        //Crea un array con 5 cadenas de texto e imprime cada una de ellas con el formato
        // “Cadena <número>: <texto>”.
        String[] cadenas = {"Alba", "Pepe", "Ana", "Dora", "Manoli"};
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Cadena" + ( i + 1) + ": " + cadenas[i]);
        }


    }
}
