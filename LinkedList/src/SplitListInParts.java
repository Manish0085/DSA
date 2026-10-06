public class SplitListInParts {

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int noOfSplits = length/k;
        int noOfExtraSplits = length%k;

        temp = head;
        for (int i = 0; i < k; i++) {
            ans[i] = temp;
            int nodes = noOfSplits + (noOfExtraSplits > 0 ? 1: 0);

            if(noOfExtraSplits > 0) {
                noOfExtraSplits--;
            }
            if (nodes == 0)
                break;
            for (int j = 1; j < nodes; j++) {
                temp = temp.next;
            }
            ListNode nextSplit = temp.next;
            temp.next = null;
            temp = nextSplit;
        }
        return ans;
    }

}
