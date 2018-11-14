'''
Input:
26

Output:
4

'''
input_number = int(input())

generated_number = input_number
count = 0
while True:
    first_number = generated_number//10
    second_number = generated_number%10
    generated_number = (second_number*10) + ((first_number + second_number)%10)
    # print("generated_number=", generated_number)
    count += 1

    if generated_number == input_number :
        break;

print(count)
