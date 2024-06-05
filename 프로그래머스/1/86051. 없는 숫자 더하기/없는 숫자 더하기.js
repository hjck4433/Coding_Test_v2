function solution(numbers) {
    let answer = 45;
    let sum = numbers.reduce((a,b) => {return a+b},0);
    
    return answer - sum;
}