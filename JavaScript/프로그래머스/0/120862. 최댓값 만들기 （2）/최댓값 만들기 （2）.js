function solution(numbers) {

    let a=0, b=0;
    numbers.sort((a, b) => a-b);
    a = numbers[0] * numbers[1];
    b = numbers[numbers.length-2] * numbers[numbers.length - 1];
    return Math.max(a, b);
}