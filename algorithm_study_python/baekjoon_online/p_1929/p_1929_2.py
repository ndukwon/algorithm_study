prime_list_cache = [None]

def set_multiple(number, limit):
    if prime_list_cache[number] != None:
        return

    multiple = number
    while multiple < limit:
        prime_list_cache[multiple] = False
        multiple += number

def is_prime(number, limit):
    result = True
    if prime_list_cache[number] != None:
        result = prime_list_cache[number]
    else:
        for j in range(2, int(number/2) + 1):
            if number%j == 0:
                result = False
                set_multiple(i, limit)
                break
        prime_list_cache[number] = result
    return result

a, b = map(int, input().split())

prime_list_cache *= (b + 1)

for i in range(a, b+1):
    if is_prime(i, b+1):
        print(i)


'''
시간초과
'''
