import itertools

def primes():

    D = {}
    yield 2
    
    for q in itertools.count(3, 2):
        p = D.pop(q, None)
        if p is None:
            yield q
            D[q * q] = q
        else:
            x = p + q
            while x in D or x % 2 == 0:
                x += p
            D[x] = p

def nthPrime(n):
    if n < 1:
        raise ValueError("n must be >= 1 for nthPrime")
    for i, p in enumerate(primes(), 1):
        if i == n:
            print(p)
            break

nthPrime(200000)