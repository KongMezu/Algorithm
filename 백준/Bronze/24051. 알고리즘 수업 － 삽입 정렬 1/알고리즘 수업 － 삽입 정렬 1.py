import sys
input = sys.stdin.readline

N, K = map(int, input().split())
arr = list(map(int, input().split()))
count = 0 

for i in range(1, N):
    key = arr[i]
    j = i - 1

    while j >= 0 and arr[j] > key:
        arr[j + 1] = arr[j]
        count += 1
        if count == K:
            print(arr[j + 1])
            exit(0)
        j -= 1

    if arr[j + 1] != key: 
        arr[j + 1] = key
        count += 1
        if count == K:
            print(arr[j + 1])
            exit(0)

print(-1)
