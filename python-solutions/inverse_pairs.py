#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
即输出P%1000000007
'''
class Solution:
    count = 0

    def InversePairs(self, data):
        self.MergeSort(data)
        return self.count % 1000000007

    def MergeSort(self, lists):
        if len(lists) <= 1:
            return lists
        num = len(lists)/2
        left = self.MergeSort(lists[:num])
        right = self.MergeSort(lists[num:])
        r, l=0, 0
        result=[]
        while l<len(left) and r<len(right):
            if left[l] <= right[r]:
                result.append(left[l])
                l += 1
            else:
                result.append(right[r])
                r += 1
                self.count += len(left)-l # the rest of the left list all > the right
        result += left[l:]
        result += right[r:]
        return result
    

if __name__ == '__main__':
    print Solution().InversePairs([1,2,3,4,5,6,7,0])