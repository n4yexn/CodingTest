function solution(age) {
    var answer = '';
    
    let a = age.toString();
    for(let i=0; i<a.length; i++){
        if(a.charAt(i) == 0)
            answer += 'a';
        else if(a.charAt(i) == 1)
            answer += 'b';
        else if(a.charAt(i) == 2)
            answer += 'c';
        else if(a.charAt(i) == 3)
            answer += 'd';
        else if(a.charAt(i) == 4)
            answer += 'e';
        else if(a.charAt(i) == 5)
            answer += 'f';
        else if(a.charAt(i) == 6)
            answer += 'g';
        else if(a.charAt(i) == 7)
            answer += 'h';
        else if(a.charAt(i) == 8)
            answer += 'i';
        else
            answer += 'j';
    }
    return answer;
}