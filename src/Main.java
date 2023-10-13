import java.util.LinkedList;



class Solution {
    // Add Two Numbers (Java improved)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList ans = new LinkedList<>();

        while(l1 != null && l2 != null){
            ListNode lagg = new ListNode;
            ListNode lead = lagg;
            lead = l1.val + l2.val;
            if(lead.val > 9){
                lagg.val += lead.val/10;
                lead.val %= 10;
            }
        }
    }
}


// misunderstood, the nodes start at 1's place then tens etc, so we just can sum, carry val forrward
// don't eveen need to rev

// lead and lagg for carrying digit to next place
// lag 

// problem whn not just one digit place like
// 8 9 9
// 1 0 1  will == 1000 but need to carry back 2 places so just 1 lag behind won't work


// what about lag variable pausig if val of 9 and lag of lagg to update the prior place nope