function solution(emergency) {
    var answer = [];
    let arr = [];
    arr = [...emergency].sort((a,b) => b-a); //오름차순 정렬
    
    for(let i=0; i<emergency.length; i++) {
        answer.push(arr.indexOf(emergency[i])+1);
    }
    
    return answer;
}