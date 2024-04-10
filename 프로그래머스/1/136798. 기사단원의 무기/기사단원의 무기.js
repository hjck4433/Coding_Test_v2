function solution(number, limit, power) {
    let answer = 0;
    
    for (let i = 1; i <= number; i++){
        let cnt = 0;
        for (let j = 1; j <=Math.sqrt(i); j++){
            if (i % j === 0) {
                if (Math.pow(j,2) === i){
                    cnt += 1;
                }else {
                    cnt += 2;
                }
            }
        }
        answer += cnt > limit ? power: cnt;
    }
    
    return answer;
}