def becaperu():
    n1=float(input("Ingrese su promedio: ")) 
    edad=int(input("Ingrese la edad: ")) 
    if n1>6:
        if edad>18:
         if n1<=9:
            print("Usted tiene un bono de 2000 soles")
            if 7.5<n1<9:
                print ("Usted tiene un bono de 1000 soles") 
            if 5.99<n1<7.5:
                print("Usted tiene un bono de 500 soles") 
        else:
            if n1<=9:
             print("Usted tiene un bono de 3000 soles")
            if 7.99<n1<9:
             print ("Usted tiene un bono de 2000 soles") 
            if 5.99<n1<8:
             print("Usted tiene un bono de 100 soles") 
    else:
        print("Usted debe de seguir estudiando si quiere una beca")  
becaperu()