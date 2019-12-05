#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
'''
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def Print(self, pRoot):
        if not pRoot: return []
        nodeStack = [pRoot]
        result = []
        while nodeStack:
            res = []
            nextStack = []
            for node in nodeStack:
                res.append(node.val)
                if node.left: nextStack.append(node.left)
                if node.right: nextStack.append(node.right)
            result.append(res)
            nodeStack = nextStack
        final = []
        for i, v in enumerate(result):
            if i%2 == 0: final.append(v)
            else: final.append(v[::-1])
        return final
            
