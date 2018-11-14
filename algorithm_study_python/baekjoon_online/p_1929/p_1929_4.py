a, b = map(int, input().split())

checkPrimes = [True] * (b+1)
checkPrimes[0] = checkPrimes[1] = False
for i in range(2, int(b**.5) + 1) :
    if checkPrimes[i] :
        for j in range((i+i), b+1, i) :
            checkPrimes[j] = False

for i in range(a, b+1) :
    if checkPrimes[i] :
        print(i)
