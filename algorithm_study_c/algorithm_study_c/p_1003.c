//
//  p_1003.c
//  algorithm_study_c
//
//  Created by Dukwon Nam on 13/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include "p_1003.h"

#include <stdio.h>

#define MAX_FIBONACCI 41

/*
3
0
1
3

 */

int main_1003() {
    int question_count, index;
    int fibonaccis[MAX_FIBONACCI];
    int i;
    int cnt0, cnt1;
    
    fibonaccis[0] = 0;
    fibonaccis[1] = 1;
    for (i = 2; i < MAX_FIBONACCI; i++) {
        fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
    }
//    for (i = 0; i < MAX_FIBONACCI; i++) {
//        printf("%d ", fibonaccis[i]);
//    }
//    printf("\n");
    
    // First line
    scanf("%d", &question_count);
    
    for (; question_count > 0; question_count--) {
        scanf("%d", &index);
        if (index == 0) {
            cnt0 = 1;
            cnt1 = 0;
        } else {
            cnt0 = fibonaccis[index - 1];
            cnt1 = fibonaccis[index];
        }
        
        printf("%d %d\n", cnt0, cnt1);
    }
    
    return 0;
}
