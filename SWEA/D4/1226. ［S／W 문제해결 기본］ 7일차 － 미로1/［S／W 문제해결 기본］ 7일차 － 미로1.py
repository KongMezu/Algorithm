dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

def isPossible(x, y):
    return 0 <= x < 16 and 0 <= y < 16 and (miro[x][y] == 0 or miro[x][y] == 3)

def DFS(x, y):
    if miro[x][y] == 3:
        return True

    miro[x][y] = 1

    for dir in range(4):
        nx = x + dx[dir]
        ny = y + dy[dir]
        if isPossible(nx, ny):
            if DFS(nx, ny):
                return True

    return False

for _ in range(10):
    t = int(input())
    miro = []
    start = (0, 0)

    for i in range(16):
        line = list(map(int, list(input().strip())))
        if 2 in line:
            start = (i, line.index(2))
        miro.append(line)

    result = 1 if DFS(start[0], start[1]) else 0
    print(f"#{t} {result}")