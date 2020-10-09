def estacionamiento():
    n1=float(input("ingrese las horas que estuvo en el estacionamiento: "))
    if n1>10:
        print (("Ustede debe pagar: "), 37+(n1-10)*2 )
    if 11>n1>5:
        print (("Ustede debe pagar: "), 22+(n1-5)*3 )
    if 6>n1>2:
        print (("Ustede debe pagar: "), 10+(n1-2)*4 )
    if 3>n1>0:
        print (("Ustede debe pagar: "), n1*5 )
estacionamiento()