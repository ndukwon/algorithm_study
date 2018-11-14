'''
Input1:
3
26 40 83
49 60 57
13 89 99

Output1:
96

'''

import sys

input_size = int(sys.stdin.readline())

accumulated = [0]*3
for i in range(input_size):
    r, g, b = sys.stdin.readline().split(' ')
    r = int(r)
    g = int(g)
    b = int(b)

    r += min(accumulated[1], accumulated[2])
    g += min(accumulated[0], accumulated[2])
    b += min(accumulated[0], accumulated[1])

    accumulated[0] = r
    accumulated[1] = g
    accumulated[2] = b

print(min(accumulated))
