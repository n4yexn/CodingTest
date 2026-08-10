def solution(hp):
    a = hp // 5
    hp = hp - a * 5
    b = hp // 3
    hp = hp - b * 3
    c = hp
    return a + b + c