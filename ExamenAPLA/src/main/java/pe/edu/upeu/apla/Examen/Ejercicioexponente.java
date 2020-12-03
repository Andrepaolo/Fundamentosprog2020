package pe.edu.upeu.apla.Examen;

import java.util.Scanner;


public class Ejercicioexponente {
    
    public int potenciax (int numero1, int numero2){
        int potencia= (int) Math.pow(numero1, numero2);
        return potencia; 


    }        
    public void imprimirpotencia(int n1){
    System.out.print("La potencia es: "+ n1);

}
       
public void Respuesta4(){
    Scanner teclado =new Scanner (System.in);
    System.out.print (" Ingrese la base: ");
    int n1= teclado.nextInt();
    System.out.print (" Ingrese el exponente: ");
    int n2= teclado.nextInt();
     
    Ejercicioexponente result= new Ejercicioexponente();
    int potenciar=result.potenciax(n1,n2);
    result.imprimirpotencia(potenciar);
   
   }

}









