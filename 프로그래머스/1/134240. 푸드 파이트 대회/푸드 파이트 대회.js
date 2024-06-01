function solution(food) {
    let answer = '0';
    for(let i = food.length-1; i > 0; i--){
        let repeat = i.toString().repeat(food[i] / 2);
        answer = repeat + answer;
        answer = answer + repeat;
    }
    return answer;
}