#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter

# Complete the freqQuery function below.
def freqQuery(queries):
    data = Counter()
    res = []
    count = Counter()
    
#     for i in range(len(queries)):
#         if queries[i][0] == 1:
#             if queries[i][1] in data.keys():
#                 data[queries[i][1]] += 1
#                 if data[queries[i][1]] in count:
#                     count[data[queries[i][1]]] += 1
#                     count[data[queries[i][1]] - 1] -= 1
#                 else:
#                     count[data[queries[i][1]]] = 1
#             else:
#                 data[queries[i][1]] = 1
#                 if data[queries[i][1]] in count:
#                     count[data[queries[i][1]]] += 1
#                     count[data[queries[i][1]] - 1] -= 1
#                 else:
#                     count[data[queries[i][1]]] = 1        
        
#         if queries[i][0] == 2:
#             if queries[i][1] in data:
#                 if data[queries[i][1]] <= 1:
#                     del data[queries[i][1]]
#                     count[data[queries[i][1]]] -= 1
#                 else:
#                     data[queries[i][1]] -= 1
#                     count[data[queries[i][1]]] -= 1
        
#         elif queries[i][0] == 3:
#             if queries[i][1] in count:
#                 res.append(1)
#             else:
#                 res.append(0)
#     print(count)

    for q in queries:
        if q[0] == 1:
            count[data[q[1]]] -= 1
            data[q[1]] += 1
            count[data[q[1]]] += 1
        elif q[0] == 2:
            if data[q[1]] > 0:
                count[data[q[1]]] -= 1
                data[q[1]] -= 1
                count[data[q[1]]] += 1
        else:
            if count[q[1]] > 0:
                res.append(1)
            else:
                res.append(0)
    
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    ans = freqQuery(queries)

    fptr.write('\n'.join(map(str, ans)))
    fptr.write('\n')

    fptr.close()
