#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.
def minimumBribes(q):
    bribeCount = 0
    
    for p in range(len(q)-1, -1, -1):
        #print(p)
        if q[p] - p - 1 > 2:
            print('Too chaotic')
            return
        for r in range(max(q[p] - 2, 0), p):
            if q[r] > q[p]:
                bribeCount += 1
    print(bribeCount)
    
if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
