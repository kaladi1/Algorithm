part_list = list(map(int,input().split()))
s = part_list[0]
k = part_list[1]
h = part_list[2]

part = sum(part_list)
if part >= 100:
    print("OK")
elif part < 100:
    part_list.sort()
    if part_list[0] == s:
        print("Soongsil")
    elif part_list[0] == k:
        print("Korea")
    elif part_list[0] == h:
        print("Hanyang")