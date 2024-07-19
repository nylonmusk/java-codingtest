binary1, binary2 = input().split()

decimal1 = int(binary1, 2)
decimal2 = int(binary2, 2)

decimal_sum = decimal1 + decimal2

binary_sum = bin(decimal_sum)[2:]

print(binary_sum)