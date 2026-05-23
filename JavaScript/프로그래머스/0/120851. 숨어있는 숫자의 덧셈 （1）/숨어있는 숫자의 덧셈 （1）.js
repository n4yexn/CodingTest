function solution(my_string) {
    var answer = 0;
    my_string.toLowerCase();
    
    for(let i=0; i<my_string.length; i++){
        if(my_string[i] == 1 || my_string[i] == 2 || my_string[i] == 3 || 
           my_string[i] == 4 || my_string[i] == 5 || my_string[i] == 6 || 
           my_string[i] == 7 || my_string[i] == 8 || my_string[i] == 9)
          answer += parseInt(my_string[i]);
        } 
    return answer;
}