function solution(t, p) {
    let answer = 0;
    let len = p.length;
    let pNum = Number(p);
    for (let i = 0; i < t.length; i++){
        let tmp = t.substring(i,i+len);
        if(Number(tmp) <= pNum) {
            if(tmp.length < len) break;
            answer++;
        }      
    }
    
    return answer;
}