import sys
input = sys.stdin.readline

N = int(input().strip())

# 정수가 저장된 리스트
number_list = list(map(int, input().strip().split()))

M = int(input().strip())

# 타겟 정수가 저장된 리스트
target_list = list(map(int, input().strip().split()))

import bisect

answer = 0

sorted_number_list = sorted(number_list)
# target들이 number_list에 존재하는가?
for target in target_list:
  index_left = bisect.bisect_left(sorted_number_list, target)
  # index_right = bisect.bisect_right(sorted_number_list, target)
  
  if index_left != len(sorted_number_list) and sorted_number_list[index_left] == target:
    answer = 1
    print(answer)
  else:
    answer = 0
    print(answer)
