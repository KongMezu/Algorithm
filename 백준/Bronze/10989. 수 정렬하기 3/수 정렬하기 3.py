import sys
input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
count = [0] * 10001

for _ in range(N):
    count[int(input())] += 1

for num in range(10001):
    if count[num]:
        for _ in range(count[num]):
            print(f"{num}\n")
