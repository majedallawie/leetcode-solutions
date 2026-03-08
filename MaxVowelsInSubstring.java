public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int maxVowels = 0; // 2
        for (int i = 0; i < k; i++)
            if (isVowel(s.charAt(i)))
                maxVowels++;
        int vowels = maxVowels; // 3
        for (int i = 0, j = k; j < k; i++, j++) { // 2, 5
            if (isVowel(s.charAt(i)))
                vowels--;
            if (isVowel(s.charAt(j)))
                vowels++;
            maxVowels = Math.max(maxVowels, vowels);
            System.out.println(maxVowels);
            System.out.println(vowels);
        }
        return maxVowels;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}
