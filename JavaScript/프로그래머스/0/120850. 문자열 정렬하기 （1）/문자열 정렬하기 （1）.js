function solution(my_string) {
    var answer = [];
    for(let i=0; i<my_string.length; i++){
        if(my_string.charAt(i) == 1)
            answer.push(1);
        else if(my_string.charAt(i) == 2)
            answer.push(2);
         else if(my_string.charAt(i) == 3)
            answer.push(3);
         else if(my_string.charAt(i) == 4)
            answer.push(4);
         else if(my_string.charAt(i) == 5)
            answer.push(5);
         else if(my_string.charAt(i) == 6)
            answer.push(6);
         else if(my_string.charAt(i) == 7)
            answer.push(7);
         else if(my_string.charAt(i) == 8)
            answer.push(8);
         else if(my_string.charAt(i) == 9)
            answer.push(9);
         else if(my_string.charAt(i) == 0)
            answer.push(0);
    }
    answer.sort((a,b) => a-b);
    return answer;
}