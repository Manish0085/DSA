import java.util.ArrayList;
import java.util.List;

public class CheckPalindromeLinkedList {


    // S.C: O(n)
    public boolean isPalindrome1(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        int start = 0;
        int end = list.size()-1;
        while (start < end){
            if (list.get(start) != list.get(end))
                return false;
        }

        return true;
    }



    public boolean isPalindrome2(Node head){
        if (head == null || head.next == null){
            return true;
        }

        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        count /= 2;
        Node curr = head;
        Node pre = null;
        for (int i = 0; i < count; i++) {
            pre = curr;
            curr = curr.next;
        }

        pre.next = null;

        Node secondHead = reverse(curr, null);
        Node firstHead = head;
        while(firstHead != null){
            if (firstHead.data != secondHead.data)
                return false;

            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }


        return true;
    }

    private Node reverse(Node head, Node pre){
        if(head == null){
            return pre;
        }

        Node fut = head.next;
        head.next = pre;
        return reverse(fut, head);

    }
}
