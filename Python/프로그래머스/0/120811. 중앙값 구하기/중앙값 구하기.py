def solution(array):
    array.sort()
    i = int(len(array) / 2) 
    return array[i]