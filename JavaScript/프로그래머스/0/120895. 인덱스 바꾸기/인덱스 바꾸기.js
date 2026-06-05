function solution(my_string, num1, num2) {
    let p = my_string.split("");
    let q;

    q = p[num1];
    p[num1] = p[num2];
    p[num2] = q;

    return p.join("");
}