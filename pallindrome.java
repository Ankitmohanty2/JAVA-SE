public class Palindrome {
    public static void main(String[] args) {
        int num = 12321; // The number to check for palindrome
        int reversedNum = 0; // Variable to store the reversed number
        int originalNum = num; // Store the original number for comparison later

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number."); // If original number equals reversed number, it's a palindrome
        } else {
            System.out.println(originalNum + " is not a palindrome number."); // Otherwise, it's not a palindrome
        }
    }
}
