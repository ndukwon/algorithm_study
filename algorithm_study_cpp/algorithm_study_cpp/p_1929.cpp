//
//  p_1929.cpp
//  algorithm_study
//
//  Created by Dukwon Nam on 2018. 1. 17..
//  Copyright © 2018년 Dukwon Nam. All rights reserved.
//

#include <stdio.h>
#include <iostream>
#include <string.h>

#include "p_1929.hpp"

using namespace std;

#define PRIME 0
#define NOT_PRIME 1

int main_1929() {
    int a, b;
    cin >> a >> b;
    
    int prime_cache[b + 1];
    memset(prime_cache, PRIME, sizeof(prime_cache));
    prime_cache[0] = prime_cache[1] = NOT_PRIME;
    
    for (int i=2; i*i <= b; i++) {
        if (prime_cache[i] == PRIME) {
            for (int k=i*i; k <= b; k+=i) {
                prime_cache[k] = NOT_PRIME;
            }
        }
    }
    
    for (int i=a; i <= b; i++) {
        if (prime_cache[i] == PRIME) {
            cout << i << "\n";
        }
    }
    
    return 0;
}
