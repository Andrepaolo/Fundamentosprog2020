def buslatortuga():
    ckm=float(input("Ingrese el coste por KM: "))
    print ("los lugares disponibles son: ")
    print ("-Mexico")
    print ("-P.V.")
    print ("-Acapullco")
    print ("-Cancun")
    dest=str(input("Ingrese el lugar al que quiere viajar: "))
    if dest=="Mexico":
        print(("El precio del viaje es"), 1500*ckm,("soles"))
    if dest=="P.V.":
        print (("El precio del viaje es"), 1600*ckm,("soles"))
    if dest=="Acapullco":
        print(("El precio del viaje es"), 2400*ckm,("soles"))
    if dest=="Cancun":
        print (("El precio del viaje es"), 3600*ckm,("soles"))
buslatortuga()
    