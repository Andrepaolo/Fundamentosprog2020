def APLAvacunaabcAPLA():
    edad=int(input("Ingrese su edad: "))
    print("las opciones de sexo son Masculino y Femenino")
    sexo=str(input("¿Cual es su sexo?"))
    
    if edad>=70:
        print("Usted debe de usar la vacuna tipo C")
    if 15<edad<70:
       if sexo=="Masculino":
            print("Usted debe de usar la vacuna tipo A")
       else:
           print("Usted debe de usar la vacuna tipo B")
    else:
        print ("Usted debe de usar la vacuna tipo A")
APLAvacunaabcAPLA()