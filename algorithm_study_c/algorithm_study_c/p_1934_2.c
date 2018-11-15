//
//  p_1934_2.c
//  algorithm_study_c
//
//  Created by Dukwon Nam on 2018. 1. 14..
//  Copyright © 2018년 Dukwon Nam. All rights reserved.
//

#include <stdio.h>

#include "p_1934.h"

/*
 input:
 10
 1 45000
 6 10
 13 17
 180 200
 18 20
 10 20
 1679 874
 3762 4047
 6080 3876
 78963 23075
 
 output:
 45000
 30
 221
 1800
 180
 20
 63802(GCD:23)
 267102(GCD:57)
 310080(GCD:76)
 1822071225(GDC:1)
 
 
 */

int find_greatest_common_divisor_2(int a, int b) {
    int x, y, temp;
    
    x = a > b ? a : b;
    y = a == x ? b : a;
    while (x > 0 && y > 0) {
        temp = y;
        y = x % y;
        x = temp;
    }
    
    return x;
}

int find_least_common_multiple_2(int a, int b) {
    return (a * b) / find_greatest_common_divisor_2(a, b);
}

int main_1934_2() {
    int test_count;
    int a, b;
    int results[1000];
    
    int i;
    
    scanf("%d", &test_count);
    for (i=0; i < test_count; i++) {
        scanf("%d %d", &a, &b);
        
        if (a%b == 0) {
            results[i] = a;
        } else if (b%a == 0) {
            results[i] = b;
        } else {
            results[i] = find_least_common_multiple_2(a, b);
        }
    }
    
    for (i=0; i < test_count; i++) {
        //printf("%d -> ", i);
        printf("%d\n", results[i]);
    }
    
    
    return 0;
}
