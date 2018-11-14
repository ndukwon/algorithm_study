a, b = map(int, input().split())

if b > 1:
    prime_cache = [True]*(b + 1)
    prime_cache[0] = prime_cache[1] = False
    base = 2

    while base**2 <= b:
        if prime_cache[base]:
            for k in range(base**2, b+1, base):
                prime_cache[k] = False
        base += 1

    for i in range(a, b+1):
        if prime_cache[i]:
            print(i)
