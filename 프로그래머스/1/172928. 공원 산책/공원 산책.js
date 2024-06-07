function solution(park, routes) {
    let answer = [0,0];
    let maxH = park.length;
    let maxW = park[0].length;
    console.log("maxH", maxH);
    console.log("maxW", maxW);
    
    for(let i = 0; i < maxH; i++){
        let isFound = false;
        for(let j = 0; j < maxW; j++){
            if(park[i][j] === 'S') {
                answer[0] = i;
                answer[1] = j;
                isFound = true;
                break;
            }
        }
        if(isFound) break;
    }
    for(let i = 0; i < routes.length; i++){
        let tmp = [...answer];
        let move = routes[i].split(" ");
        let num = Number(move[1]);

        switch(move[0]){
            case "E":
                if(answer[1] + num < maxW){
                    answer[1] += num;
                    for(let j = 1; j<=num; j++){
                        if(park[tmp[0]][tmp[1]+j] === "X"){
                            answer[1] = tmp[1];
                            break;
                        }
                    }
                    if (answer[1] === tmp[1]) break; 
                }
                break;
            case "W":
                if(answer[1] - num >= 0){
                    answer[1] -= num;
                    for(let j = 1; j<=num; j++){
                        if(park[tmp[0]][tmp[1]-j] === "X"){
                            answer[1] = tmp[1];
                            break;
                        }
                    }
                    if (answer[1] === tmp[1]) break; 
                }
                break;
            case "S":
                if(answer[0] + num < maxH){
                    answer[0] += num;
                    for(let j = 1; j<=num; j++){
                        if(park[tmp[0]+j][tmp[1]] === "X"){
                            answer[0] = tmp[0];
                            break;
                        }
                    }
                    if (answer[0] === tmp[0]) break; 
                    
                    
                }
                break;
            case "N":
                if(answer[0] - num >= 0){
                    answer[0]-=num;
                    for(let j = 1; j<=num; j++){
                        if(park[tmp[0]-j][tmp[1]] === "X"){
                            answer[0] = tmp[0];
                            break;
                        }
                    }
                    if (answer[0] === tmp[0]) break; 
                }
                break;
        }
        
    }
    
    return answer;
}
