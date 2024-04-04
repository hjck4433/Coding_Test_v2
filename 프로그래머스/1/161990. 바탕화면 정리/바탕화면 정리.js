function solution(wallpaper) {
    let answer = [];
    let w = [];
    let h = [];
    

    for(let i = 0; i < wallpaper.length; i++) {
        for(let j =0; j < wallpaper[0].length; j++){
            if(wallpaper[i][j] == "#") {
                h.push(i);
                h.push(i+1);
                w.push(j);
                w.push(j+1);
            }
        }
    }
    
    let hMax = Math.max(...h);
    let hMin = Math.min(...h);
    let wMax = Math.max(...w);
    let wMin = Math.min(...w);
    
    answer =[hMin,wMin,hMax,wMax];
    
    return answer;
}