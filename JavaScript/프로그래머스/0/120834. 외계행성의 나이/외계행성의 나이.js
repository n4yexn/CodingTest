function solution(age) {
    var answer = '';
    a = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
    age = age.toString();
    
    for(let i=0; i<age.length; i++){
        answer += a[age[i]];
    }
    return answer;
}