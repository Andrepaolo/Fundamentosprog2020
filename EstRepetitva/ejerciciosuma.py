def suma10numeros():
    ncontadorcondicion, numero, suma=1,0,0
    while ncontadorcondicion<=10:
        numero=float(input(f"Ingrese e lnumero de la posicion {ncontadorcondicion}:"))
        suma=suma+numero
        ncontadorcondicion=ncontadorcondicion+1
    print(f"La sumas de los 10 numeros ingresados es: {suma}")
suma10numeros()

