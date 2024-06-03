function solution(n, lost, reserve) {
    let answer = 0;
    let s = new Array(n).fill(1);
    
    for (let i = 0; i < lost.length; i++){
        s[lost[i] -1] -= 1;
    }
    
    reserve.sort((a,b) => a -b);
    
    for(let i = 0; i < reserve.length; i++){
        let idx = reserve[i] - 1;
        if(s[idx] == 0){
            s[idx] = 1;
        }else if (idx > 0){
            if (lost.includes(idx+1))continue;
            
            if(s[idx-1] == 0) s[idx-1] = 1;
            else if(idx < n-1 && s[idx+1] == 0) s[idx+1] = 1;
        }else if (idx == 0 && s[idx + 1] == 0){
            s[idx+1] = 1;
        }
        
    }
    
    answer = s.reduce((a,b) => a+b,0);
    
    return answer >= n ? n : answer;
}