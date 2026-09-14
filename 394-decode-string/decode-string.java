class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int num = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(num);
                stringStack.push(current);

                num = 0;
                current = new StringBuilder();

            } else if (ch == ']') {

                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                for (int j = 0; j < repeat; j++) {
                    previous.append(current);
                }

                current = previous;

            } else {

                current.append(ch);
            }
        }

        return current.toString();
    }
}