class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null;

        var prev:ListNode? = null;
        var cur = head;
        while(cur != null) {
            val next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
