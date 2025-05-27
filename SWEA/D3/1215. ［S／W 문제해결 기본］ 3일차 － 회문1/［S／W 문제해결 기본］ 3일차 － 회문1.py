def is_rotate(s):
    for i in range(L // 2):
        if s[i] != s[-1 - i]:
            return False
    return True
 
def find_row():
    global answer
    for i in range(8):
        for j in range(9 - L):
            s_row = ''.join(word[i][j:j + L])
            if is_rotate(s_row):
                answer += 1
 
def find_col():
    global answer
    for i in range(8):
        for j in range(9 - L):
            s_col = ''
            for k in range(L):
                s_col += word[j + k][i]
            if is_rotate(s_col):
                answer += 1
 
for test_case in range(1, 11):
    answer = 0
 
    L = int(input())
    word = [list(map(str, input())) for _ in range(8)]
 
    find_row()
    find_col()
 
    print(f'#{test_case} {answer}')
    test_case += 1