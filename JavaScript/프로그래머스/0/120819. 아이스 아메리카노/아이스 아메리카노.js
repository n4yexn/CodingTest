function solution(money) {
    let n = 0;
    var answer = [n, money];
    
    if(money < 5500)
        answer = [n, money];
    else 
        n = Math.floor(money / 5500);
        money = money - (5500 * n);
        answer = [n, money];
    return answer;
}