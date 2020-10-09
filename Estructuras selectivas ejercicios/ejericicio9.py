def cacularcostopoliza():
    tipoplan=str(input("¿Qué plan quieres? "))
    alcohol=bool(input("Consumes alcohol? "))
    lentes=bool(input("Usas lentes? "))
    enferm=bool(input("Padeces de alguna enfermedad? "))
    edad=int(input("Que edad tienes? "))
    if tipoplan=="A":
        costb=1200
    else:
        costb=950
    if alcohol==True:
        costb1=costb+(costb*0.10)
    else: costb1=costb
    if lentes==True:
        costb2=costb1+(costb*0.05)
    else: costb2=costb1
    if enferm==True:
        costb3=costb2+(costb*0.05)
    else: costb3=costb2
    if edad>40:
        costb4=costb3+(costb*0.20)
    else:  
        costb4=costb3+(costb*0.10)  
    print ("El costo de la poliza es: ",costb4)
cacularcostopoliza()