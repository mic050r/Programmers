function solution(myString, pat) {
    myString = myString.toLowerCase();
    pat = pat.toLowerCase();
    // if(myString.length < pat.length) return 0;
    if(myString.includes(pat)) return 1;
    else return 0;
}