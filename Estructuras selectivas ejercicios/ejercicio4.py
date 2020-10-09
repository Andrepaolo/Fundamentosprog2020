def comprodel14():
    n1=float(input("Ingrese el dinero que posee")) 
    if n1<=10.00:
            print("usted puede comprar tarjeta")
    if 10.59<n1<100.01:
        print("usted puede comprar chocolates ") 
    if 100.99<n1<250.01:
        print("usted puede comprar flores") 
    if n1>250:
        print("usted puede comprar anillo") 
comprodel14()
    