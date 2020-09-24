def CalcularpromedioNota():
  #Datos entrada
  N1=int(input("Ingrese la Nota 1: "))
  N2=int(input("Ingrese la Nota 2: "))
  N3=int(input("Ingrese la Nota 3: "))
  N4=int(input("Ingrese la Nota 4: "))
  #Proceso
  PC=(N1+N2+N3+N4)/4
  #Datos de salida
  print ("Su promedio es:",PC)
  
def calcularpintado():
 #datos de entrada 
  CantM2=float(input("Ingrese la cantidad de M2 a pintar: ") )
  CostM2=float(input("Ingrese precio del M2: "))
  #Proceso 
  Pc=CostM2*CantM2
  #datos de salida
  print ("El costo del pintado es:",Pc)
calcularpintado()
