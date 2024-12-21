public class main {

    // Fungsi untuk mencetak angka dari n hingga 1
    public static void printReverse(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n);
        if (n > 1) {
            System.out.print(",");
        }
        printReverse(n - 1);
    }

    // Fungsi untuk memeriksa apakah string adalah palindrom
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    // Fungsi untuk memeriksa apakah array mengandung elemen tertentu
    public static boolean contains(int[] arr, int n, int target) {
        if (n <= 0) {
            return false;
        }
        if (arr[n - 1] == target) {
            return true;
        }
        return contains(arr, n - 1, target);
    }

    // Fungsi untuk menemukan nilai maksimum dalam array menggunakan rekursi
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    // Fungsi untuk deret SumOfThree
    public static void sumOfThree(int n, int a, int b, int c) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        result[2] = c;

        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        System.out.print("Print Reverse: ");
        printReverse(5);
        System.out.println();

        String testString = "katak";
        System.out.println("Is Palindrome: " + isPalindrome(testString, 0, testString.length() - 1));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Contains 3: " + contains(arr, arr.length, 3));
        System.out.println("Contains 6: " + contains(arr, arr.length, 6));

        int[] maxArray = {1, 3, 5, 7, 2};
        System.out.println("Max Value: " + findMax(maxArray, maxArray.length));

        System.out.print("Sum Of Three: ");
        sumOfThree(5, 1, 1, 1);
    }
}