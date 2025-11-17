STR, DEX, INT, LUK, N = map(int, input().split())

sum = STR + DEX + INT + LUK
tSum = N * 4

if (tSum - sum) > 0 : 
    print(tSum - sum)
else :
    print(0)