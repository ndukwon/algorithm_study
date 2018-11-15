//
//  p_1934.cpp
//  algorithm_study_cpp
//
//  Created by Dukwon Nam on 15/11/2018.
//  Copyright © 2018 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include "p_1934.hpp"

using namespace std;

/*
3
1 45000
6 10
13 17

 */

int find_gcd(int a, int b) {
    int temp;
    do {
        temp = a % b;
        a = b;
        b = temp;
    } while (b);
    
    return a;
}

int main_1934() {
    int count, a, b, gcd;
    
    cin >> count;
    
    while (count--) {
        cin >> a >> b;
        gcd = find_gcd(a, b);
        cout << (a * b / gcd) << endl;
    }
    
    return 0;
}
