#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
'''

class Solution:
    def multiply(self, A):
        B = []
        for i in range(len(A)):
            tmp = 1
            for j in (A[:i] + A[i+1:]):
                tmp *= j
            B.append(tmp)
        return B

if __name__ == "__main__":
    print Solution().multiply([1, 1, 2, 3, 4, 5])