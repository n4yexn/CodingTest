def solution(num_list, n):
    answer = []
    s = []
    
    for i in num_list:
        s.append(i)
        
        if len(s) == n:
            answer.append(s)
            s = []
    return answer