import sys

doc = sys.stdin.readline().strip()
find = sys.stdin.readline().strip()

cnt = 0
i = 0

while i <=len(doc) - len(find):
    if doc[i:i+len(find)] == find:
        cnt += 1
        i += len(find)
    else:
        i += 1
print(cnt)