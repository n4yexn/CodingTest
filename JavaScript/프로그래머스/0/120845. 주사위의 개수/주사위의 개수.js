function solution(box, n) {
    let a, b, c;
    a = Math.floor(box[0] / n);
    b = Math.floor(box[1] / n);
    c = Math.floor(box[2] / n);
    return a * b * c;
}