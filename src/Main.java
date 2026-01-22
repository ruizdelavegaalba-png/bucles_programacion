import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ejercicio27foreach();

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
        int i = 1;
        while (i <= 50) {
           if ( i % 3 == 0){
                System.out.println(i);
            }
           i++;
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
        for ( int i = 9; i > 1; i --){
            factorial *= i;
            System.out.println(factorial);
        }
    }
    public static void ejercicio15for() {
        //Imprime la tabla de multiplicar del 7.
        for ( int i = 1; i <= 10; i++){
            System.out.println("7 x " + i + "-" + (i * 7));
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
            int dado = new Random().nextInt(6) + 1;
            System.out.println("Lanzamiento " + i + ": " + dado);
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
    public static void ejercicio19foreach() {
        //Crea un array con 5 cadenas de texto e imprime cada una de ellas.
        String[] cadenas = {"Alba", "Pepe", "Ana", "Dora"};
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("Cadena" + ( i + 1) + ": " + cadenas[i]);
        }
    }
    public static void ejercicio20foreach() {
        //Crea un array con 5 números enteros e imprime la suma de todos ellos.
        Integer[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println(suma);
    }
    public static void ejercicio21foreach() {
        //Crea un ArrayList con 5 números decimales e imprime la media
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        int suma= 0;
        for (double numero : numeros) {
            suma += numero;
        }
        double media = suma/numeros.size();
        System.out.println(media);
    }
    public static void ejercicio22foreach() {
        //Crea un ArrayList con 5 números enteros e imprime cuántos son pares y cuántos son impares.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        int par = 0;
        int impar=0;
        for (int n : numeros){
            if (n % 2 == 0) {
                par++;
            }else  {
                impar++;
            }
        }
        System.out.println("Pares:" + par);
        System.out.println("Impares:" + impar);
    }
    public static void ejercicio23foreach() {
        //Crea un array con 5 nombres,
        // pide al usuario que introduzca un nombre e imprime si
        // el nombre está o no en el array.
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alba");
        nombres.add("Pepe");
        nombres.add("Ana");
        nombres.add("Dora");
        nombres.add("Manoli");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombrelista = sc.nextLine();
        boolean existe = false;
        for (String nombre : nombres) {
            if (nombre.equals(nombrelista)) {
                existe = true;
                break;

            }
        }
        if (existe) {
            System.out.println("El nombre existe");
        }else  {
            System.out.println("El nombre no existe");
        }
    }
    public static void ejercicio24foreach() {
        //Crea un HashSet con 5 palabras e imprime cuál es más larga.
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Alba");
        nombres.add("Pepe");
        nombres.add("Ana");
        nombres.add("Dora");
        nombres.add("Manoli");
        String nombrelargos = "";
        for(String nombre : nombres) {
            if(nombre.length() > nombrelargos.length()) {
                nombrelargos = nombre;
            }
        }
        System.out.println("El nombre mas largo es: " +  nombrelargos);
    }
    public static void ejercicio25foreach() {
        //Crea un HashMap con 5 nombres y notas, e
        // imprime quién tiene la nota más baja y quién tiene la nota más alta.
        // Imprime también la nota media.
        HashMap<String, Double> nombres = new HashMap<>();
        nombres.put("Alba", 1.0);
        nombres.put("Pepe", 2.0);
        nombres.put("Ana", 3.0);
        nombres.put("Dora", 4.0);
        nombres.put("Manoli", 5.0);
        double notaalta = 5.0;
        double notabaja = 1.0;
        double media = 0;
        for (String nombre : nombres.keySet()) {
            if (nombres.get(nombre).equals(nombre)) {
                notaalta++;
            }else if (nombres.get(nombre).equals(nombre)) {
                notabaja++;
            }
        }
        double notamedia = media / nombres.size();
        System.out.println("La nota mas alta es: " + notaalta);
        System.out.println("La nota mas abaja es: " + notabaja);
        System.out.println("La media es: " + media);
    }
    public static void ejercicio26foreach() {
        //Crea un HashMap con 5 productos y precios,
        // e imprime la lista completa pero sumándole el IVA (21%)
        // al precio de cada producto.
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Alba", 1.0);
        productos.put("Pepe", 2.0);
        productos.put("Ana", 3.0);
        productos.put("Dora", 4.0);
        productos.put("Manoli", 5.0);
        double precioiva = 0.21;
        for(String producto : productos.keySet()) {
           double precio = productos.get(producto);
           double preciofinal = precio * (precioiva + 1.0);
            System.out.println("Precio final: " + preciofinal);
        }
    }
    public static void ejercicio27foreach() {
        //Crea un HashMap con 5 nombres y años de nacimiento,
        // e imprime cuántos son mayores de edad y quiénes son.
        HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Alba", 11);
        personas.put("Pepe", 22);
        personas.put("Ana", 13);
        personas.put("Dora", 24);
        personas.put("Manoli", 15);
        int ANIO_ACTUAL = 2026;
        final int MAYORIA_EDAD = 18;
        int contadorMayores = 0;
        System.out.println("Personas mayores de edad:");

        for (String nombre : personas.keySet()) {
            int anioNacimiento = personas.get(nombre);
            int edad = ANIO_ACTUAL - anioNacimiento;

            if (edad >= MAYORIA_EDAD) {
                System.out.println("- " + nombre + " (edad: " + edad + " años)");
                contadorMayores++;
            }
        }
    }
}
