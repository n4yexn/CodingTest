def solution(numbers, num1, num2):
    answer = []
    i = num1
    
    while(i <= num2):
        answer.append(numbers[i])
        i += 1
    return answer