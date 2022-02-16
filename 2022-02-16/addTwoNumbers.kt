class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if(l1 == null && l2 == null) return null;

        val head = ListNode(0);
        var cur:ListNode? = head;
        var l1cur:ListNode? =l1;
        var l2cur:ListNode? =l2;
        var upper = 0;
        while(l1cur != null || l2cur != null) {
            val value = (l1cur?.`val` ?: 0) + (l2cur?.`val` ?: 0) + (cur?.`val` ?:0);
            val namuji = value % 10;
            cur?.`val` = namuji;

            l1cur = l1cur?.next;
            l2cur = l2cur?.next;

            upper = if(value / 10 > 0) 1 else 0
            cur?.next = if(upper > 0 || l1cur != null || l2cur != null) ListNode(upper) else null;
            cur = cur?.next;
        }

        return head;
    }
}
