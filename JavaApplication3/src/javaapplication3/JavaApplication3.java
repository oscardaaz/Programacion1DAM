/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.time.LocalTime;
import java.util.Scanner;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author oscar.domalo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*LocalTime queHoraEs = LocalTime.now();
        System.out.println("Hola");
        System.out.println("La hora actual es " + queHoraEs);*/
      
        /*Scanner datoTeclado = new Scanner(System.in);
        datoTeclado.useLocale(Locale.US);
        
        double valor1;
        double valor2;
        double suma;
        double resta;
        double multiplicacion;
        double division;
        
        // Instancio una lectura de datos por teclado
         
        
        System.out.println("Introduzca un valor entero");       
        valor1 = datoTeclado.nextDouble();
        
        System.out.println("Introduzca otro valor entero");
        valor2 = datoTeclado.nextDouble();
        
        //Sumamos los valores
        
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion = valor1 * valor2;
        division = valor1 / valor2;
        
        System.out.println("La suma resultante es " + suma);
        System.out.println("La resta resultante es " + resta);
        System.out.println("La multiplicacion resultante es " + multiplicacion);
        System.out.println("La division resultante es " + division);*/
        
        /*int a = 5;
        int b;
        int c;
        
        b = a++;
            System.out.println(a);
            System.out.println(b);
        c = ++a;
            System.out.println(a);
            System.out.println(c);*/
        
        
        /*//Declaracion de variables. Declaro una para la edad
        int edadUsuario;
        // instancia del objeto que lee el teclado
        Scanner sc = new Scanner(System.in);
        // Peticion al usuario del dato
        System.out.println("Introduzca su edad ");
        // Recuperacion del dato y volcado en variable creada
        edadUsuario = sc.nextInt();
        //incremento de la edad en 1.
        ++edadUsuario;
        System.out.println("El proximo año cumples " + edadUsuario);*/
        
        
        /*Scanner sc = new Scanner(System.in);
        
        int añoNacimiento;
        int añoActual;
        int edadUsuario;
        
        System.out.println("Introduzca el año de nacimiento ");
        
        añoNacimiento = sc.nextInt();
        System.out.println("Introduzca el año actual ");
        añoActual = sc.nextInt();
        edadUsuario = añoActual - añoNacimiento;
        
        System.out.println("Tu edad es " + edadUsuario);*/
        
        
        /*// Definimos variable numerica maxima para short
        short num = 32767;
        
        System.out.println("El valor maximo de short es " + num);
        //Incrementamos valor de num
        ++num;
        System.out.println("El valor minimo de short es " + num);*/
        
        
        //Nota media  
        /*Scanner sc = new Scanner(System.in);
        
        int nota1;
        int nota2;
        
        System.out.println("Introduzca la nota1 ");
        nota1 = sc.nextInt();
        System.out.println("Introduzca la nota2 ");
        nota2 = sc.nextInt();
        
        double notaMedia;
        notaMedia = (nota1 + nota2)/2.0;
        
        System.out.println("Tu nota media es " + notaMedia);*/
        
        
        /*//Area y Longitud de una circunferencia ACTIVIDAD 1.7 RESUELTA
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double radio;
        double Longitud;
        double Area;
        final double PI = 3.1415;
        
        System.out.println("Introduce el radio en metros");
        radio = sc.nextDouble();
        
        Longitud = 2*PI*radio;
        Area = PI*radio*radio;
        
        System.out.println("La longitud de la circunferencia es " + Longitud + " m");
        System.out.println("El area de la circunferencia es " + Area + " m2");*/  
        
        
        /*//True false mayor de edad, ACTIVIDAD 1.8 RESUELTA
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad actual ");
        int edadActual = sc.nextInt();
        boolean Legal;
        Legal = (edadActual >= 18);
        System.out.println("¿Eres mayor de edad? " + Legal);*/
        
        
        /*//True false numero par, ACTIVIDAD 1.9 RESUELTA
        
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        
        boolean esPar = (numero % 2) == 0;
        System.out.println("¿Tu numero es par? " + esPar);*/
        
        
        /*//ACTIVIDAD 1.10 RESUELTA (OPERADORES LÓGICOS)       
        
        Scanner sc = new Scanner(System.in);
        boolean llueve, tareasAcabadas, necesitaLibro, puedeSalir;
        System.out.println("¿Llueve? (true/false)");
        llueve = sc.nextBoolean();
        System.out.println("¿Has acabado las tareas? (true/false)");
        tareasAcabadas = sc.nextBoolean();
        System.out.println("¿Necesitas ir a la biblioteca? (true/false)");
        necesitaLibro = sc.nextBoolean();
        
        puedeSalir = !llueve && tareasAcabadas||necesitaLibro;
        
        System.out.println("¿Puede salir a la calle? "+ puedeSalir);*/
        
        
        /*//ACTIVIDAD 1.11 RESUELTA
        Scanner sc = new Scanner(System.in);
        final double PRECIO_PERAS = 1.95;
        final double PRECIO_MANZANAS = 2.35;
        
        double kgPeras1, kgManzanas1, kgPeras2, kgManzanas2;
        System.out.println("KGs de Peras semestre 1");
        kgPeras1 = sc.nextDouble();
        
        System.out.println("KGs de Manzanas semestre 1");
        kgManzanas1 = sc.nextDouble();
        
        System.out.println("KGs de peras semestre 2");
        kgPeras2 = sc.nextDouble();
        
        System.out.println("KGs de manzanas semestre 2 ");
        kgManzanas2 = sc.nextDouble();
        
        double totalPeras1 = PRECIO_PERAS * kgPeras1;
        double totalPeras2 = PRECIO_PERAS * kgPeras2;
        double totalManzanas1 = PRECIO_MANZANAS * kgManzanas1;
        double totalManzanas2 = PRECIO_MANZANAS * kgManzanas2;
        double totalPeras= totalPeras1 + totalPeras2;
        double totalManzanas = totalManzanas1 + totalManzanas2;
        double total = totalPeras + totalManzanas;
        System.out.println("Tu beneficio anual de manzanas es " + totalManzanas + "$");
        System.out.println("Tu beneficio anual de peras es " + totalPeras + "$");
        System.out.println("Tu beneficio anual total es " + total + "$");*/
        
        
        //ACTIVIDAD RESUELTA 1.12
        
        /*Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca un numero (negativo o positivo)");
        int numero = sc.nextInt();
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto de tu numero es " + valorAbsoluto);*/
        
        /*//OTRO METODO 1.12;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int valorIntroducido, valorAbsoluto;
        System.out.println("Introduce un numero entero");
        valorIntroducido = sc.nextInt();
        valorAbsoluto = valorIntroducido>0 ? valorIntroducido : -1*valorIntroducido;
        System.out.println("El valor absoluto del numero es " + valorAbsoluto);*/
        
        //ACTIVIDAD RESUELTA 1.13;
        
        /*Scanner sc = new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.println("Introduce la nota del primer trimestre");
        nota1 = sc.nextInt();
        System.out.println("Introduce la nota del segundo simestre");
        nota2 = sc.nextInt();
        System.out.println("Introduce la nota del tercer trimestre");
        nota3 = sc.nextInt();
        double mediaExpediente = (nota1 + nota2 + nota3)/3.0;
        int mediaBoletin = (int)Math.round(mediaExpediente);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La nota media del expediente es " + df.format(mediaExpediente));
        System.out.println("La nota media del expediente es " + mediaExpediente);
        System.out.println("La nota media del boletin es " + mediaBoletin);*/
        
        
        /*//ACTIVIDAD RESUELTA 1.14;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca un numero cualquiera");
        double numero = sc.nextDouble();
        //numero = Math.round(numero);
        
        DecimalFormat num = new DecimalFormat ("#");
        System.out.println("El numero redondeado es " + num.format(numero));
        //System.out.println("tu numero es" + numero);*/
        
                
        /*//ACTIVIDAD 1.18;
        
        //Declaramos las variables usadas
        int hormigas, arañas, cochinillas, totalPatas;
        //Solicitar al usuario los numeros de insectos necesarios.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de hormigas capturadas (6 patas)");
        hormigas = sc.nextInt();
        System.out.println("Introduce el numero  de arañas capturadas ( 8 patas)");
        arañas = sc.nextInt();
        System.out.println("Introduce el numero de cochinilla capturadas ( 14 patas )");
        cochinillas = sc.nextInt();
        //Ponemos la operacion de el total de patas de los insectos
        totalPatas = (hormigas * 6)+(arañas*8) + (cochinillas*14);
        //Escribe en pantalla el numero total de patas
        System.out.println("Tu numero total de patas es " + totalPatas);*/
        
        
        /*Actividad 2.2; Pide un numero por teclado y escribe si es true
        o false si es positivo o no*/
        
        //Declaramos las variables utilizadas;
        /*int numero;
        boolean resultado;
        //Pedimos el dato al usuario;
        System.out.println("Introduzca un numero entero:");
        
        numero = new Scanner(System.in).nextInt();
        resultado = numero>=0?true:false;
        //Mostramos el mensaje al usuario diciendo si es positivo (true) o negativo (false)
        System.out.println("¿El numero introducido es positivo? " + resultado);*/
        
        
        //Actividad 2.3 Introduce 2 numeros y te dice si son iguales, o 0 u no.
        
        /*int numero1, numero2;
        boolean resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero:");
        numero1 = sc.nextInt();
        System.out.println("Introduzca otro numero entero:");
        numero2 = sc.nextInt();
        resultado = (numero1 != numero2) || ((numero1==0) || (numero2==0))?true:false;
        
        System.out.println("¿El numero introducido es igual o 0 " +resultado);*/
        
        
        /*//Actividad resuelta 2.1
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero");
        numero = sc.nextInt();
        if (numero%2 == 0) {
            System.out.println("El numero es par ");}
        else {
            System.out.println("El numero es impar");}*/
        
        
        // Actividad resuelta 2.9 Indica cuantas cifras tiene un numero comprendido.
        
        /*Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero entre 0 y 99.999");
        numero = sc.nextInt();
        if (numero < 10) {
            System.out.println("El numero tiene una cifra (0 a 9)");
        }
        else if (numero < 100) {
            System.out.println("El numero tiene dos cifras (10 a 99)");
        }
        else if (numero < 1000) {
            System.out.println("El numero tiene tres cifras (100 a 999)");
        }
        else if (numero < 10000){
            System.out.println("El numero tiene cuatro cifras (1000 a 9999");
        }
        else if (numero < 100000) {
            System.out.println("El numero tiene cinco cifras (10000 a 99999");
        }
        else if (numero >= 100000) {
            System.out.println("El numero no esta entre los margenes permitidos");
        }*/
            
    
        /*int nota;
        System.out.println("Introduzca la nota (valor entero de 0 a 10)");
        nota = new Scanner(System.in).nextInt();
        switch (nota){
            case 0,1,2,3,4->
                System.out.println("Suspenso, animo ");
                
            case 5->
                System.out.println("Suficiente, vas justito ");
                
            case 6->
                System.out.println("Bien");
                
            case 7,8->
                System.out.println("Notable");
                
            case 9,10->
                System.out.println("Sobresaliente");
                System.out.println("Enhorabuena");
                
            default->
                System.out.println("Nota incorrecta, te dije de 0 a 10");
                
                        
                }*/    
    
        /*Un economista te ha encargado un programa para realizar cálculos con 
        el IVA. La aplicación debe solicitar la base imponible y el IVA que
        se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y el total.*/

        /*double baseImponible;
        double IVA;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##");   

        System.out.println("Introduce el precio imponible");
        baseImponible = sc.nextDouble();

        System.out.println("Introduce el IVA (21 , 10 o 4");
        IVA = sc.nextDouble();

            if (IVA == 21 || IVA == 10 || IVA == 4) {
                System.out.println("El precio del IVA es " + df.format(baseImponible * (IVA/100)));
                System.out.println("Tu precio total es " + df.format((baseImponible * (IVA/100) + baseImponible)));
            }else if (IVA != 21 && IVA != 10){
                System.out.println("Error, el IVA no esta permitido");
            }*/

        /*//Otra forma;
        Scanner sc = new Scanner(System.in); // Creamos el escaner
        
        // Definimos las variables necesarias.
        double baseImponible;
        double IVA;
        sc.useLocale(Locale.US); //Forzamos el uso de decimales con punto en la entrada.
        DecimalFormat df = new DecimalFormat("#.##"); //Forzamos a aproximar a dos decimales.

        System.out.println("Introduce el precio sin IVA"); //Pedimos al usuario el precio.
        baseImponible = sc.nextDouble(); //Metodo de entrada del precio por el usuario.
        
        System.out.println("Introduce el %IVA (21, 10 o 4)"); //Pedimos al usuario el IVA.
        IVA = sc.nextDouble(); //Metodo de entrada del IVA por el usuario.
        //Creamos una condicion para solo aceptar los 3 ivas aceptados.
        if (IVA == 21 || IVA == 10 || IVA == 4) {
            System.out.println("El precio del IVA es " + df.format(baseImponible * (IVA/100)));//Muestra al usuario en pantalla su precio del IVA.
            System.out.println("Tu precio total es " + df.format((baseImponible * (IVA/100) + baseImponible)));//Muestra al usuario en pantalla su precio total.
        }else {
            System.out.println("¡Error, el IVA no esta dentro de los margenes permitidos!");//En caso de iva erroneo, lo comunicamos al usuario.*
        }*/    
            
        /*Escribe un programa que tome como entrada un número entero e indique
        qué cantidad hay que sumarle para que el resultado sea múltiplo de 7.*/

        /*System.out.println("Escribe un numero entero positivo, gracias.");
        int numero = new Scanner(System.in).nextInt();
        int resto = (numero%7);
        
        if (resto == 0){
            System.out.println("Enhorabuena, tu numero es multiplo de 7 ");
        }else
            System.out.println("A tu numero hay que sumarle " + (7-resto));*/        
    
        
        /*Una empresa que gestiona un parque acuático te solicita una aplicación que 
        les ayude a calcular el importe que hay que cobrar en la taquilla 
        por la compra de una serie de entradas (cuyo número será introducido por el 
        usuario). Existen dos tipo de entrada: infantiles, que cuestan 15,50 euros, 
        y de adultos, que cuestan 20 euros.
        En el caso de que el importe total sea igual o superior a 100 euros, 
        se aplicará automáticamente un bono descuento del 5 %.*/

        /*Scanner sc = new Scanner (System.in);//Definimos el escaner.
        DecimalFormat df = new DecimalFormat("#.##");//Forzamos a usar dos decimales.
        //Definimos las variables y constantes a utilizar.
        int entradasAdultos, entradasInfantiles;
        final double precioAdultos = 20;
        final double precioInfantiles = 15.50;
        double total;
        
        System.out.println("Introduce el numero de entradas de adultos.");//Pedimos al usuario el nª de entradas adultas.
        entradasAdultos = sc.nextInt();//Introduce el dato a traves del escaner.

        System.out.println("Introduce el numero de entradas infantiles.");//Pedimos al usuario el nª de entradas infantiles.
        entradasInfantiles = sc.nextInt();//Introduce el dato a traves del escaner.

        total = ((entradasAdultos * precioAdultos) + (entradasInfantiles * precioInfantiles));//Definimos la variable total.
            if (total>=100){//Definimos un condicional, que en caso de que el total sea mayor a 100 euros, aplique un descuento del 5%.
                System.out.println("Tu precio total con descuento del 5% es " + df.format((total * 0.95)) + " euros.");//Mostramos el total al usuario
            }else//Si no se da la condicion anterior, muestra el total directamente sin descuento.
                System.out.println("Tu precio total es " + df.format(total) + " euros.");//Mostramos el total al usuario.*/
    
            
        /*En una granja se compra diariamente una cantidad (comidaDiaria) de comida
        para los animales. El número de animales que alimentar es numAnimales y sabemos 
        que cada animal come kilosPorAnimal.
        Diseñar un programa que pida los datos anteriores al usuario y calcule si 
        hay comida suficiente para todos los animales y en caso contrario mostrar cuántos 
        kilos de ración le corresponderían de media a cada animal. Se debe evitar divisiones por cero.*/

        /*Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##");
        double comidaDiaria, numAnimales, kilosPorAnimal, total;

        System.out.println("Introduce la cantidad de comida comprada hoy en Kgs");
        comidaDiaria = sc.nextDouble();

        System.out.println("Introduce el numero de animales a alimentar");
        numAnimales = sc.nextDouble();

        System.out.println("Introduce los kgs que come cada animal individualmente");
        kilosPorAnimal = sc.nextDouble();

        total = (numAnimales * kilosPorAnimal);
        if (total <= comidaDiaria) {
            System.out.println("Tienes comida de sobra para alimentar a cada animal");
            
        }else {
            System.out.println("No tienes comida suficiente para alimentar a cada animal");
            System.out.println("Tienes que dar a cada animal " + df.format((comidaDiaria/numAnimales)) + " kilogramos de comida");
        }*/
          
        
        /*int num, valorAbsoluto;
        System.out.println("Introduce");
        num = new Scanner(System.in).nextInt();
        /*if (num<0) {
            System.out.println("Tu numero absoluto es " + -(num));
        }
        else {System.out.println("tu numero es " + num);}
        
        valorAbsoluto = (num<0)? -(num) : num;
        System.out.println("Valor absoluto " + valorAbsoluto);*/
        
        
         //Base y altura de un triangulo
        /*Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##");
        double base, altura, area;
            System.out.println("Introduce la base en metros ");
            base = sc.nextDouble();
            System.out.println("Introduce la altura en metros");
            altura = sc.nextDouble();
        
        while (base < 0 || altura < 0){
            System.out.println("Error, solo numeros positivos");
            System.out.println("Introduce de nuevo la base");
            base = sc.nextDouble();
            System.out.println("Introduce de nuevo la altura");
            altura = sc.nextDouble();

                if (base >= 0 && altura >= 0){
                break;
                }}

        area = base * altura / 2;
        System.out.println("Tu area es " + df.format(area) + " metros cuadrados");*/
        
       
        /*Crea un programa que muestre al usuario un par de números aleatorios 
    (entre 1 y 99) y una operación a realizar entre ellos (suma, resta o 
    multiplicación). El programa debe recuperar el cálculo introducido por el 
    usuario e indicar si es correcto o incorrecto, mostrando el valor correcto 
    en caso de fallar el usuario.*/
    
    
        /*Scanner sc = new Scanner(System.in);   
        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        //System.out.println("Estos son tus dos numeros " + num1 + " " + num2);
        int opcionAleatoria = random.nextInt(3);
        int resultado = 0;
        int resultado2;
    
        //System.out.println("Haz esta operacion " + opcionAleatoria);
        switch (opcionAleatoria){
            case 0 -> {
                resultado = num1 + num2;
                System.out.println("Realiza esta operacion " + num1 +" + " + num2);
            }
            case 1 -> {
                resultado = num1 - num2;
                System.out.println("Realiza esta operacion " + num1 +" - " + num2);
            }
            case 2 -> {
                resultado = num1 * num2;
                System.out.println("Realiza esta operacion " + num1 +" * " + num2);
            }
            }
        
        System.out.println("Introduce tu respuesta");
        resultado2 = sc.nextInt();
        
        if (resultado == resultado2){
            System.out.println("Enhorabuena, tu respuesta es correcta");
        }else {
            System.out.println("Tu respuesta es incorrecta");
            System.out.println("La respuesta correcta seria " + resultado);
        }*/
        
        
        /*Diseña una aplicación que, dado un número de DNI (solicitado al usuario), 
        calcule la letra que le corresponde.*/
    
        /*Scanner sc = new Scanner(System.in);
        int dni, calculoLetra;
        System.out.println("Escribe los 8 digitos de tu DNI ");
        dni = sc.nextInt();
        calculoLetra = (dni%22);
        
        char letraDni;
        switch (calculoLetra){
            case 0 -> letraDni = 'T';
            case 1 -> letraDni = 'R';
            case 2 -> letraDni = 'W';
            case 3 -> letraDni = 'A';
            case 4 -> letraDni = 'G';
            case 5 -> letraDni = 'M';
            case 6 -> letraDni = 'Y';
            case 7 -> letraDni = 'F';
            case 8 -> letraDni = 'P';
            case 9 -> letraDni = 'D';
            case 10 -> letraDni = 'X';
            case 11 -> letraDni = 'B';
            case 12 -> letraDni = 'N';
            case 13 -> letraDni = 'J';
            case 14 -> letraDni = 'Z';
            case 15 -> letraDni = 'S';
            case 16 -> letraDni = 'Q';
            case 17 -> letraDni = 'V';
            case 18 -> letraDni = 'H';
            case 19 -> letraDni = 'L';
            case 20 -> letraDni = 'C';
            case 21 -> letraDni = 'K';
            case 22 -> letraDni = 'E';
            default -> letraDni = '?';
        }
        
        System.out.println("Tu letra del DNI es " +letraDni);
        System.out.println("Tu DNI completo seria " + dni + letraDni);*/
        
        
        /*Escribe una aplicación que solicite al usuario un número comprendido 
        entre 0 y 9999. La aplicación tendrá que indicar si el número 
        introducido es capicúa.*/
        
        /*Scanner sc = new Scanner(System.in);
        int num, a4, b3, c2, d1;
        System.out.println("Introduce un numero de 4 digitos");
        num = sc.nextInt();
            
            if (num<10000 && num>999){
            a4 = (num%10);
                //System.out.println("asd"+ a4);
            b3 = ((num - a4) / 10)%10;
                //System.out.println("as" + b3);
            int num3 = ((num - a4) / 10);
            c2 = ((num3 - b3)/10)%10;
                //System.out.println("asc" + c2);
            int num4 = ((num3 - b3)/10);
                d1 = ((num4 - c2)/10)%10;
                //System.out.println("asd"+ d1);
                    if (a4 == d1 && b3 == c2){
                        System.out.println("Enhorabuena, tu numero es capicua");
                    }else System.out.println("Tu numero no es capicua");
            }else System.out.println("Tu numero introducido es erroneo, introduce uno de 4 digitos");*/
        
        
        //Actividad 3.1    
        /*Diseña una aplicacion que muestre la edad maxima y minima de un grupo de 
        alumnos. El usuario introducira las edades y terminara escribiendo -1.*/
        
        /*int edad,max,min;
        max = 0;
        min = 100;
        edad = 0;
        Scanner sc = new Scanner(System.in); 
        while (edad!= -1){
            System.out.println("Introduce la edad del alumno:");
            edad = sc.nextInt();
            if (edad > max && edad != -1) max = edad;
            if (edad < min && edad != -1) min = edad;
            }
        if (max == 0) System.out.println("No se ha introducido ninguna edad");
        else    System.out.println("Edad max: "+max + " Edad min: " + min);*/
        
        //Actividad resuelta 3.1
        /*Diseñar un programa que muestre si el numero es par, positivo y su cuadrado,
        se para cuando es introducido 0*/

        /*int numero = 1 , cuadrado;
        boolean par, positivo;
        Scanner sc = new Scanner(System.in);

        while (numero != 0) {    
        System.out.println("Introduzca un numero");
        numero = sc.nextInt();
        par = numero%2 == 0;
        positivo = (numero >= 0);
        cuadrado = (int)Math.pow(numero,2);
        System.out.println("El numero es par; " +par+ " El numero es positivo " 
                + positivo+ " Su cuadrado es: " + cuadrado);*/
    
        
        /*Programa que muestra la suma de todas las edades, media, numero de
        alumnos y cuantos son mayores de edad. Hasta meter un numero negativo.*/

        /*int edad = 0, numAlumnos = 0, sumaEdades = 0, mayores18 = 0;
        double media;
        edad = 0;
        Scanner sc = new Scanner(System.in);
        while (edad >= 0){
            System.out.println("Introduzca la edad");
            edad=sc.nextInt();
            if (edad >= 0){
            ++numAlumnos;
            sumaEdades += edad;
            mayores18 = edad>=18 ? mayores18+1: mayores18;
        }}
            media = sumaEdades/numAlumnos*1.0;
            System.out.println("Suma edades: " +sumaEdades);
            System.out.println("Media: " + media);
            System.out.println("Numero de alumnos: " + numAlumnos);
            System.out.println("Mayores de edad: " + mayores18);*/
        
        
        /*El programa genera u numero entre 1 y 100 y el usuario tiene que 
        adivinarlo. En cada intento el programa debe informar si el numero 
        es mayor  o menor al indicado por el usuario. El programa termina
        cuando el usuario acierta o cuando se rinde informando el valor -1.
        */
        
        /*Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(101);
        int numeroUsuario = 2000;
        System.out.println("¿Que numero es?");
            while (numeroUsuario != numero && numeroUsuario != -1){
        
            numeroUsuario = sc.nextInt();
                if (numeroUsuario > numero && numeroUsuario != -1)System.out.println("Tu numero es menor, prueba de nuevo ");
                else if (numeroUsuario < numero && numeroUsuario != -1)System.out.println("Tu numero es mayor, prueba de nuevo ");
               
            }   
        if (numeroUsuario == numero){
        System.out.println("Enhorabuena tu numero coincide");
        System.out.println("Tu numero era el " + numero);
        }else if (numeroUsuario == -1){
            System.out.println("Oh no te has rendido, buena suerte la proxima vez");
        }*/
    
        
        /*Programa que calcula el valor mas alto de los introducidos por el usuario
        y devuelve dicho valor yel identificador correlativo asociado.
        La introduccion de valores acaba cuando se informa un -1.*/
        
        /*Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int identificador = 0, identificadorMax = 0;
        double altura = 0.0, alturaMax = 0;
        while(altura != -1.0){
            System.out.println("Introduzca la altura del arbol " + identificador+ ": ");
            altura = sc.nextDouble();
            if (altura > alturaMax && altura != -1.0){
                    alturaMax = altura;
                    identificadorMax = identificador;
            }        
            identificador++;
            
        }
        System.out.println("");
        System.out.println("El arbol mas alto es el numero " + identificadorMax + 
                " que mide " + alturaMax);*/
        
        
        /*Programa que muestra al usuario dos número aleatorios entre 1 y 100
        y espera que los sume. El usuario introduce la suma de los números y
        en caso de acertar, se proponen otros números. En caso contrario, el 
        programa termina mostrando el número de operaciones realizadas correctamente*/

        /*Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1, num2, suma;
        suma = 0;
        int contador = 0;
        int numUsuario = 0;
    
        while (numUsuario == suma){
            num1 = rand.nextInt(101);
            num2 = rand.nextInt(101);
            suma = num1 + num2;
                System.out.println("Introduzca la suma de " +num1+ " y "+ num2);
                numUsuario = sc.nextInt();
                if (numUsuario == suma){
                    System.out.println("Has acertado. Continua el juego");
                    contador++;
                }else{
                    System.out.println("Has fallado. Número de operaciones "
                            + "correctas: " + contador);
                }}*/
        
        //Otra forma con do - while
        
        /*Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num1, num2, suma;
        
        int contador = 0;
        int numUsuario;
    
        do{
            num1 = rand.nextInt(101);
            num2 = rand.nextInt(101);
            suma = num1 + num2;
                System.out.println("Introduzca la suma de " +num1+ " y "+ num2);
                numUsuario = sc.nextInt();
                if (numUsuario == suma){
                    System.out.println("Has acertado. Continua el juego");
                    contador++;
                }else{
                    System.out.println("Has fallado. Número de operaciones "
                            + "correctas: " + contador);
                }
                }while (numUsuario == suma);*/
        
        
        /*Escribe una aplicación que solicite al usuario un número comprendido 
        entre 0 y 9999. La aplicación tendrá que indicar si el número 
        introducido es capicúa.*/
        
        /*Scanner sc = new Scanner(System.in);//Creamos el escaner para introducir por teclado
        int num, a4, b3, c2, d1; // Creamos las variables necesarias
        System.out.println("Introduce un numero de entre el 0 y el 9999");//Pedimos al usuario el numero
        num = sc.nextInt(); //Definimos la variable num como una entrada de teclado
        
        if (num>=0 && num<=9999){//Establecemos el rango de valores necesario
            
            if (num<10000 && num>999){//Creamos un rango de valores para comparar los numeros con sus modulos.
            //A partir del modulo y operaciones sacamos los valores individuales de ese numero
            a4 = (num%10);
            b3 = ((num - a4) / 10)%10;
            int num3 = ((num - a4) / 10);
            c2 = ((num3 - b3)/10)%10;
            int num4 = ((num3 - b3)/10);
                d1 = ((num4 - c2)/10)%10;
                    if (a4 == d1 && b3 == c2){//Comparamos los digitos del numero entre si para determinar si es capicua
                        System.out.println("Enhorabuena, tu numero es capicua!");//Si es capicua
                    }else System.out.println("Tu numero no es capicua!");//Si no es capicua
            }
            if (num>99 && num<1000){//Creamos otro rango de valores para comparar los numeros con sus modulos.
                //A partir del modulo y operaciones sacamos los valores individuales de ese numero
                a4 = (num%10);
                b3 = ((num - a4) / 10)%10;
                int num3 = ((num - a4) / 10);
                c2 = ((num3 - b3)/10)%10;
                if (a4 == c2){//Comparamos los digitos del numero entre si para determinar si es capicua
                    System.out.println("Enhorabuena, tu numero es capicua!");//Si es capicua
                }else System.out.println("Tu numero no es capicua!");//Si no es capicua
            }
            
            if (num<100 && num>9){//Creamos otro rango de valores para comparar los numeros con sus modulos.
                a4 = (num%10);
                b3 = ((num - a4) / 10)%10;
                    if (a4 == b3){//Comparamos los digitos del numero entre si para determinar si es capicua
                        System.out.println("Enhorabuena, tu numero es capicua!");//Si es capicua
                    }else System.out.println("Tu numero no es capicua!");//Si no es capicua
                }
                
            if (num<10 && num >= 0){//Definimos otro rango, aunque en este todos los numeros son capicua.
                System.out.println("Enhorabuena, tu numero es capicua!");
                }}
            else System.out.println("Error, introduce un numero del 0 al 9999");//Si introduces un numero fuera del rango original 0 a 9999.*/       
        
        
        /*Programa que saca por consola la palabra Eco tantas veces 
        como indicadas por el usuario entre 1 y 10? o inf*/
        
        /*System.out.println("¿Cuantas veces quieres que repita 'Eco'? "); 
        int repeticion = new Scanner(System.in).nextInt();
        int j=1;
        
            for (int i=1; i<=repeticion; i++){
            System.out.println("Eco...");
            }
            
            while (j<=repeticion){
            
            System.out.println("Eco... while");
            j++;
            }*/
        
        
        /*Programa que muestre los números del 1 al número indicado*/
        
        /*System.out.println("Dime un número");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("");
        
        for (int i=1; i<= numero;i++){
            System.out.println(i);
        }
        
        for (int i = numero; i >= 1;i--){
            System.out.println(i);
        }  */
        
        
        /*Programa que pide 10 numeros enteros y muestra la media*/
        
        /*int numero, suma = 0;
        double media = 0;
        
        System.out.println("Dime 10 numeros y te muestro la media: ");
        Scanner sc = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat("#.#"); 
        for (int i = 1; i<=10; i++){
                
                numero = sc.nextInt();
                suma += numero;
            }
        media = suma/10.0;
        System.out.println("Tu media es " + media);*/
        
        
        /*Programa que muestra la suma de los 10 primeros numeros impares*/
        
        /*int suma = 0, contadorImpares = 0;
        System.out.println("Se muestra la suma de los 10 primeros números impares");
        
        for(int i=1; i<=100; i++){
            if(i%2 != 0){
                suma += i;
                contadorImpares++;
                System.out.println(i);
            }
            if(contadorImpares ==10){
                break;
        }
    }
        System.out.println("La suma es: " + suma);*/
        
        
        
        /*Escribe un programa que solicite al usuario un número entre 1 y 99 y 
        mostrarlo con letras. Ejemplo: 56 -> mostraría "cincuenta y seis".*/
        
        /*System.out.println("Introduce un numero entre el 1 y el 99");//Pedimos al usuario el numero
        int numero = new Scanner(System.in).nextInt(); //Declaramos la variable numero como un escaner
        
            switch (numero) {//Definimos dependiendo el numero introducido la respuesta del 1 al 99
                case 1 -> System.out.println("Uno");
                case 2 -> System.out.println("Dos");
                case 3 -> System.out.println("Tres");
                case 4 -> System.out.println("Cuatro");
                case 5 -> System.out.println("Cinco");
                case 6 -> System.out.println("Seis");
                case 7 -> System.out.println("Siete");
                case 8 -> System.out.println("Ocho");
                case 9 -> System.out.println("Nueve");
                case 10 -> System.out.println("Diez");
                case 11 -> System.out.println("Once");
                case 12 -> System.out.println("Doce");
                case 13 -> System.out.println("Trece");
                case 14 -> System.out.println("Catorce");
                case 15 -> System.out.println("Quince");
                case 16 -> System.out.println("Dieciseis");
                case 17 -> System.out.println("Diecisiete");
                case 18 -> System.out.println("Dieciocho");
                case 19 -> System.out.println("Diecinueve");
                case 20 -> System.out.println("Veinte");
                case 21 -> System.out.println("Veintiuno");
                case 22 -> System.out.println("Veintidos");
                case 23 -> System.out.println("Veintitres");
                case 24 -> System.out.println("Veinticuatro");
                case 25 -> System.out.println("Veinticinco");
                case 26 -> System.out.println("Veintiseis");
                case 27 -> System.out.println("Veintisiete");
                case 28 -> System.out.println("Veintiocho");
                case 29 -> System.out.println("Veintinueve");
                case 30 -> System.out.println("Treinta");
                case 31 -> System.out.println("Treinta y uno");
                case 32 -> System.out.println("Treinta y dos");
                case 33 -> System.out.println("Treinta y tres");
                case 34 -> System.out.println("Treinta y cuatro");
                case 35 -> System.out.println("Treinta y cinco");
                case 36 -> System.out.println("Treinta y seis");
                case 37 -> System.out.println("Treinta y siete");
                case 38 -> System.out.println("Treinta y ocho");
                case 39 -> System.out.println("Treinta y nueve");
                case 40 -> System.out.println("Cuarenta");
                case 41 -> System.out.println("Cuarenta y uno");
                case 42 -> System.out.println("Cuarenta y dos");
                case 43 -> System.out.println("Cuarenta y tres");
                case 44 -> System.out.println("Cuarenta y cuatro");
                case 45 -> System.out.println("Cuarenta y cinco");
                case 46 -> System.out.println("Cuarenta y seis");
                case 47 -> System.out.println("Cuarenta y siete");
                case 48 -> System.out.println("Cuarenta y ocho");
                case 49 -> System.out.println("Cuarenta y nueve");
                case 50 -> System.out.println("Cincuenta");
                case 51 -> System.out.println("Cincuenta y uno");
                case 52 -> System.out.println("Cincuenta y dos");
                case 53 -> System.out.println("Cincuenta y tres");
                case 54 -> System.out.println("Cincuenta y cuatro");
                case 55 -> System.out.println("Cincuenta y cinco");
                case 56 -> System.out.println("Cincuenta y seis");
                case 57 -> System.out.println("Cincuenta y siete");
                case 58 -> System.out.println("Cincuenta y ocho");
                case 59 -> System.out.println("Cincuenta y nueve");
                case 60 -> System.out.println("Sesenta");
                case 61 -> System.out.println("Sesenta y uno");
                case 62 -> System.out.println("Sesenta y dos");
                case 63 -> System.out.println("Sesenta y tres");
                case 64 -> System.out.println("Sesenta y cuatro");
                case 65 -> System.out.println("Sesenta y cinco");
                case 66 -> System.out.println("Sesenta y seis");
                case 67 -> System.out.println("Sesenta y siete");
                case 68 -> System.out.println("Sesenta y ocho");
                case 69 -> System.out.println("Sesenta y nueve");
                case 70 -> System.out.println("Setenta");
                case 71 -> System.out.println("Setenta y uno");
                case 72 -> System.out.println("Setenta y dos");
                case 73 -> System.out.println("Setenta y tres");
                case 74 -> System.out.println("Setenta y cuatro");
                case 75 -> System.out.println("Setenta y cinco");
                case 76 -> System.out.println("Setenta y seis");
                case 77 -> System.out.println("Setenta y siete");
                case 78 -> System.out.println("Setenta y ocho");
                case 79 -> System.out.println("Setenta y nueve");
                case 80 -> System.out.println("Ochenta");
                case 81 -> System.out.println("Ochenta y uno");
                case 82 -> System.out.println("Ochenta y dos");
                case 83 -> System.out.println("Ochenta y tres");
                case 84 -> System.out.println("Ochenta y cuatro");
                case 85 -> System.out.println("Ochenta y cinco");
                case 86 -> System.out.println("Ochenta y seis");
                case 87 -> System.out.println("Ochenta y siete");
                case 88 -> System.out.println("Ochenta y ocho");
                case 89 -> System.out.println("Ochenta y nueve");
                case 90 -> System.out.println("Noventa");
                case 91 -> System.out.println("Noventa y uno");
                case 92 -> System.out.println("Noventa y dos");
                case 93 -> System.out.println("Noventa y tres");
                case 94 -> System.out.println("Noventa y cuatro");
                case 95 -> System.out.println("Noventa y cinco");
                case 96 -> System.out.println("Noventa y seis");
                case 97 -> System.out.println("Noventa y siete");
                case 98 -> System.out.println("Noventa y ocho");
                case 99 -> System.out.println("Noventa y nueve");
                default -> System.out.println("El numero no esta entre el rango comprendido");
            }*/
        
        
        /*Media de diez numeros enteros ejercicio libro nose cuantos ya*/
        
        /*int numero, suma = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca diez numeros enteros");
        for (int i=1; i<11 ; i++){
            System.out.println("Introduzca el numero "+i+": ");
            numero = sc.nextInt();
            suma += numero;    
        }
        media = suma/10.0;
        System.out.println("Tu media es: " + media);*/
        
        
        //Tabla de multiplicar:
        /*int numero;
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Introduzca un numero comprendido entre 1 y 10");
                numero = sc.nextInt();
                
            
            }while (numero>10 || numero<1);
            System.out.println("La tabla de multiplicar del numero " + numero + " es:");
            for(int i=1; i<=10;i++){
                
                System.out.println(numero + " x " +i+" = " + numero*i);*
            } */
        
        
        /*int resultado = 0, numeroImpar;
        System.out.println("Lista de los 10 primeros numeros impares");
        
        for(int i=1;i<=10;i++){
            numeroImpar=2*i-1;
            resultado +=numeroImpar;
            System.out.println("Numero "+i+": "+numeroImpar);
        }
          System.out.println("La suma de los 10 primeros numeros impares es " + resultado);*/
        
        
        /*El programa le pide al usuario la longitud  de la pista,
        que debe estar entre 200 y 800 metros.
        Luego pide los nombres de los dos atletas que compiten.
        La posicion de cada atleta se calcula con una funcion random,
        que devuelve un valor entre 1 y 10.
        El programa debe mostrar la posicion de cada atleta a lo largo 
        de la carrera e indicar el atleta ganador, o si ha habido empate
        */
        
        //Declaracion de variables a utilizar
        /*Scanner sc = new Scanner(System.in);
        int longPista, posAt1=0, posAt2=0;
        String nombreAt1, nombreAt2;
        Random rd = new Random();
        //Solicitamos al usuario la longitud de la pista
        do{
            System.out.println("Introduzca longitud de pista (200 a 800):");
            longPista = sc.nextInt();
        }while (longPista<200 || longPista>800); 

        //Solicitamos al usuario los nombres de los atletas
        System.out.println("Introduce el nombre del primer atleta");
        nombreAt1 = sc.next();
        System.out.println("Introduce el nombre del segundo atleta");
        nombreAt2 = sc.next();
        
        do{ 
            posAt1 += rd.nextInt(10);
            System.out.println("Posicion del atleta " +nombreAt1+ ": " + posAt1);
            posAt2 += rd.nextInt(10);
            System.out.println("Posicion del atleta " +nombreAt2+ ": " + posAt2);
            
        }while(posAt1<longPista && posAt2<longPista);
        
        if (posAt1 == posAt2)System.out.println("Ha habido empate");
        else if (posAt1>posAt2) System.out.println("Ha ganado " +nombreAt1+".");
        else System.out.println("Ha ganado "+nombreAt2+ ".");*/
        
        
         /*Implementa un programa que pida al usuario un numero positivo y lo 
        muestre guarismo a guarismo. Por ejemplo, para el numero 123, debe mostrar 
        primero el 3, a continuacion el 2 y por ultimo el 1.*/


        /*Scanner sc = new Scanner(System.in);
        String numero;
        int tamañoNumero;
        System.out.println("Introduzca un numero positivo: ");
        numero = sc.nextLine();
        tamañoNumero = numero.length();
        for (int i = tamañoNumero-1; i>=0;i--){
            System.out.println(numero.charAt(i));
        }*/
        
        
        /*Calculo de nota y si hay suspensos*/
        
        /*double nota;
        int numeroSuspensos=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la calificacion de 5 alumnos: ");
        for (int i=1; i<=5; i++){
            System.out.print("Nota del alumno "+i+": ");
            nota = sc.nextDouble();
            if (nota<5){
                numeroSuspensos++;
            }
        }
        if (numeroSuspensos>=1){
            System.out.println("Numero de alumnos suspensos: "+numeroSuspensos);
        }else if (numeroSuspensos == 1){
            System.out.println("Hay un suspenso");
        }else System.out.println("Estan todos aprobados");*/
        
        
        /*Pedir un numero entero y que calcule el factorial de este*/
    
    
        /*Scanner sc = new Scanner(System.in);
        int numero;
        int factorial=1;
        System.out.println("Introduzca un numero positivo: ");
        numero = sc.nextInt();
        
        for (int i = numero; i>0;i--){
            factorial *=i;
        }
        System.out.println("El factorial de "+numero+" es "+factorial); */
        
        
        /*Calculo de nota y si hay suspensos*/
        
        /*double nota;
        int numeroSuspensos=0, numeroCondicionados=0,numeroAprobados=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la calificacion de 6 alumnos: ");
        for (int i=1; i<=6; i++){
            System.out.print("Nota del alumno "+i+": ");
            nota = sc.nextDouble();
            if (nota<4){
                numeroSuspensos++;
                
            }else if (nota>=4 && nota<5){
            numeroCondicionados++;
            
            }else numeroAprobados++;
        }    
        
            System.out.println("Numero de alumnos aprobados: "+numeroAprobados);
            System.out.println("Numero de alumnos condicionados: "+numeroCondicionados);
            System.out.println("Numero de alumnos suspensos: "+numeroSuspensos);*/
        
        
        //Triamgulo rectangulo
        
        /*int numeroElementos;
        System.out.println("Introduzca el numero de elementos del lado"
                + " del triangulo rectangulo");
        numeroElementos = new Scanner(System.in).nextInt();
        
        for(int i = numeroElementos; i>0;i--){
            for (int j=i; j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }*/
        
        //Triamgulo rectangulo invertido
        
        /*int numeroElementos;
        System.out.println("Introduzca el numero de elementos del lado"
                + " del triangulo rectangulo");
        numeroElementos = new Scanner(System.in).nextInt();
        
        for(int i = 1; i<=numeroElementos;i++){
            for (int j=i; j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }*/
        
        
        /*Realiza un programa que convierta un número decimal en su 
        representación binaria. Hay que tener en cuenta que desconocemos 
        cuántas cifras tiene el número que introduce el usuario. Por 
        simplicidad, iremos mostrando el número binario con un dígito por línea.*/
        
        /*Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número decimal
        System.out.print("Introduce un numero entero: ");
        int numeroDecimal = scanner.nextInt();

        // Convertir el número decimal a binario
        String binario = Integer.toBinaryString(numeroDecimal);

        // Mostrar cada dígito del número binario en una línea separada
        for (char digito : binario.toCharArray()) {
            System.out.println(digito);
        }*/
        
        
        /*Escribe un programa que incremente la hora de un reloj. Se pedirá por 
        teclado la hora, minutos y segundos, así como cuántos segundos 
        se desea incrementar  la hora introducida. La aplicación mostrará la 
        nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, 
        resultan las 14:00:01.*/
        
        /*Scanner scanner = new Scanner(System.in);
        int hora, minutos,segundos;
        // Solicitar hora, minutos y segundos
        do {
            System.out.print("Introduce la hora (0-23): ");
            hora = scanner.nextInt();

            System.out.print("Introduce los minutos (0-59): ");
            minutos = scanner.nextInt();

            System.out.print("Introduce los segundos (0-59): ");
            segundos = scanner.nextInt();
                if (hora>23 || hora<0 || minutos>59 || minutos<0 || segundos>59 || segundos<0){
                    System.out.println("Error, introduce los datos dentro de los margenes permitidos");    
                }
        }while(hora>23 || hora<0 || minutos>59 || minutos<0 || segundos>59 || segundos<0);
                
        // Solicitar los segundos a incrementar
        System.out.print("Introduce cuantos segundos deseas incrementar: ");
        int incrementoSegundos = scanner.nextInt();
        
        // Sumar los segundos
        segundos += incrementoSegundos;

        // Calcular minutos y horas
        minutos += segundos / 60;
        segundos %= 60; // Resto para obtener segundos

        hora += minutos / 60;
        minutos %= 60; // Resto para obtener minutos

        hora %= 24; // Ajustar horas a formato 24

        // Mostrar la nueva hora
        System.out.printf("La nueva hora es: %02d:%02d:%02d%n", hora, minutos, segundos);*/
        
        
        //Solicita al usuario un número y dibuja un triángulo de base y altura n
        
      
        /*int elementos;
        System.out.println("Introduce el numero de elementos de tu triangulo equilatero");
        
        elementos = new Scanner(System.in).nextInt();
            for (int i=1;i<=elementos;i++){
                for (int k=elementos-i;k>0;k--){
                    System.out.print(" ");
                }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
                }
                System.out.println("");
            }*/
        
        //Otra forma con codigo optimizado:
        
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de elementos de tu triangulo equilatero:");

        int elementos = scanner.nextInt();

        for (int i = 1; i <= elementos; i++) {
            // Imprimir espacios
            System.out.print(" ".repeat(elementos - i));
            // Imprimir asteriscos
            System.out.print("* ".repeat(i));
            // Nueva línea
            System.out.println();
        }*/
    
    
    }       
}
        
        
       
        

    
    

