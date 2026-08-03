def solution(n, k):
    answer = 0
    s = 0
    d = 0
    
    s = n // 10   #무료 양꼬치 개수 
    d = k - s
    
    return 12000 * n + 2000 * d
    