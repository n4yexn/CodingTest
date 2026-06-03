function solution(hp) {
    var answer = 0;
    let a = 0, b = 0, c = 0; // 5 3 1
    a = parseInt(hp / 5);
    hp = hp - (a * 5);
    b = parseInt(hp / 3);
    hp = hp - (b * 3);
    c = parseInt(hp / 1);
    answer = a + b + c;
    return answer;
}