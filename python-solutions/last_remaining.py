#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。
然后,他随机指定一个数m,让编号为0的小朋友开始报数。每次喊到m-1的那个小朋友要出列唱首歌,
然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
'''
class Solution:
    def LastRemaining_Solution(self, n, m):
        if (n < 1 or m < 1): return -1
        childNum = range(n)
        cur = 0
        while (len(childNum) > 1):
            for i in range(1, m): # why starts with 1, because cur has already been assigned to a number before
                cur += 1
                if (cur == len(childNum)):
                    cur = 0
            childNum.remove(childNum[cur])
            if (cur == len(childNum)): cur = 0
        return childNum[0]
        
    def LastRemaining_Solution_alterenative(self, n, m):
        if (n < 1 or m < 1): return -1
        if (n == 1): return 0
        remain = 0
        for i in range(2, n+1):
            remain = (remain + m) %i
        return remain

if __name__ == "__main__":
    print Solution().LastRemaining_Solution(6, 3)
    print Solution().LastRemaining_Solution_alterenative(6, 3)