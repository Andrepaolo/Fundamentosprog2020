def ejercicio3():
    n1=int(input("ingrese las horas trabajadas "))
    n2=int(input("ingrese el precio por hora "))
    if n1>40:
        print (("el precio a paagr es: "), n2*40+(n1-40)*2*n2)
    else: 
        print (("el precio a paagr es: "), n2*n1)
ejercicio3()
