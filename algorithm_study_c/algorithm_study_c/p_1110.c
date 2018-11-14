//
//  p_1110.c
//  algorithm_study_c
//
//  Created by Dukwon Nam on 2018. 1. 31..
//  Copyright © 2018년 Dukwon Nam. All rights reserved.
//

#include <stdio.h>

#include "p_1110.h"

int main_1110() {
    int given, count, generated, first, second;
    
    // First line
    scanf("%d", &given);
    
    count = 0;
    generated = given;
    while (1) {
        count++;
        first = generated / 10;
        second = generated % 10;
        generated = (second * 10) + ((first + second) % 10);
        
        if (generated == given) {
            break;
        }
    }
    printf("%d\n", count);
    
    return 0;
}
