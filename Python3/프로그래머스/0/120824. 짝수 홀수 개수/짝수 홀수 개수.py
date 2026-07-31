def solution(num_list):
    answer = []
    e = 0
    o = 0
    for i in range(len(num_list)):
        if num_list[i] % 2 == 0:
            e += 1
        else:
            o += 1
    answer.append(e)
    answer.append(o)
    return answer