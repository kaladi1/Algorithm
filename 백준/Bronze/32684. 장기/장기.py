import sys
input = sys.stdin.readline

c_list = list(map(int, input().split()))
c_sum = c_list[0] * 13 + c_list[1] * 7 + c_list[2] * 5 + c_list[3] * 3 + c_list[4] * 3 + c_list[5] * 2

e_list = list(map(int, input().split()))
e_sum = e_list[0] * 13 + e_list[1] * 7 + e_list[2] * 5 + e_list[3] * 3 + e_list[4] * 3 + e_list[5] * 2 + 1.5

if c_sum > e_sum : 
    print('cocjr0208')
else : 
    print('ekwoo')