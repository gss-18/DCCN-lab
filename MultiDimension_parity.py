from collections import Counter
import numpy as np

a=int(input('Enter rows: '))
mat=[]
hor=[]
ver=[]
for i in range(a):
    mat.append(input('Enter row data: '))
ver=list(np.zeros(len(mat),dtype=int))

for i in range(len(mat)):
    mat[i]=mat[i].split(' ')


for i in mat:
    x=dict(Counter(i))
    if(x["1"]%2==0):
        hor.append('0')
    else:
        hor.append('1')

print('Horizontal Parity',' '.join(hor)) 

for i in range(len(mat)):
    for j in range(len(mat[i])):
        ver[i]+=int(mat[i][j])

for i in range(len(ver)):
    if(ver[i]%2==0):
        ver[i]=0
    else: 
        ver[i]=1

print('Vertical Parity',' '.join(str(i) for i in ver)) 







""" 1 1 0  0
1 0 0  1 
1 1 1  1

1 0  1

1 1 1  1 """