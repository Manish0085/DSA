public class TwoListSum {


    public ListNode sum1(ListNode l1, ListNode l2){
        int num1 = 0;
        int num2 = 0;
        int place = 1;
        while (l1 != null){
            num1 += l1.data*place;
            place *= 10;
            l1 = l1.next;
        }

        place = 1;
        while (l2 != null){
            num2 += l2.data * place;
            place *= 10;
            l2 = l2.next;
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;
        int sum = num1 + num2;
        if (sum == 0)
            return new ListNode(0);
        while (sum > 0){
            int rem = sum % 10;
            curr.next = new ListNode(rem);
            curr = curr.next;
            sum /= 10;
        }

        return head.next;

    }


    public ListNode sum2(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while (l1 != null || l2 != null){
            int x = (l1 != null)? l1.data: 0;
            int y = (l2 != null)? l2.data: 0;
            int sum = x + y + carry;
            int rem = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(rem);
            curr = curr.next;
        }

        if (carry > 0){
            curr.next = new ListNode(carry);
        }

        return head.next == null? head: head.next;
    }
}
