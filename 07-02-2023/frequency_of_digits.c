#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char s[1000]; 
    char d[10];
    scanf("%s", &s);
    int len = strlen(s);
    
    for (int i = 0; i < 10; i++){
        d[i] = 0;
    }
    
    for (int i = 0; i < len; i++) {
        int x = s[i] - '0';
        if (x >= 0 && x <= 9) {
            d[x]++;
        }
    }
    
    for (int i = 0; i < 10; i++) {
        printf("%d ", d[i]);
    }
    return 0;
}
