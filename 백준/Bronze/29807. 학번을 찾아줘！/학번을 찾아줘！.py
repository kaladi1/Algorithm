T = int(input())
subject = list(map(int, input().split()))
if T < 5:
    subject += [0] * (5 - T)
 
total = 0
if subject[0] > subject[2]:
    total += (subject[0] - subject[2]) * 508
else:
    total += abs(subject[0] - subject[2]) * 108
 
if subject[1] > subject[3]:
    total += (subject[1] - subject[3]) * 212
else:
    total += abs(subject[1] - subject[3]) * 305
 
if subject[4] > 0:
    total += subject[4] * 707
 
print(total * 4763)