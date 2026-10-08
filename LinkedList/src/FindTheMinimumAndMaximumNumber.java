import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindTheMinimumAndMaximumNumber {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head. next == null || head.next.next == null)
            return new int[]{-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        while (curr != null  && curr.next != null)  {
            if (prev.val < curr.val && curr.val > curr.next.val) {
                list.add(idx);
            } else if (prev.val > curr.val && curr.val < curr.next.val) {
                list.add(idx);
            }
            prev = prev.next;
            curr = curr.next;
            idx++;
        }
        if (list.size() < 2) {
            return new int[]{-1, -1};
        }
        int minDis = Integer.MAX_VALUE;
        for (int i = 1; i <list.size() ; i++) {
            minDis = Math.min(minDis, list.get(i) - list.get(i-1));;
        }
        int maxDis = list.get(list.size()-1) - list.get(0);
        return new int[]{minDis, maxDis};
    }

    public int[] nodesBetweenCriticalPoints2(ListNode head) {
        if (head == null || head. next == null || head.next.next == null)
            return new int[]{-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 0;
        int firstCritical = -1;
        int minDis = Integer.MAX_VALUE;
        int lastCritical = -1;
        while (curr != null  && curr.next != null)  {
            boolean isCritical = (prev.val < curr.val && curr.val > curr.next.val) ||
                    (prev.val > curr.val && curr.val < curr.next.val);

            if (isCritical) {
                if (firstCritical != -1) {
                    minDis = Math.min(minDis, idx - lastCritical);
                } else {
                    firstCritical = idx;
                }
                lastCritical = idx;
            }
            prev = prev.next;
            curr = curr.next;
            idx++;
        }
        if (firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        return new int[]{minDis, lastCritical - firstCritical};
    }
}
