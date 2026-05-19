function solution(n, k) {
    
    if(n > 9){
        return (12000 * n) + (2000 * k) - (Math.floor(n /10)) * 2000;
    }
    else 
        return (12000 * n) + (2000 * k);
}