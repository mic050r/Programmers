function solution(a, b) {
    var answer = 0;
    if(a%2!=0 && b%2!=0){ // a와 b가 모두 홀수라면 
        answer = a*a+b*b;
    }else if(a%2!=0 || b%2!=0){ // a와 b 중 하나만 홀수라면
        answer = 2*(a+b);
    }else{ // a와 b 모두 홀수가 아니라면
        answer = Math.abs(a-b);
    }
    return answer;
}