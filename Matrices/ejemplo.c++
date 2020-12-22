#include <stdio.h> main()
{
int matriz[20][20], dim,i,j,db,item; printf("\nINGRESAR DIMENSION DE LA MATRIZ : ");
scanf("%d",&dim);
printf("\nIngresar Direccionamiento Base: "); scanf("%d",&db);
for(i=0;i<dim;i++)
{
for(j=0;j<dim;j++)
{
item=db+(i+j)*(i+j+1)/2 + i; matriz[i][j]=item;
}
}

printf("\nLECTURA DE ASIGNACION DE MATRIZ\n");
for(i=0;i<dim;i++)
{
for(j=0;j<dim;j++)
{
if(j<dim-i)
printf("\t%d",matriz[i][j]);
else
printf("\t ");
 

}
printf("\n");
}

printf("\nQue posición desea saber de matriz[i][j]\n"); printf("\nIngresar i: ");scanf("%d",&i);
printf("\nIngresar j: ");scanf("%d",&j); printf("\nEl valor es: %d",matriz[i][j]);
}
