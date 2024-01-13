def solution(n):
    fibo = [0, 1]
    for i in range(n-1):
        fibo.append(fibo[0+i]+fibo[1+i])
    return fibo[len(fibo)-1] % 1234567