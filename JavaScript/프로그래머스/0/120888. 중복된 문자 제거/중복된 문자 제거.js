function solution(my_string) {
    let arr = [];
    
    for(let i=0; i<my_string.length; i++){ 
        arr.push(my_string.charAt(i));
    } //배열에 원소 넣기
    
    for(let i=0; i<arr.length; i++){
        for(let j=i+1; j<arr.length; j++){
            if(arr[i] === arr[j])
               arr[j] = "";
        }
    }
    return arr.join("");
}