def APLAoperacionesAPLA():
    v1=float(input("Ingrese el primer valor: "))
    signo=str(input("Ingrese el signo de la operacion que desea realizar: "))
    v2=float(input("Ingrese el segundo valor: "))
    if signo=="+":
       print("El resultado es: ",v1+v2)
    if signo=="-":
       print("El resultado es: ",v1-v2)
    if signo=="*":
       print("El resultado es: ",v1*v2)
    if signo=="/":
       print("El resultado es: ",v1/v2)
    if signo=="^":
       print("El resultado es: ",v1**v2)
APLAoperacionesAPLA()