#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
'''
class Solution:
    def FindNumbersWithSum(self, array, tsum):
        length = len(array)
        if (length < 2): return []
        head = 0
        tail = length - 1
        while (head < tail):
            if (array[head] + array[tail] == tsum): return [array[head],array[tail]]
            elif (array[head] + array[tail] < tsum): head += 1
            else: tail -= 1
        return []

if __name__ == "__main__":
    print Solution().FindNumbersWithSum([1, 2, 2, 3, 3, 4, 7, 7], 7)