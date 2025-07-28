public class AddStrings {

    public String add(String s1, String s2){
        int idx1 = s1.length()-1;
        int idx2 = s2.length()-1;
        int carry = 0;
        int sum = 0;
        StringBuilder ans = new StringBuilder();
        while(idx2 >= 0){
            sum = (s1.charAt(idx1) - '0') + (s2.charAt(idx2) - '0') + carry;
            carry = sum / 10;
            char ch = (char)('0' + (sum % 10));
            ans.append(ch);
            idx1--; idx2--;
        }

        while(idx1 >= 0){
            sum = (s1.charAt(idx1) - '0') + carry;
            carry = sum / 10;
            char ch = (char)('0' + (sum % 10));
            ans.append(ch);
            idx1--;
        }

        if(carry > 0){
            ans.append('1');
        }
        return ans.reverse().toString();
    }

    public  String addStrings(String s1, String s2){


        if(s1.length() > s2.length()){
            return add(s1, s2);
        } else {
            return add(s2, s1);
        }

    }
}
