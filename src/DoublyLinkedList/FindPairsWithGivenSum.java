package DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindPairsWithGivenSum {

    public ArrayList<ArrayList<Integer>> findPair(Node head, int sum){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node temp1 = head;
        while (temp1 != null ){
            Node temp2 = temp1.next;
            while (temp2 != null && temp1.data + temp2.data <= sum){
                if (temp1.data + temp2.data == sum){
                    list.add(new ArrayList<>(List.of(temp1.data, temp2.data)));
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> optimised(Node head, int sum){
        if (head == null)
            return null;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Node left = head;
        Node right = head;
        while (right.next != null)
            right = right.next;

        while (left.data < right.data){
            if (left.data + right.data == sum){
                list.add(new ArrayList<>(List.of(left.data, right.data)));
            }
            else if (left.data + right.data > sum){
                right = right.back;
            }
            else {
                left = left.next;
            }
        }
        return list;
    }
}
