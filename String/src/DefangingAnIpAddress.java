public class DefangingAnIpAddress {


    // T.C:- O(n)
    // S.C:- O(n)
    public static String defangIPAdd1(String address) {
        StringBuilder ans = new StringBuilder(address);
        int index = 0;
        while(index < ans.length()){
            if(ans.charAt(index) == '.'){
                ans.replace(index, index+1, "[.]");
                index++;
            }
            index++;
        }
        System.out.println(ans);
        return ans.toString();
    }

    public static String defangIPAdd2(String address) {
        StringBuilder ans = new StringBuilder("");
        int index = 0;
        while(index < address.length()){
            if(address.charAt(index) == '.'){
                ans.append("[.]");
            } else {
                ans.append(address.charAt(index));
            }
            index++;
        }
        System.out.println(ans);
        return ans.toString();
    }


    public static void main(String[] args) {
        defangIPAdd2("255.100.25.60");
    }
}
