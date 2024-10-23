import sys

def fibo(N):
  
  # 종료 조건
  if N <= 1:
    return N
  
  # 반복되는 로직
  return fibo(N - 1) + fibo(N - 2)

input = sys.stdin.readline
n = int(input())
print(fibo(n))