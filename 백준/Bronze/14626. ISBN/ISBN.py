def sol(isbn):
    check_sum = 0
    answer = 0
    for i in range(12):
        if i%2 ==0 :
            multiple = 1
        else:
            multiple = 3
        if isbn[i].isnumeric():
            check_sum+=int(isbn[i])*multiple
        else:
            star_multiple = multiple
    m = int(isbn[-1])
    for star in range(10):
        if (m+check_sum+ star*star_multiple)%10 == 0:
            answer = star
    return answer
if __name__ == '__main__':
    isbn = input()
    print(sol(isbn))