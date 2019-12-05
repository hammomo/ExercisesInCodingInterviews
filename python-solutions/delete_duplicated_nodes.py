#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
'''
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def deleteDuplication(self, pHead):
        # write code here
        if pHead == None: return None
        if pHead.next == None: return pHead
        node_vals = {}
        curr = pHead
        while curr != None:
            if curr.val in node_vals:
                node_vals[curr.val] += 1
            else:
                node_vals[curr.val] = 1
            curr = curr.next
        curr = pHead
        tmp = pHead.next
        while tmp != None:
            if node_vals[tmp.val] > 1: curr.next = tmp.next
            else: curr = curr.next
            tmp = tmp.next
        if node_vals[pHead.val] > 1:
            return pHead.next
        return pHead

if __name__ == "__main__":
    # h = ListNode(1)
    # a = ListNode(1)
    # b = ListNode(2)
    # c = ListNode(3)
    # d = ListNode(3)
    # e = ListNode(4)
    # f = ListNode(4)
    # g = ListNode(5)
    # h.next = a
    # a.next = b
    # b.next = c
    # c.next = d
    # d.next = e
    # e.next = f
    # f.next = g
    arr = '1->2->3->3->4->4->5'.split('->')
    pHead = ListNode(arr[0])
    curr = pHead
    for i in range(1, len(arr)):
        tmp = ListNode(arr[i])
        curr.next = tmp
        curr = curr.next
    test = Solution().deleteDuplication(pHead)
    while test != None:
        print test.val
        test = test.next
    