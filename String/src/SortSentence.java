import java.util.Stack;

public class SortSentence {


    public static String sortSentence(String s){
        String[] ans = new String[10];
        StringBuilder temp = new StringBuilder("");
        int count = 0;
        int index = 0;
        while (index < s.length()){
            if (s.charAt(index) == ' '){
                int pos = temp.charAt(temp.length()-1) - '0';
                temp.deleteCharAt(temp.length()-1);
                ans[pos] = temp.toString();
                temp.delete(0, temp.length());
                count++;

            } else {
                temp.append(s.charAt(index));

            }
            index++;
        }
        int pos = temp.charAt(temp.length()-1) - '0';
        temp.deleteCharAt(temp.length()-1);
        ans[pos] = temp.toString();
        temp.delete(0, temp.length());
        count++;

        for (int i = 1; i <= count; i++) {
            temp.append(ans[i]);
            temp.append(" ");
        }

        temp.deleteCharAt(temp.length()-1);
        System.out.println(temp.toString());
        return temp.toString();
    }

    public static void main(String[] args) {
        sortSentence("is2 sentence4 This1 a3");
    }
}
