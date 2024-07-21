N = input()
a, b, c = map(int, N.split())

if a + b == c:
    print("correct!")
else:
    print("wrong!")