package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintBracketNumber {




    public List<Integer> printBracket(String str){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                count++;
                stack.push(count);
                list.add(count);
            } else if (str.charAt(i) == ')'){
                list.add(stack.pop());
            }
        }
        return list;
    }
}
