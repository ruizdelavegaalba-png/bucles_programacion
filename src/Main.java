import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio8while();
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
        int numero = 1; // inicia variable
        while (numero <= 10) {//mientas nº sea menor o igual 10 imprime el valor
            System.out.println(numero);
            numero++; //detente cuando llega a 11
        }
    }

    public static void ejercicio2while() {
        //Imprime los números del 10 al 1
        int numero = 10;// inicia variable
        while (numero >= 1) {// nº sea mayor o igual 1 imprime valor
            System.out.println(numero);
            numero--; //detente cuando llegue a 0
        }
    }

    public static void ejercicio3while() {
        //Imprime la suma de los números del 1 al 10.
        int numero = 1; //
        int suma = 0;//acumulador
        while (numero <= 10) {
            suma += numero;
            numero++;
        }
        System.out.println(suma);
    }

    public static void ejercicio4while() {
        //Imprime los números del 1 al 20 saltando de 2 en 2
        int numero = 1;
        while (numero <= 20) {
            System.out.println(numero);
            numero += 2;// para saltarme dos numeros
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
        int numero = 3;
        while (numero <= 50) {
            System.out.println(numero);
            numero += 3; // sumamos 3 para ir al siguiente visible

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

}