function solution(k, score) {
    let answer = [];
    let topK = [];
    
    score.forEach(num => {
        topK.push(num);
        topK.sort((a,b) => b-a).splice(k);
        answer.push(Math.min.apply(null,topK));
    })
    
    return answer;
}