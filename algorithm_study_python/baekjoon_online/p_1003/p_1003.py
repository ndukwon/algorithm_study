'''
Input:
41
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40

Input2:
1
3


'''

MAX_FIBONACCI = 41
# fibonacci = [0 for i in range(MAX_FIBONACCI)]
fibonacci = [0] * MAX_FIBONACCI
fibonacci[1] = 1
for i in range(2, MAX_FIBONACCI) :
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]

count = int(input())

for i in range(count) :
    item = int(input())

    if item == 0 :
        a = 1
        b = 0
    else :
        a = fibonacci[item - 1]
        b = fibonacci[item]
    print(a, b)

