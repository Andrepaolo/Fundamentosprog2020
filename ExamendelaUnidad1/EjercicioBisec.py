
import math
def f(x):
    return ((668.06/x)*(1-math.exp((-0.146843)*(x)))-40)

def biseccion(a,b,tol):
    m1=a;
    m=b;
    i=0;    
    

    if (f(a)*f(b)>0):
        print ('no existe raiz entre estos dos puntos');
    print('el intervalo',1,'es [12.0, 16.0, 14.0, error relativo]')
    
    while (abs(m1-m)>tol):
        
        m1=m
        m=((a+b)/2)
        
        if (i>0):
            ea=abs((m-m1)/m)*100;
        else:
            ea=0
           
        if (f(a)*f(m)<0): #cambia el signo en li y m
            b=m
        if (f(m)*f(b)<0): #cambia el signo en m y ls
            a=m  
        
              
        print('el intervalo',i+2,'es [',a,',',b,',',(a+b)/2,',',ea,'%]')
        i=i+1;
        

    print ('fueron',i,'iteraciones  =',m,'es una aproximación cercana')

biseccion(12,16,0.1)