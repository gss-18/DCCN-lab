from collections import Counter 

a=input("Enter data: ")
x=dict(Counter(a))
if(x["1"]%2==0):
    print('Even ones:'+ a+'0')
else:
    print('Odd ones:'+a+'1')
    
    



