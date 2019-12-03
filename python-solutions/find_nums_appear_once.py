#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
'''
class Solution:
    # 返回[a,b] 其中ab是出现一次的两个数字
    def FindNumsAppearOnce(self, array):
        length = len(array)
        if (length < 2): return []
        array.sort()
        res = []
        if (array[0] < array[1]): res.append(array[0])
        if (array[length - 1] > array[length - 2]): res.append(array[length - 1])
        i = 1
        while (len(res) < 2 and i < length-1):
            if (array[i] > array[i-1] and array[i] < array[i+1]): res.append(array[i])
            i += 1
        return res
            
if __name__ == "__main__":
    print Solution().FindNumsAppearOnce([1, 4, 3, 7, 2, 3, 2, 7])