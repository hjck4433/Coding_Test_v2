function solution(cards1, cards2, goal) {
    let answer = 'Yes';
    let len = goal.length;
    for(let i = 0; i < len; i++){
        let target = goal.shift();
        if(cards1[0] == target){
            cards1.shift();
        }else if (cards2[0] == target){
            cards2.shift();
        }else if (cards1[0] != target && cards2[0] != target){
            answer = 'No';
            break;
        }
    }
    return answer;
}