def seiveOfEratosthenes(n):
    
    bound = n
    primes = [ True for i in range(bound + 1)]
    p = 2
    while (p * p <= bound):
        if (primes[p] == True):
            for i in range(p * 2, bound+1, p):
                primes[i] = False
        p += 1
        if len(primes) == n:
            break
    
    for p in range(2, bound):
        if primes[p]:
            print(p)

seiveOfEratosthenes(15)