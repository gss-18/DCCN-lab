def ch(flag,escape,frame):
    x=frame.replace(escape,escape*2)
    return flag+x+flag

flag=input("Enter Flag: ")
esc=input("Enter Escape: ")
fr=input("Enter Frame: ")

print("After Stuffing: ",ch(flag,esc,fr))
print("After Destuffing: ",fr)



