package pe.edu.upeu.apla.Examen;

public class EjercicioNumPerfecto{
    
    public void Respuesta(){
        int b,s,a,i;
       
       for (i=2;i<=10000;i++){
            b=0;
            s= i / 2;
            for(int j=1; j<=s;j++){

            a=i % j;
            if (a==0)
                b= b+j;
            }
            if (b==i)
               
            System.out.println("elnum "+ i + " es perfecto");
       }

    }

    public static void main(String[] args) {
       int b,s,a,i;
       
       for (i=2;i<=10000;i++){
            b=0;
            s= i / 2;
            for(int j=1; j<=s;j++){

            a=i % j;
            if (a==0)
                b= b+j;
            }
            if (b==i)
               
            System.out.println("elnum "+ i + " es perfecto");
        }} 
}

