function solution(str1, str2) {
let answer = 0;
    for(let i=0; i<str1.length; i++) {
        if(str1.charAt(i) == str2.charAt(0)){
            answer = str1.substr(i, str2.length);
            if (answer.toString() == str2)
                return 1;
        }
    }
    return 2;
}