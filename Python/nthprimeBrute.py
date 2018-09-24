def nthprime(limit):
    primes = [2]
    num = 3

    while len(primes) < limit:
        for p in primes:
            if num % p == 0:
                break
        else:
            primes.append(num)
        num += 2
    print(primes)

nthprime(15)