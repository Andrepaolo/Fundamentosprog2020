def APLAbonodeprofesoresAPLA():
    pts=int(input("Ingrese los puntos que obtuvo: "))
    slary=float(input("Ingrese su salario: "))
    if 49<pts:
        if 49<pts<101:
         print("Su bono es: ",slary*0.10, (" soles"))
         print("Por lo cual le pagaran: ",slary*0.10+slary , (" soles en total"))
        if 100<pts<151:
            print("Su bono es: ",slary*0.50, (" soles"))
            print("Por lo cual le pagaran: ",slary*0.50+slary , (" soles en total"))
        if 150<pts:
            print("Su bono es: ",slary*0.80, (" soles"))
            print("Por lo cual le pagaran: ",slary*0.80+slary , (" soles en total"))
    else:
        print ("Usted no tiene un bono: ")
        print("Por lo cual le pagaran: ",slary,(" soles"))
APLAbonodeprofesoresAPLA()

    
    
    