//
//  p_1929.c
//  algorithm_study_c
//
//  Created by Dukwon Nam on 2018. 1. 17..
//  Copyright © 2018년 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <string.h>

#include "p_1929.h"

#define MAX_INPUT 1000000
#define PRIME 0
#define NOT_PRIME 1

int main_1929() {
    int a, b;
    int prime_dict[MAX_INPUT];
    int i;
    
    memset(prime_dict, PRIME, sizeof(prime_dict));
    prime_dict[0] = prime_dict[1] = NOT_PRIME;
    
    // Inputs
    scanf("%d %d", &a, &b);
    
    // making prime dict
    for (i=2; i*i <= b; i++) {
        if (prime_dict[i] == PRIME) {
            for (int k=i*i; k <= b; k+=i) {
                prime_dict[k] = NOT_PRIME;
            }
        }
    }
    
    for (i=a; i <= b; i++) {
        if (prime_dict[i] == PRIME) {
            printf("%d\n", i);
        }
    }
    
    
    return 0;
}
