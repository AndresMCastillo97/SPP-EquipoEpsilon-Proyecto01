//Proyecto Parcial 1
//Equipo Epsilon
//Nombres, matrículas y carreras de integrantes de equipo:
//Roberto Alain Rivera Bravo | A01411516 | IMT11
//Fabricio Arturo Balboa Cavazos | A01411541 | IMT11
//Andrés de Jesús Martínez Castillo | A01411447 | IMT11
//Jessica Delgado González | A01411536 | IMT11
//Alfredo Alejandro Lárraga Sosa | A01410278 | LMC

package spp.equipoepsilon.proyecto01;
import java.util.Scanner;

public class SPPEquipoEpsilonProyecto01 {

    public static void main(String[] args) {
        //Manda a método menú
        menú();   
    }
    
    //Método menú
    public static void menú(){
        Scanner teclado = new Scanner (System.in);
        //Declaración de variables
        String option;
        
        System.out.println("\n//Calculadora de conversiones// \n");
        System.out.println("\nSeleccione una opción para realizar conversiones \n  ");
        System.out.println("1. Líquidos");
        System.out.println("2. Distancias");
        System.out.println("3. Temperaturas");
        System.out.println("4. Pesos");
        System.out.println("5. Salir");
        option = teclado.nextLine(); 
        
        switch(option){
            case "1":
                System.out.println("\nConversión de líquidos:");
                //Manda a método líquidos
                líquidos();
                //Manda a método salir
                salir();
                break;
            case "2":
                System.out.println("\nConversión de distancias:");
                //Manda a método distancias
                distancias();
                //Manda a método salir
                salir();
                break;
            case "3":
                System.out.println("\nConversión de temperaturas:");
                //Manda a método temperaturas
                temperaturas();
                //Manda a método salir
                salir();
                break;
            case "4":
                System.out.println("\nConversión de pesos:");
                //Manda a método pesos
                pesos();
                //Manda a método salir
                salir();
                break;
            case "5":
                //Manda a método salir
                salir();
                break;
            default:
                System.out.println("\nUsted ha puesto una opción incorrecta, favor de verificar opción deseada");
                //Regresa a método menú
                menú();   
        }
  
    }
    
    //Método salir: da opción de terminar o mandar a menú
    public static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;
        
        System.out.println("\n¿Desea continuar?");
        System.out.println("No: Presione E");
        System.out.println("Sí: Presione cualquier otra tecla\n");
        letra = teclado.nextLine();
        
        //verifica si el String es igual a "E"
        if(letra.equals("E")){
            //termina el programa
            System.exit(0);
        }
        //se ejecuta si el String es distinto de "E"
        else{
            //Se invoca a método menú
            menú();
        }
    }

    //método líquidos
    public static void líquidos (){
        Scanner teclado = new Scanner (System.in);
        double litro, galon;
        String option;
        
        System.out.println("1. Litros a Galones");
        System.out.println("2. Galones a litros");
        option = teclado.nextLine();
        
        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor de litros");
            litro = teclado.nextDouble();
            galon = (litro * 0.26417);
            System.out.println("\n"+litro+" litros equivalen a "+galon+" galones");
        }
        else
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor de galones");
            galon = teclado.nextDouble();
            litro = (galon/ 0.26417);
            System.out.println("\n"+galon+" galones equivalen a "+litro+" litros");
        }
            //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");
        }

    }

    //método distancias 
    public static void distancias(){
        Scanner teclado = new Scanner (System.in);
        String option;
        
        System.out.println("1. Centímetro (cm) a pulgada (in) ");
        System.out.println("2. Metros (m) a pies (ft) ");
        System.out.println("3. Kilómetros (km) a millas (mi)");
        option = teclado.nextLine();
        
        switch(option){
            case "1":
                //manda a método de submenú centímetros/pulgadas
                centimetroPulgada();
                break;
            case "2":
                //manda a método de submenú metros/pies
                metroPie();
                break;
            case "3":
                //manda a método de submenú kilómetros/millas
                kilometroMilla();
                break;
            default:
                //si se lee un string inválido muestra en pantalla que es una opción no válida
                System.out.println("\nOpción no válida");       
        }
    }
    //método de submenú de centímetros a pulgadas
    public static void centimetroPulgada(){
        Scanner teclado = new Scanner (System.in);
        double centimetro, pulgada;
        String option;
        
        System.out.println("\n1. Centímetro a Pulgada");
        System.out.println("2. Pulgada a Centímetro");
        option = teclado.nextLine();
        
        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor de centímetros (cm)");
            centimetro = teclado.nextDouble();
            pulgada = (centimetro/2.54);
            System.out.println("\n"+centimetro+" cm equivalen a "+pulgada+" in");
        }
        else 
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor de pulgadas (in)");
            pulgada = teclado.nextDouble();
            centimetro = (pulgada*2.54);
            System.out.println("\n"+pulgada+" pulgadas equivalen a "+centimetro+" centímetro");
        }
        //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");
        }
    }
    //método de submenú de metros a pies
    public static void metroPie(){
        Scanner teclado = new Scanner (System.in);
        double metro, pie;
        String option;
        
        System.out.println("\n1. Metro a Pie");
        System.out.println("2. Pie a Metro");
        option = teclado.nextLine();

        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor de metros (m)");
            metro = teclado.nextDouble();
            pie = (metro/.3048);
            System.out.println("\n"+metro+" m equivalen a "+pie+" ft");
        }
        else 
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor de pies (ft)");
            pie = teclado.nextDouble();
            metro = (pie*.3048);
            System.out.println("\n"+pie+" ft equivalen a "+metro+" m");
        }
        //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");    
        }
        
    }
    //método de submenú de kilómetros a millas
    public static void kilometroMilla(){
        Scanner teclado = new Scanner (System.in);
        double kilometro, milla;
        String option;
        
        System.out.println("\n1. Kilómetro a Milla");
        System.out.println("2. Milla a Kilómetro");
        option = teclado.nextLine();
        
        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor de kilómetros (Km)");
            kilometro = teclado.nextDouble();
            milla = (kilometro/1.609344);
            System.out.println("\n"+kilometro+" km equivalen a "+milla+" mi");
        }
        else 
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor de pies (ft)");
            milla = teclado.nextDouble();
            kilometro = (milla*1.609344);
            System.out.println("\n"+milla+" mi equivalen a "+kilometro+" km");
        }
        //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");
        }
           
    }

    //método temperaturas
    public static void temperaturas(){
        Scanner teclado = new Scanner (System.in);
        double cent, fahr;
        String option;
        
        System.out.println("1. Centígrados a Fahrenheit");
        System.out.println("2. Fahrenheit a Centígrados");
        option = teclado.nextLine();
        
        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor en grados centígrados (°C)");
            cent = teclado.nextDouble();
            fahr = ((cent*9/5)+32);
            System.out.println("\n"+cent+" °C equivalen a "+fahr+" °F");
        }
        else 
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor en grados fahrenheit (°F)");
            fahr = teclado.nextDouble();
            cent = ((fahr-32)*5/9);
            System.out.println("\n"+fahr+" °F equivalen a "+cent+" °C");   
        }
        //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");
        }
        
    }

    //método pesos
    public static void pesos(){
        Scanner teclado = new Scanner (System.in);
        double gramos, libras;
        String option;
        
        System.out.println("1. Gramos a Libras");
        System.out.println("2. Libras a Gramos");
        option = teclado.nextLine();
        
        //verifica si el valor String es 1, hace la conversión y sale del método
        if(option.equals("1")){
            System.out.println("\nIntroduzca un valor en gramos");
            gramos = teclado.nextDouble();
            libras = (gramos/453.59237);
            System.out.println("\n"+gramos+" gramos equivalen a "+libras+" libras");       
        }
        else 
            //verifica si el valor String es 2, hace la conversión y sale del método
            if(option.equals("2")){
            System.out.println("\nIntroduzca un valor en libras");
            libras = teclado.nextDouble();
            gramos = (libras*453.59237);
            System.out.println("\n"+libras+" libras equivalen a "+gramos+" gramos");
        }
        //muestra opción no válida si String no es 1 o 2 y sale del método
        else{
            System.out.println("\nOpción no válida");
        }
        
    }

           
}
