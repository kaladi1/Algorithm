n = int(input())
first = int(input())
largest = smallest = first

is_max = True
is_min = True

for _ in range(n - 1):
    num = int(input())
    if num > first:
        is_max = False
    if num < first:
        is_min = False
    if not is_max and not is_min:
        print('?')
        break
else:
    if is_max:
        print('hard')
    elif is_min:
        print('ez')
    else:
        print('?')