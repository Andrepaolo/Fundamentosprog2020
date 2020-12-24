public class trabajo1 {
    public static  void imprimirMatriz(int[][] matriz){
            for(int filaSubInd=0; filaSubInd<matriz.length;filaSubInd++){
                for(int columSubInd=0; columSubInd<matriz[0].length;columSubInd++){
                    System.out.print(matriz[filaSubInd][columSubInd]+"\t");
                }
                System.out.println();}
            }   
        
        public static void main(String[] args) {
            int[][] matrizX =new int[][]{
                {320,8,16},
                {24,80,40},
                {8,20,12},
                
              
        };
        int[][] matrizR =new int[][]{
            {matrizX[0][0]*2,matrizX[0][1]*2,matrizX[0][2]*2},
            {matrizX[1][0]*2,matrizX[1][1]*2,matrizX[1][2]*2},
            {matrizX[2][0]*2,matrizX[2][1]*2,matrizX[2][2]*2},
        };
    System.out.println("Imprimiendo Matriz  Tamanho Filas:="+ matrizX.length+"  Tamanho Columnas:="+matrizX[0].length)
    ; imprimirMatriz(matrizR);
        }}
    

