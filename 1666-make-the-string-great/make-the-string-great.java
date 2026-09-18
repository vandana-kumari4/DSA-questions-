class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();

        for (char current : s.toCharArray()) {

            if (stack.length() > 0 &&
                Character.toLowerCase(stack.charAt(stack.length() - 1)) 
                == Character.toLowerCase(current) &&
                stack.charAt(stack.length() - 1) != current) {

                stack.deleteCharAt(stack.length() - 1);

            } else {
                stack.append(current);
            }
        }

        return stack.toString();
    }
}