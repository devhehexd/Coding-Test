from collections import defaultdict

N = int(input())

book_info = defaultdict(int)

for _ in range(N):
  book = input()
  book_info[book] += 1

# 선형탐색을 이용한 방법
cnt = 0
bestseller = ""

for book_name, selling in book_info.items():
  if selling > cnt:
    bestseller = book_name
    cnt = selling
  elif selling == cnt:
    bestseller = min(bestseller, book_name)

print(bestseller)