function solution(a, b, n) {
    let answer = 0;

    while(n >= a) {
        let give = parseInt(n / a);
        n = n - (give * a) + (give * b);
        answer += give * b;
    }
    return answer;
}