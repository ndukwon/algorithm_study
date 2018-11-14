prime_list_cache = [None]*1000001
def is_prime(number):
    result = True
    if prime_list_cache[number] != None:
        result = prime_list_cache[number]
    else:
        for j in range(2, number):
            if number%j == 0:
                result = False
                break
        prime_list_cache[number] = result
    return result

line = input()
a, b = line.split(' ')
a = int(a)
b = int(b)

for i in range(a, b+1):
    if is_prime(i):
        print(i)


'''
시간초과
'''
