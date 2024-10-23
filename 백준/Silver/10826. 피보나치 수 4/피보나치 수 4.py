N = int(input())
memo = [0, 1]

for _ in range(N - 1):
  memo.append(memo[-1] + memo[-2])

print(memo[N])