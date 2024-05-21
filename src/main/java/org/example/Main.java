package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num){
        num =  Math.abs(num);

        char[] digits = String.valueOf(num).toCharArray();

        String reversed = "";

        for(int i = digits.length -1; i >= 0; i-- ){

            reversed += digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(num));

    }
public static boolean isPerfectNumber(int num) {
    if (num < 0)
        return false;
    //1 hepsinin böleni. o yüzdne içinde 1 olan değişken
    int sum = 1;
    //kalanı 0 verenleri bulan döngü. buldıklarını suma ekle
    //döngüde num/2 çünkü hiçbir sayı yarısından büyük sayıya tam bölünmez
    for (int i = 2; i <= num/2 ; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    if (sum == num) {
        return true;
    }
    return false;
}

public static String numberToWords(int num){
        if (num < 0){
            return "Invalid Value";
        }
        //string yap, charAt ile karaktelere ayır
    // her karakter için tanım yap
    char[] digits= String.valueOf(num).toCharArray();
        String numToText ="";
        for (char digit: digits) {
            switch (digit){
                case '0':
                    numToText += "Zero";
                case '1':
                    numToText += "One";
                case '2':
                    numToText += "Two";
                case '3':
                    numToText += "Three";
                case '4':
                    numToText += "Four";
                case '5':
                    numToText += "Five";
                case '6':
                    numToText += "Six";
                case '7':
                    numToText += "Seven";
                case '8':
                    numToText += "Eight";
                case '9':
                    numToText += "Nine";
            }

        }
    return numToText.trim();
}


}