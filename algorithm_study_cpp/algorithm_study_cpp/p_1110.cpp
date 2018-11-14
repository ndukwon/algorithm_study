//
//  p_1110.cpp
//  algorithm_study_cpp
//
//  Created by Dukwon Nam on 14/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include "p_1110.hpp"

using namespace std;

int main_1110() {
    int given, count, generated;
    int first, second;
    
    cin >> given;
    count = 0;
    generated = given;
    while (true) {
        count++;
        first = generated / 10;
        second = generated % 10;
        generated = (second * 10) + ((first + second) % 10);
        
        if (generated == given) {
            break;
        }
    }
    cout << count << endl;
    
    return 0;
}
