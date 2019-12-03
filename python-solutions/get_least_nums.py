#!/use/bin/python2.7
# -*- coding:utf-8 -*-

'''
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
'''
class Solution:
    # see? only 3 lines
    def GetLeastNumbers_Solution(self, tinput, k):
        if len(tinput) < k: return []
        tinput.sort()
        return tinput[0:k]

if __name__ == '__main__':
    arr = [4,5,1,6,2,7,3,8]
    print Solution().GetLeastNumbers_Solution(arr, 10)