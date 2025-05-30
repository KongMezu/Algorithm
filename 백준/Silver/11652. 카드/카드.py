import sys
input = sys.stdin.readline

n = int(input())
card = []
cnt ={}

for _ in range(n):
    card.append(int(input()))

for i in card:
    if i in cnt:
        cnt[i] += 1
    else:
        cnt[i] = 1

result = sorted(cnt.items(), key = (lambda x:(x[1],-x[0])), reverse = True)

print(result[0][0])
#[숫자][빈도수]