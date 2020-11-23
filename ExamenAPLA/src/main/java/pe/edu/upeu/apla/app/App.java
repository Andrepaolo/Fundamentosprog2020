package pe.edu.upeu.apla.app;

import java.io.Console;

import pe.edu.upeu.apla.Examen.EjercicioNumPerfecto;
import pe.edu.upeu.apla.utils.LeerTeclado;
import pe.edu.upeu.apla.Examen.Ejerciciotablas;
import pe.edu.upeu.apla.Examen.Ejercicio4;



public class App {
    
    static EjercicioNumPerfecto numperf=new EjercicioNumPerfecto();
    static Ejerciciotablas tabla=new Ejerciciotablas();
    static LeerTeclado teclado=new LeerTeclado();
    static Console cons=System.console();
    static Ejercicio4 poten=new Ejercicio4();
    static void menuOpciones(){

        System.out.println( "*********************Bienvenidos al Sistema********************" );
        
        char opcion='S';
        int numeroAlgoritmo=1;
        do{
            String datos="Seleccion la opción que desea:\n"+
            "1=Ejercicio1\n"+ 
            "2=Ejercicio2\n"+
            "3=Ejercicio3\n ";


            numeroAlgoritmo=teclado.leer(0, datos);
            switch(numeroAlgoritmo){
                 case 1: numperf.Respuesta();;break;
                 case 2: tabla.Respuesta2();;break;
                 case 3: poten.Respuesta4();;break;
                 default : System.out.println("La opción que selecciono no existe"); 
            }
            opcion=teclado.leer(' ', " Desea probar otras opciones? SI=S, NO=N");
        }while(opcion=='S' || opcion=='s');

    }

    static boolean login(){
        String usuario=teclado.leer("", "Ingrese el Usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=cons.readPassword();
        if(usuario.equals("andrela") && String.valueOf(clave).equals("123456")){
            menuOpciones();
            return true;
        }else{ 
            System.err.println("Intente Nuevamente ...!!!");
            login();
            return false;}        
    }


    public static void main( String[] args ){        
        System.out.println("-----Ingrese su usuario y clave para acceder al Sistema---");
        login();

    }

    }

    
    

