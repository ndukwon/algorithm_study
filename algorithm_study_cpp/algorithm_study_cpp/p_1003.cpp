//
//  p_1003.cpp
//  algorithm_study_cpp
//
//  Created by Dukwon Nam on 14/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include "p_1003.hpp"

using namespace std;

# define MAX_FIBONACCI 41

/*
INPUT
3
0
1
3

 */

int main_1003() {
    int count, item;
    int a, b;
    int i;
    
    int fibonacci[MAX_FIBONACCI];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    for (i = 2; i < MAX_FIBONACCI; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    
    // First line
    cin >> count;
    
    for (; count > 0; count--) {
        cin >> item;
        
        if (item == 0) {
            a = 1;
            b = 0;
        } else {
            a = fibonacci[item - 1];
            b = fibonacci[item];
        }
        cout << a << " " << b << endl;
    }
    
    return 0;
}
