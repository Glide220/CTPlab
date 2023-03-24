public class Palindrome {
    //Проверка отдельно всех введеных слов с выводом результата.
    public static void main(String[] args) {
        for (String word: args) {
            String inputString = word;

            if (isPalindrome(inputString)) {
                System.out.println(inputString + " - Палиндром");
            } else {
                System.out.println(inputString + " - Не палиндром");
            }
        }
    }

    //Функция, что инвертирует строку
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //Проверка строки на Палиндром с использованием reverseString()
    public static boolean isPalindrome(String s){
        String inputString = s;
        String reversed = reverseString(inputString);
        if (inputString.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }
}
