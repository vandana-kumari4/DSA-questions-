class Solution {
    public String reformat(String s) {

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        // Separate letters and digits
        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                digits.append(ch);
            }
        }

        // If difference is more than 1, impossible
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        // If letters are more, start with letter
        if (letters.length() >= digits.length()) {

            for (int i = 0; i < letters.length(); i++) {

                result.append(letters.charAt(i));

                if (i < digits.length()) {
                    result.append(digits.charAt(i));
                }
            }

        } else {

            // If digits are more, start with digit
            for (int i = 0; i < digits.length(); i++) {

                result.append(digits.charAt(i));

                if (i < letters.length()) {
                    result.append(letters.charAt(i));
                }
            }
        }

        return result.toString();
    }
}