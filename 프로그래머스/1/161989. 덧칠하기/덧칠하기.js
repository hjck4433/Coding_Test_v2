function solution(n, m, section) {
    let answer = 0;
    
    while(section.length >0){
        answer++;
        let a = section.shift();

        let cnt = 0;
        if(section.length > 0) {
           for(let i = 0; i < section.length; i++){
                if(section[i] < a + m) cnt++;
            }
            if (cnt >0){
                section.splice(0,cnt);
                cnt = 0;
            } 
        }
        
    }
    
    return answer;
}