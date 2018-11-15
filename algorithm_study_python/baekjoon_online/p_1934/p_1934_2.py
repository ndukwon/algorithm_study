'''
input:
10
1 45000
6 10
13 17
180 200
18 20
10 20
1679 874
3762 4047
6080 3876
78963 23075

output:
45000
30
221
1800
180
20
63802(GCD:23)
267102(GCD:57)
310080(GCD:76)
1822071225(GDC:1)

'''


def find_greatest_common_divisor(a, b):
    x = max(a, b)
    y = min(a, b)
    while (x > 0) & (y > 0):
        temp = y
        y = x % y
        x = temp

    return x

def find_least_common_multiple(a, b):
    return int((a * b) / find_greatest_common_divisor(a, b))


# Main
line_count = int(input())
results = []

for i in range(line_count):
    a, b = input().split(" ")
    a = int(a)
    b = int(b)

    result = find_least_common_multiple(a, b)

    results.append(result)

for i in results:
    print(i)
