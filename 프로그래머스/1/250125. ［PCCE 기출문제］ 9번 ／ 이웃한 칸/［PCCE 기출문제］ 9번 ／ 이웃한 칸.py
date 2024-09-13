def solution(board, h, w):
    answer = 0
    
    # 세로, 가로 길이
    n = len(board)
    m = len(board[0])
    
    # 델타 탐색
    # h, w 변화값
    dh = [-1, 1, 0, 0] # 상하좌우
    dw = [0, 0, -1, 1] # 상하좌우
    
    # 4방향 탐색 반복문
    for d in range(4):
        next_h = h + dh[d]
        next_w = w + dw[d]
        
        # 탐색 좌표가 범위를 벗어나는지 확인
        if -1 < next_h < n and -1 < next_w < m:
            # 기준 좌표의 색과 탐색 좌표의 색이 동일한지 확인
            if board[h][w] == board[next_h][next_w]:
                answer = answer + 1
                print(board[h][w], board[next_h][next_w])
            
    return answer