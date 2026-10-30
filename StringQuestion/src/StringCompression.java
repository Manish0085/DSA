public class StringCompression {

    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char ch = chars[read];
            int start = read;

            while (read < chars.length && chars[read] == ch) {
                read++;
            }

            int count = read-start;
            chars[write++] = ch;

            if (count > 1) {
                for(char digits: String.valueOf(count).toCharArray()) {
                    chars[write++] = digits;
                }
            }
        }
        return write;
    }
}
