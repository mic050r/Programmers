function solution(sides) {
    var max = 0;
    var a = sides[0], b = sides[1], c = sides[2];
    if(a > b) max = a;
    else max = b;
    if(max < c) max = c;
    if((a+b+c) - max > max) return 1;
    else return 2;
}