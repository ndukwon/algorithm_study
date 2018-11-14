//
//  p_1149.cpp
//  algorithm_study_cpp
//
//  Created by Dukwon Nam on 14/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include "p_1149.hpp"

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
        r += std::min(curr_best_path_g, curr_best_path_b);
        g += std::min(curr_best_path_r, curr_best_path_b);
        b += std::min(curr_best_path_r, curr_best_path_g);
        
        curr_best_path_r = r;
        curr_best_path_g = g;
        curr_best_path_b = b;
    }
    
    best_path = std::min(curr_best_path_r, std::min(curr_best_path_g, curr_best_path_b));
    
    printf("%d\n", best_path);
    
    return 0;
}
