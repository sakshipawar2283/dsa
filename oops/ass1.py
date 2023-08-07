# input string

str=input("enter your string  ")
print(str)
lst1=list(str)
print(lst1)
for i in range (len(lst1)):
    c=ord(lst1[i])
    lst1[i]=c
print(lst1)    
#for i in range (len(lst1)):
   # c=bin(lst1[i])
   # lst1[i]=c
#print(lst1)   
#print("binary of 127")
#e=bin(127)
#print(e)
for i in range (len(lst1)):

     c= lst1[i] ^ 127
     lst1[i] = c 
print(lst1)    

for x in range(len(lst1)):
   c= chr(lst1[x])
   lst1[x] = c
print('Displaying the charecter list of updated integer list afte xor operation')
print(lst1)
