package pe.edu.upeu.apla.Examen;

import pe.edu.upeu.apla.utils.ImprimirArreglos;
public class Matrices{
    ImprimirArreglos ia=new ImprimirArreglos();
public int[][] transformada23(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=5){
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }                      
        }        
    }
    return matriz;
}
public int[][] transformada35(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int x, x1, x2, y, y1;
    for(x=matriz.length-1; x>=matriz.length/2; x--){
        for(y=(dimen-1)-x;y<=x;y++){
            matriz[x][y]=numInit;
            numInit++;
        }
        for(x1=y-2;x1>=(dimen-1)-x;x1--){
            matriz[x1][x]=numInit;
            numInit++;
        }   
        for(y1=y-2;y1>=(dimen-1)-x;y1--){
            matriz[x1+1][y1]=numInit;
            numInit++;
        }   
        for(x2=y1+2;x2<y-1;x2++){
            matriz[x2][y1+1]=numInit;
            numInit++;
        }                    
    }

    return matriz;
}
public int[][] transformada36(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int x, x1, x2, y, y1;
    for(x=matriz.length-1; x>=matriz.length/2; x--){
        for(y=(dimen-1)-x;y<=x;y++){
            matriz[x][y]=numInit;
            numInit++;
        }
    }                    
    return matriz;
}
public static void main(String[] args) {
   Matrices mt=new Matrices(); 
   mt.ia.imprimirMatriz(mt.transformada36(5, 0));
}}