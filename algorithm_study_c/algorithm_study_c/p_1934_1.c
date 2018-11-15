//
//  p_1934.c
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

int find_greatest_common_divisor(int a, int b) {
    int i, max_count;
    int quotient_of_a, quotient_of_b;
    int common_divisors[450001], common_divisor_pointer = 0;
    int greatest_common_factor = 1;
    
    max_count = a < b ? a : b;
    max_count = max_count/2 + 1;
    
    quotient_of_a = a;
    quotient_of_b = b;
    for (i=2; i < max_count; i++) {
        while (quotient_of_a%i == 0 && quotient_of_b%i == 0) {
            quotient_of_a /= i;
            quotient_of_b /= i;
            common_divisors[common_divisor_pointer++] = i;
        }
    }
    
    for (i=0; i < common_divisor_pointer; i++) {
        greatest_common_factor *= common_divisors[i];
    }
    
    return greatest_common_factor;
}

int find_least_common_multiple(int a, int b) {
    return (a * b) / find_greatest_common_divisor(a, b);
}

int main_1934() {
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
            results[i] = find_least_common_multiple(a, b);
        }
    }
    
    for (i=0; i < test_count; i++) {
        //printf("%d -> ", i);
        printf("%d\n", results[i]);
    }
    
    
    return 0;
}
