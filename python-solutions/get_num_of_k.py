#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

class Solution:
    def GetNumberOfK(self, data, k):
        data.sort()
        count = 0
        for i in data:
            if i == k: count += 1
            if i > k: break
        return count