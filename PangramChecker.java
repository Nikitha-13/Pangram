public class PangramChecker {
    public static void main(String[] args) {
        String input = "The brown dog jumps over the lazy white cat"; // Replace with your input
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];

        input = input.toLowerCase(); // Convert the input to lowercase for case-insensitivity

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Calculate the index of the letter in the alphabet (0-25)
                alphabetPresent[index] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
