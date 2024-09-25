from collections import deque

def solution(arr):
    answer = []
    
    arr = deque(arr)
    
    number = arr.popleft()
    
    answer.append(number)
    
    while len(arr) != 0:
        number = arr.popleft()
        if answer[-1] != number:
            answer.append(number)
    
    return answer
    