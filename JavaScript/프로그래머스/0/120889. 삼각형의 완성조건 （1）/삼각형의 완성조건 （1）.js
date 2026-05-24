function solution(sides) {
    
    //오름차순 정렬
    sides.sort();
    
    if(sides[2] < sides[1]+sides[0])
        return 1;
    else
        return 2;   
}