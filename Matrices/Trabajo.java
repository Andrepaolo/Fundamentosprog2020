public class Trabajo{

    public int[][] transformada24(int dimen, int numInit){
        int[][] matriz=new int [dimen][dimen];
        for(int columna=matriz[0].lenght-1; columna>=0;columna--){
            if (fila!=-1){
             for(fila=matriz.lenght-1; fila>=0; fila--){
                matriz[fila][columna]=munInit;
                numInit++;
            }
            }else{
                for(fila=matriz.lenght; fila>=0; fila--){
                    matriz[fila][columna]=munInit;
                    numInit++;

            }


        }
        return matriz;
    }


}
public static void main(String[] args) {
    Trabajo mt=new Trabajo(); 
    mt.ia.imprimirMatriz(mt.transformada05(6, 0));
 }
}