import math

def solution(n):
    answer = 0 
    if n % math.sqrt(n) == 0:
        return 1
    else:
        return 2
    