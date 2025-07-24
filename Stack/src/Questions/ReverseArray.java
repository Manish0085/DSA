package Questions;

import java.util.Stack;

public class ReverseArray {


    public void reverse(char[] arr){
        Stack<Character> st = new Stack<>();
        for (char ch: arr){
            st.push(ch);
        }
        for (int i=0; i< arr.length; i++){
            arr[i] = st.pop();
        }
    }
}
