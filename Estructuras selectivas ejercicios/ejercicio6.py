def Elmenor():
    nom1=str(input("ingrese el nombre "))
    edad1=int(input("edad "))
    nom2=str(input("ingrese el nombre  "))
    edad2=int(input("edad "))
    nom3=str(input("ingrese el nombre "))
    edad3=int(input("edad "))
    if edad1>edad2 : 
        if edad2>edad3:
               print (("el menor es "),nom3,("con"),edad3,("años") )
        else: print (("el menor es "),nom2,("con"),edad2,("años") )
    else: 
        if edad3>edad1: 
             print (("el menor es "),nom1,("con"),edad1,("años") )
        else: print (("el menor es "),nom3,("con"),edad3,("años") )
Elmenor()


