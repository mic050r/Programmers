#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char** solution(const char* names[], size_t names_len) {
    int len = (names_len - 1) / 5 + 1;
    char** answer = (char**)malloc(len * sizeof(char*));
    for(int i = 0; i < len; i++) answer[i] = names[i * 5];
    return answer;
}