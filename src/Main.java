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
}