public class Palindrome {
    static void methodPalindrome(String palindrome) {
        String lowerPalindrome = palindrome.toLowerCase();  //prevediem hodnotu String parametra na male pismena
        int len = palindrome.length();  //dlzka celeho Stringu
        StringBuilder dest = new StringBuilder(len);  //novy StringBuilder objekt dest s dlzkou length
        //dest.reverse();
        for (int i = (len - 1); i >= 0; i--) {
            dest.append(Character.toLowerCase(lowerPalindrome.charAt(i)));  //vytvorenie hodnoty pomocou append ale odzadu
        }
        if (lowerPalindrome.equals(dest.toString())) {  //ak je vstup s malymi rovny vystupu s malymi pismenami tak sa pripisu vysledky
            System.out.println(palindrome.toString() + " (this is palindrome)");
        } else {
            System.out.println(palindrome.toString() + " (this is not palindrome)");
        }
    }
//komentar na Idei2
    public static void main(String[] args) {
        String palindrome1 = "jarko";
        String palindrome2 = "Kajak a kajak";
        String palindrome3 = "Toto saS OtoT";
        String palindrome4 = "Misk";
        methodPalindrome(palindrome1);
        methodPalindrome(palindrome2);
        methodPalindrome(palindrome3);
        methodPalindrome(palindrome4);
        
        //komentar 456
    }
}
