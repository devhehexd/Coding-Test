from itertools import permutations

T = int(input())

for _ in range(T):
  k= int(input())
  words = [input() for _ in range(k)]
  
  for w1, w2 in permutations(words, 2):
    p = w1 + w2
    
    if p == p[::-1]: # 회문이라면
        print(p)
        break
  
  else:
    print(0)