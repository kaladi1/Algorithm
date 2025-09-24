def newbie(N, M):
    answer = "TLE!"
    
    if M <= 2:
        answer = "NEWBIE!"
    elif M > 2 and M <= N:
        answer = "OLDBIE!"
        
    return answer


if __name__ == "__main__":
    N, M = map(int, input().split())
    print(newbie(N, M))