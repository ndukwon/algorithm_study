//
//  p_1149.c
//  algorithm_study_c
//
//  Created by Dukwon Nam on 14/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include "p_1149.h"

/*
3
26 40 83
49 60 57
13 89 99

 */

int main_1149() {
    int count, r, g, b;
    int curr_best_path_r, curr_best_path_g, curr_best_path_b, best_path;
    
    // First line
    scanf("%d", &count);
    
    curr_best_path_r = curr_best_path_g = curr_best_path_b = 0;
    while (count--) {
        scanf("%d %d %d", &r, &g, &b);
        
        r += (curr_best_path_g < curr_best_path_b ? curr_best_path_g : curr_best_path_b);
        g += (curr_best_path_r < curr_best_path_b ? curr_best_path_r : curr_best_path_b);
        b += (curr_best_path_r < curr_best_path_g ? curr_best_path_r : curr_best_path_g);
        
        curr_best_path_r = r;
        curr_best_path_g = g;
        curr_best_path_b = b;
    }
    best_path = (curr_best_path_g < curr_best_path_b ? curr_best_path_g : curr_best_path_b);
    best_path = (best_path < curr_best_path_r ? best_path : curr_best_path_r);
    printf("%d\n", best_path);
    return 0;
}
