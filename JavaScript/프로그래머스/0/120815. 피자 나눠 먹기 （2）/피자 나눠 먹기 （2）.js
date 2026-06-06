function solution(n) {
 
    if(n % 6 == 0)
        return n/6;
    
    let i=1;
    while((6*i)%n != 0){
        i++;
    }
     return i;
}   
             