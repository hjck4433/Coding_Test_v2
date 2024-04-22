function solution(k, d) {

    function equation(x) {
        return Math.sqrt(d * d - x * x);
    }
    let result = 0;
    for (let i = 0; i <= d; i += k) {
        const y = equation(i);
        result += Math.floor(y / k) + 1;
    }

    return result;
    
}