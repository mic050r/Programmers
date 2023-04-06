#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    double total = 0;
    for(int i = 0; i < numbers_len; i++){
        total += numbers[i];
    }
    return total/numbers_len;
}