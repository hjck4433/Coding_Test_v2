function solution(new_id) {
    let answer = new_id.toLowerCase();
    answer = answer.replace(/[^a-z0-9-_.]/g, '')
                    .replace(/\.{2,}/g, '.')
                    .replace(/^\.+|\.+$/g, '');
    if (answer == "") answer = "a";
    if (answer.length >= 16) answer = answer.slice(0, 15);
    answer = answer.replace(/\.$/, '');
    if(answer.length <= 2){
        for(let i = answer.length; i < 3; i++){
            answer+=answer.charAt(answer.length - 1);
        }
    }
    return answer;
}