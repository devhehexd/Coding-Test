def solution(s):
    answer = ''
    
    # 문자열 개수 저장 딕셔너리
    dic = dict()
    
    # 문자열 순회
    
    for c in s:
        if c not in dic.keys():
            dic[c] = 1
        elif c in dic.keys():
            dic[c] = dic[c] + 1
            
    for key in dic:
        value = dic[key]
        if value == 1:
            answer += key
    
    # 정렬 함수 sorted() 활용
    # sorted(컨테이너 자료형)는 정렬된 '리스트'를 반환
    answer = sorted(answer)
    
    # 리스트 -> 문자열로 형변환
    # "".join() 메서드 활용
    # "".join(리스트): 리스트의 원소를 연결해서 문자열을 생성
    answer = "".join(answer)
    
    return answer