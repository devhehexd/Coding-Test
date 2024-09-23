import sys
input = sys.stdin.readline

# 실제 실행되는 코드: sys.stdin.readline().strip()
K = int(input().strip())

# 정수를 저장할 스택
stack = list()

for _ in range(K):
  number = int(input().strip())
  #모든 수를 저장하는데 입력이 0이면 마지막 값을 삭제
  if number != 0:
    stack.append(number)
  elif number == 0:
    stack.pop()
  
# 모든 수의 합을 출력
# n = len(stack)
# total = 0
# for i in range(n):
#   total += stack[i]

print(sum(stack))