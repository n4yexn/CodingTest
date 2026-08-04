def solution(array):
    answer = []
    i = max(array)
    answer.append(i)
    answer.append(array.index(i))
    return answer