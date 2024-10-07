def solution(numbers, target):
    
    # 방문 처리 변수
    visited = [False] * len(numbers)
    answer = []
    
    def dfs(node, total):
        if node == len(numbers):
            if total == target:
                answer.append(total)
            return
        
        plus_total = total + numbers[node]
        minus_total = total - numbers[node]
        
        dfs(node + 1, plus_total)
        dfs(node + 1, minus_total)
    
    # 시작 위치(인덱스, 노드)
    start = 0
    
    # 값을 더하거나 뺄 기준 변수
    total = 0
    
    dfs(start, total)
    
    return len(answer)