package Task;

public class ReverseLetters {

    public static String reverseLetters(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.isLetter(chars[left]) &&
                    Character.isLetter(chars[right])) {

                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            } else if (!Character.isLetter(chars[left])) {
                left++;
            } else {
                right--;
            }
        }

        return new String(chars);
    }
}

