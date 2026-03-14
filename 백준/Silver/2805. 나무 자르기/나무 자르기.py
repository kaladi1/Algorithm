import sys

N, M = map(int,sys.stdin.readline().split())

trees = list(map(int,sys.stdin.readline().split()))

low = 0
high = max(trees)

H = 0 
def binary_search(low, high):
    if low > high:
        return 
    global H
    middle = (low + high) // 2
    
    cut_sum = 0 
    for tree in trees:
        if (tree - middle) > 0 :
            cut_sum += (tree - middle)
    
    if cut_sum == M:
        H = middle

    elif cut_sum > M:
        H = max(H, middle)
        binary_search(middle+1, high)

    elif cut_sum < M:
        binary_search(low, middle-1)

binary_search(0, high)
print(H)