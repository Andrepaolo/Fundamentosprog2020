package pe.edu.upeu.apla.Examen;

import pe.edu.upeu.apla.utils.ImprimirArreglos;
public class Matrices{
    ImprimirArreglos ia=new ImprimirArreglos();
public int[][] transformada05(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        int contador=0;
        for(int fila=0; fila<matriz.length;fila++){
            for(int columna=matriz[0].length-1; columna>=0;columna--){
                if(contador<=fila){                            
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
public int[][] transformada06(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        int contador=0;
        for(int fila=0; fila<matriz.length-1;fila--){
            for(int columna=0; columna<matriz[0].length-1;columna++){
                if(contador<=fila){                            
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
public int[][] transformada21(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=0; columna<matriz[0].length;columna++){
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
public int[][] transformada22(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=0; columna<matriz[0].length;columna++){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }                        
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }                      
        } 
    } 
    return matriz;
}
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
public int[][] transformada24(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    int fila=0;
    for(int columna=matriz[0].length-1; columna>=0;columna--){
        if(fila!=-1){
            for(fila=matriz.length-1; fila>=0;fila--){
                matriz[fila][columna]=numInit;
                numInit++;
            }
        }else{
            for(fila=0; fila<matriz.length;fila++){
                matriz[fila][columna]=numInit;
                numInit++;
            }            
        }        
    }
    return matriz;
}
public int[][] transformada29(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    for(int v=0; v<dimen/2; v++){
        for(int ls=v;ls<dimen-1-v; ls++){
            matriz[v][ls]=numInit;
            numInit++;            
        }
        for(int ld=v;ld<dimen-1-v; ld++){
            matriz[ld][dimen-1-v]=numInit;
            numInit++;            
        }        
        for(int li=dimen-1-v;li>v; li--){
            matriz[dimen-1-v][li]=numInit;
            numInit++;            
        }  
        for(int liz=dimen-1-v;liz>v; liz--){
            matriz[liz][v]=numInit;
            numInit++;            
        }              
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;
}
public int[][] transformada30(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        for(int v=0;v<dimen/2; v++){
            for(int ld=v;ld<dimen-1-v; ld++){
                matriz[ld][dimen-1-v]=numInit;
                numInit++;
            }
            for(int li=dimen-1-v;li>v; li--){
                matriz[dimen-1-v][li]=numInit;
               numInit++;
            }
            for(int liz=dimen-1-v;liz>v; liz--){
                matriz[liz][v]=numInit;
                numInit++;
            }
            for(int ls=v;ls<dimen-1-v; ls++){
                matriz[v][ls]=numInit;
                numInit++;
            }               
        }
        if(dimen%2!=0){
            matriz[dimen/2][dimen/2]=numInit;
        }       
    
        return matriz;}
public int[][] transformada31(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        for(int v=0;v<dimen/2; v++){
            for(int li=dimen-1-v;li>v;li--){
                matriz[dimen-1-v][li]=numInit;
                numInit++;
            }
            for(int liz=dimen-1-v;liz>v;liz--){
                matriz[liz][v]=numInit;
                numInit++;
            }
            for(int ls=v;ls<dimen-1-v;ls++){
                matriz[v][ls]=numInit;
                numInit++;
            }
            for(int ld=v;ld<dimen-1-v; ld++){
                matriz[ld][dimen-1-v]=numInit;
                numInit++;
            }                         
        }
        if(dimen%2!=0){
            matriz[dimen/2][dimen/2]=numInit;
        }       
        
        return matriz;
    }
public int[][] transformada32(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        for(int v=0;v<dimen/2; v++){
            for(int liz=dimen-1-v;liz>v;liz--){
                matriz[liz][v]=numInit;
                numInit++;
            }
            for(int ls=v;ls<dimen-1-v; ls++){
                matriz[v][ls]=numInit;
                numInit++;
            }
            for(int ld=v;ld<dimen-1-v; ld++){
                matriz[ld][dimen-1-v]=numInit;
                numInit++;
            }
            for(int li=dimen-1-v;li>v; li--){
                matriz[dimen-1-v][li]=numInit;
                numInit++;
            }
        }
        if(dimen%2!=0){
            matriz[dimen/2][dimen/2]=numInit;
        }       
        
        return matriz;
    }
public int[][] transformada33(int dimen, int numInit){
    int[][] matriz=new int[dimen][dimen];
    for(int v=0;v<dimen/2; v++){
        for(int ls=dimen-1-v;ls>=v; ls--){
            matriz[v][ls]=numInit;
            numInit++;
        }
        for(int liz=v+1;liz<dimen-1-v; liz++){
            matriz[liz][v]=numInit;
            numInit++;
        }
        for(int li=v;li<dimen-1-v; li++){
            matriz[dimen-1-v][li]=numInit;
           numInit++;
        }
        for(int ld=dimen-1-v;ld>v; ld--){
            matriz[ld][dimen-1-v]=numInit;
            numInit++;    
        }
        

                
    }
    if(dimen%2!=0){
        matriz[dimen/2][dimen/2]=numInit;
    }

    return matriz;}
public int[][] transformada34(int dimen, int numInit){
        int[][] matriz=new int[dimen][dimen];
        for(int v=0;v<dimen/2; v++){
            for(int liz=v;liz<dimen-1-v; liz++){
                matriz[liz][v]=numInit;
                numInit++;
            }
            for(int li=v;li<dimen-1-v; li++){
                matriz[dimen-1-v][li]=numInit;
               numInit++;
            }
            for(int ld=dimen-1-v;ld>v; ld--){
                matriz[ld][dimen-1-v]=numInit;
                numInit++; 
            }
            for(int ls=dimen-1-v;ls>v; ls--){
                matriz[v][ls]=numInit;
                numInit++;
            }
                    
                        
        }
        if(dimen%2!=0){
            matriz[dimen/2][dimen/2]=numInit;
        }
    
        return matriz;}
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
        for(int v=0;v<dimen/2; v++){
            for(int ld=dimen-1-v;ld>v;ld--){
                matriz[ld][dimen-1-v]=numInit;
                numInit++;
            }
            for(int ls=dimen-1-v;ls>v;ls--){
                matriz[v][ls]=numInit;
                numInit++;
            }
            for(int liz=v;liz<dimen-1-v;liz++){
                matriz[liz][v]=numInit;
                numInit++;
            }
            for(int li=v;li<dimen-1-v;li++){
                matriz[dimen-1-v][li]=numInit;
                numInit++;
            }
                          
        }
        if(dimen%2!=0){
            matriz[dimen/2][dimen/2]=numInit;
        }       
    
        return matriz;}
     
public static void main(String[] args) {
   Matrices mt=new Matrices(); 
   mt.ia.imprimirMatriz(mt.transformada06(5, 0));
}}