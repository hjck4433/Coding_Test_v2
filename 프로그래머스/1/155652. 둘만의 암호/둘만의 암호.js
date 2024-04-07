function solution(s, skip, index) {
    let answer = '';
    let alpha = ['a','b','c','d','e','f','g','h','i',
                 'j','k','l','m','n','o','p','q','r',
                's','t','u','v','w','x','y','z'];
    
    for(let i = 0; i < skip.length; i++){
        let idx = alpha.indexOf(skip[i]);
        alpha.splice(idx,1);
    }
    
    let aLen = alpha.length;
    
    for(let i =0; i < s.length; i++){
        answer += alpha[(alpha.indexOf(s[i]) + index) % alpha.length];
    } 
    
    return answer;
}