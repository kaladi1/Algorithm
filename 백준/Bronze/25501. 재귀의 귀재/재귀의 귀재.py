import sys

def Recursion(s, l, r):
    global count
    count += 1
    if l >= r:
        return 1
    elif s[l] != s[r]:
        return 0
    else:
        return Recursion(s, l+1, r-1)


def IsPalindrome(s):
    count = 0
    return Recursion(s, 0, len(s)-1)


loopNum = int(sys.stdin.readline())

s = ""
str = ""
count = 0


for i in range(loopNum):
    s = sys.stdin.readline().rstrip()
    count = 0
    print(IsPalindrome(s), count)