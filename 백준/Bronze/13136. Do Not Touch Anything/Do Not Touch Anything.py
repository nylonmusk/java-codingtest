import math

N = input()
R, C, N = map(int, N.split())

print(math.ceil(R / N) * math.ceil(C / N))