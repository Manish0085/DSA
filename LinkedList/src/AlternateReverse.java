public class AlternateReverse {


    public ListNode solve(ListNode A, int B) {

        if(A == null || A.next == null || B == 1)
            return A;

        ListNode temp = A;
        while (temp != null) {
            
        }
    }

}


//        Input 1:
//
//        A = 3 -> 4 -> 7 -> 5 -> 6 -> 6 -> 15 -> 61 -> 16
//        B = 3
//        Input 2:
//
//        A = 1 -> 4 -> 6 -> 6 -> 4 -> 10
//        B = 2

//        Output 1:
//
//        7 -> 4 -> 3 -> 5 -> 6 -> 6 -> 16 -> 61 -> 15
//        Output 2:
//
//        4 -> 1 -> 6 -> 6 -> 10 -> 4
