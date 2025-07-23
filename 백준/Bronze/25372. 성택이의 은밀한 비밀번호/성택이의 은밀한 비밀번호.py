T = int(input())
arr = ['' for i in range(0, T)]

for i in range(0, T):
    arr[i] = input()

for i in range(0, T):
    if len(arr[i]) >= 6 and len(arr[i]) <= 9:
        print('yes')
    else:
        print('no')