a=input('Enter the string: ')
data=list(a)

i=0
c=0
while(i<len(data)):
    if(data[i]=='1'):
        c+=1
    else: c=0

    if(c==6):
        data.insert(i,'0')
        c=0
    i+=1
x=''.join(data)
print('Before bit stuffing: ',a)
print('After bit stuffing: ',x)