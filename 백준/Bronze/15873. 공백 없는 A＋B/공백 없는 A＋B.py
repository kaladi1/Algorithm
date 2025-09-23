n= input()

if n[-2] + n[-1] == "10":  

    print( int(n[:-2]) + 10)
else:
    print( int(n[:-1]) + int(n[-1]) )