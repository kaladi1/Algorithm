import sys
input = sys.stdin.readline

n = int(input())
for _ in range(n):
    signal = input().rstrip()
    isRightPattern = True
    
    while len(signal) > 0:
        if signal.startswith("01"):
            signal = signal[2:]

        elif signal.startswith("100"):
            signal = signal[3:]
            
            while len(signal) > 0 and signal[0] == '0':
                signal = signal[1:]
            if len(signal) == 0:
                isRightPattern = False
                break

            signal = signal[1:]

            while len(signal) > 0 and signal[0] == '1':
                if len(signal) >= 3 and signal[1] == '0' and signal[2] == '0':
                    break
                else:
                    signal = signal[1:]

        else:
            isRightPattern = False
            break
    if isRightPattern: print("YES")
    else: print("NO")