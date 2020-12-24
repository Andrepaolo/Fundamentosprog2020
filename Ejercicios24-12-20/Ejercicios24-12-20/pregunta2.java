public class pregunta2 {   
ImprimirArreglos ia=new ImprimirArreglos();
public int[][] transformada17(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int contador=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        for(int fila=0; fila<matriz[0].length;fila++){
            if(contador<=columna){                            
                matriz[fila][columna]= numInit;                                                                
                numInit++;
                contador++;
            }else{
               matriz[fila][columna]=-1; 
            }
        }
        contador=0;
    }
    return matriz;
}
public class ImprimirArreglos {
    public  void imprimirVector(Object[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println(vector[indice]);
        }
    }
    public  void imprimirVector(int[] vector){
        for(int indice=0; indice<vector.length;indice++){
            System.out.println(vector[indice]);
        }
    }
    
    public  void imprimirMatriz(Object[][] matriz){
        for(int filaSubInd=0; filaSubInd<matriz.length;filaSubInd++){
            for(int columSubInd=0; columSubInd<matriz[0].length;columSubInd++){
                System.out.print(matriz[filaSubInd][columSubInd]+"\t");
            }
            System.out.println();
        }
    }
    public   void imprimirMatriz(int[][] matriz){
        for(int filaSubInd=0; filaSubInd<matriz.length;filaSubInd++){
            for(int columSubInd=0; columSubInd<matriz[0].length;columSubInd++){
                System.out.print(matriz[filaSubInd][columSubInd]+"\t");
            }
            System.out.println();
        }
    }    
    
}
public static void main(String[] args) {
    pregunta2 mt=new pregunta2(); 
    mt.ia.imprimirMatriz(mt.transformada17(5, 0));
 }
}

