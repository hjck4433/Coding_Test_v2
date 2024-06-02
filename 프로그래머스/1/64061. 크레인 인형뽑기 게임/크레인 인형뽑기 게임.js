function solution(board, moves) {
    let answer = 0;
    let basket = [];
    
    for(let i = 0 ; i < moves.length; i++){
        let col = moves[i] - 1;
        for (let j = 0; j < board.length; j++){
            if(board[j][col] !== 0) {
                let doll = board[j][col];
                board[j][col] = 0;
                
                if(basket.length > 0 && basket[basket.length - 1] == doll){
                    basket.pop();
                    answer += 2;
                }else {
                    basket.push(doll);
                }
                break;
            }
        }
    }
    
    return answer;
}