N = int(input())
S = input().strip()

vowels = 'aeiou'

count = 0
for char in S:
    if char in vowels:
        count += 1

print(count)