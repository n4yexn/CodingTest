function solution(cipher, code) {
    var answer = [];
    
    answer.push(cipher.charAt(code -1));
    for(let i=1; i<cipher.length; i++){
        answer.push(cipher.charAt(code * i + code-1 ));
    }
    
    return answer.join("");
}