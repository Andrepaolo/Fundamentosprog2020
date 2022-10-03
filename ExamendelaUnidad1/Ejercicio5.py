def APLAalarioenaumentoAPLA():
    salary=int(input("Ingrese su sueldo: "))
    años=int(input("¿Cuantos años trabajo? "))
    
    salary1=salary+0.1*salary
    salary2=salary1+0.1*salary1
    salary3=salary2+0.1*salary2
    salary4=salary3+0.1*salary3
    salary5=salary4+0.1*salary4
    salary6=salary5+0.1*salary5
    print("Primer año gano: ", salary1)
    print("Segundo año gano: ", salary2)
    print("Tercer año gano: ", salary3)
    print("Cuarto año gano: ", salary4)
    print("Quinto año gano: ", salary5)
    print("Su nuevo sueldo es: ", salary6)
APLAalarioenaumentoAPLA()