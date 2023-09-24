public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Palindrom Sayi");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("Mukemmel Sayilar");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(1));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));
        System.out.println(isPerfectNumber(33550336));
        System.out.println("Sayilari Kelimelere Dok");
        System.out.println(numberToWords(33550336));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }
    public static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum == reversedNum ;
    }
    public static boolean isPerfectNumber(int numb) {
        if ( numb <0) return false;
        int sum = 0;
        for (int i=1; i<numb; i++) {
            if(numb%i == 0) {
                sum += i;
            }
        }
        return sum == numb;
    }

    public static String numberToWords(int numbers) {
        StringBuilder words = new StringBuilder();
        String error="Invalid Value";
        if(numbers<=0) return error;

        char[] digits = String.valueOf(numbers).toCharArray();

        for (char digit:digits) {
            switch (digit)
            {
                case '0' -> words.append("Zero ");
                case '1' -> words.append("One ");
                case '2' -> words.append("Two ");
                case '3' -> words.append("Three ");
                case '4' -> words.append("Four ");
                case '5' -> words.append("Five ");
                case '6' -> words.append("Six ");
                case '7' -> words.append("Seven ");
                case '8' -> words.append("Eight ");
                case '9' -> words.append("Nine ");
            }
        }
        return words.toString().trim();
    }
}