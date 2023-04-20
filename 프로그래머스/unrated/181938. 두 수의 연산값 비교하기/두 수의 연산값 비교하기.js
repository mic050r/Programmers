function solution(a, b) {
    var sum1 = Number(a.toString()+ b.toString());
    var sum2 = 2*a*b;
    return sum1 > sum2 ?  sum1 : sum2;
}