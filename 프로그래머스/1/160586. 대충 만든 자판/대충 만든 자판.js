function solution(keymap, targets) {
    let answer = [];
    
    for(let i = 0; i < targets.length; i++){
        let cnt = 0;
        for(let j = 0; j < targets[i].length; j++){
            let tmp = keymap[0].indexOf(targets[i][j]) + 1;

            for(let k = 0; k < keymap.length; k++){
                let idx = keymap[k].indexOf(targets[i][j]) + 1;

                if (idx != 0){
                    if(tmp == 0 || idx < tmp){
                        tmp = idx;
                    }
                }
            }
            if (tmp ==  0) {
                cnt = -1;
                break;
            }else {
                cnt += tmp;
            }

        }
        answer[i] = cnt;
    }
    
    return answer;
}