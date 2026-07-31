import math
def solution(slice, n):
    if n % slice == 0:
        return n / slice
    else:
        return math.ceil(n / slice) 