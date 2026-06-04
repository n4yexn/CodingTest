function solution(order) {
    var answer = 0;
    order = order.toString();
    for(let i=0; i<order.length; i++) {
        if(order.charAt(i) == '3' || order.charAt(i) == '6'|| order.charAt(i) == '9')
            answer++;
    }
    return answer;
}