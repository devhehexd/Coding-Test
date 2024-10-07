from collections import deque

def solution(maps):
    answer = -1
    
    # 세로 길이
    N = len(maps)
    # 가로 길이
    M = len(maps[0])
    
    start_y = 0
    start_x = 0
    
    queue = deque()
    # 튜플로 위치를 저장한다.
    # 이동 칸 수도 함께 저장한다. 시작은 1
    queue.append((start_y, start_x, 1))
    
    # 방문 처리 변수
    visited = set()
    visited.add((start_y, start_x))
    
    # BFS
    while queue:
        y, x, count = queue.popleft()
        
        # 종료 조건
        if y == N - 1 and x == M - 1:
            answer = count
            break
        
        # 동서남북으로 탐색하는 코드

        # 델타 변수
        dy = [-1, 1, 0, 0]
        dx = [0, 0, -1, 1]

        for d in range(4):
            next_y = y + dy[d]
            next_x = x + dx[d]

            if 0 <= next_y < N and 0 <= next_x < M:
                if maps[next_y][next_x] == 1:
                    if (next_y, next_x) not in visited:
                        queue.append((next_y, next_x, count + 1))
                        visited.add((next_y, next_x))
            
    
    return answer