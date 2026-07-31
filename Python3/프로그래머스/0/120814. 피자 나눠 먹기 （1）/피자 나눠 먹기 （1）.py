import math

def solution(n):
    if n < 8:
        return 1;
    else:
        return math.ceil(n / 7) 