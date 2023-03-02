package com.orcircle.leetcode.editor.en;

/**
 * [1,2,4]
 * [1,3,4]
 */
class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        solution.mergeTwoLists(listNode1, listNode2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            ListNode current = new ListNode();
            ListNode result = current;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.val = list1.val;
                    list1 = list1.next;
                } else {
                    current.val = list2.val;
                    list2 = list2.next;
                }
                current.next = new ListNode();
                current = current.next;
            }
            while (list1 != null) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
                current = current.next;
            }
            while (list2 != null) {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
                current = current.next;
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}
