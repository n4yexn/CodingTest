def solution(n, k):
    
    s = n // 10   #무료 양꼬치 개수 
    d = k - s
    
    return 12000 * n + 2000 * d
    