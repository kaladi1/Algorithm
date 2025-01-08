test_case = []
for i in range(int(input())):
    test_case.append(list(map(int, input().split())))
for i in range(1, len(test_case)+1):
    print("Case #" + str(i) + ": " + str(sum(test_case[i-1])))